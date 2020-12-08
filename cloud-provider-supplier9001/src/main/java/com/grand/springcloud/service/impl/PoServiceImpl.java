package com.grand.springcloud.service.impl;

import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.tiptop.PO;
import com.grand.springcloud.service.PnService;
import com.grand.springcloud.service.PoService;
import com.grand.springcloud.utils.ServiceTiptopApi;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/11/23 9:11
 **/
@Service
public class PoServiceImpl implements PoService
{
    @Resource
    private RestTemplate restTemplate;
    @Resource
    ServiceTiptopApi  serviceTiptopApi;
    @Resource
    PnService pnService;

    @Override
    public Map getPOList(PO po, int pageSize, int pageNumber)
    {
        Map result = new HashMap();
        //调用tiptop获取数据 list ，totalRecordCount
        Map map = serviceTiptopApi.poList(po,pageSize,pageNumber);
        String url="";
        Map data = new HashMap();
        if(map!=null)
        {
            url = map.get("url")==null? "":map.get("url").toString();
            data = map.get("data") ==null? null:(HashMap)map.get("data");
        }
        CommonResult result1 = restTemplate.postForObject(url,data,CommonResult.class);
        if (result1 !=null && 200 == result1.getCode() && result1.getData() != null)
        {
            result = (HashMap)result1.getData();
        }
        //获取到了 tiptop 数据后 ，需要 根据本地数据库supplier 再加工（减去已打印数量）
        // 利用Json强转LinkedHashMap 成对象 PO
        List<PO> poList = JSON.parseArray(JSON.toJSONString(result.get("list")), PO.class);
        poList = dealPoList(po,poList);
        result.remove("list");
        result.put("list",poList);
        return result;
    }

    /** 处理从服务器中取来的待交数量  */
    public List<PO> dealPoList(PO po,List<PO> poList)
    {
        //获取 查询条件(po) 信息，尽可能检查查询范围
        List<LinkedHashMap<String,Object>> onwayPo = pnService.getOnwayPO(po);

        //region
//        System.out.println("============begin ===========");
//        for (LinkedHashMap<String, Object> m : list)
//        {
//            System.out.println("-----------begin  ----------");
//            for (String k : m.keySet())
//            {
//                System.out.println(k + " : " + m.get(k));
//            }
//            System.out.println("-----------end  ----------");
//        }
//        System.out.println("============end ===========");

        //endregion

        //待交数量 需要 减去 在途数量。
        long start = System.nanoTime();

        long icount = 0;

        for (PO p : poList)
        {
            String pmm01 = p.getPmm01();
            int pmn02 = p.getPmn02();
            //String pmm09 = p.getPmm09();  //供应商编号
            //wade 可打印数量  wade1 未交量
            Double wade = p.getWdve();
            Double unreceive = 0.0;
            //Double unreceive = printService.queryUnreveiceDn(pmm01, String.valueOf(pmn02), supid);

            if(onwayPo!=null)
            {
                String l_pmm01 = "";
                String l_pmn02 = "";
                Double l_pmn20 = 0.0;
                for (LinkedHashMap<String, Object> m : onwayPo)
                {
                    for (String k : m.keySet())
                    {
                        if("PMM01".equals(k))
                        {
                            l_pmm01 = m.get(k).toString();
                        }
                        if("PMN02".equals(k))
                        {
                            l_pmn02 = m.get(k).toString();
                        }
                        if("PMN20".equals(k))
                        {
                            l_pmn20 = Double.valueOf(m.get(k).toString());
                        }

                        icount ++ ;
                        //System.out.println(k + " : " + m.get(k));
                    }
                    if(pmm01.equals(l_pmm01) && String.valueOf(pmn02).equals(l_pmn02))
                    {
                        unreceive = l_pmn20 ;
                    }
                }

            }



            if (unreceive > 0)
            {
                wade = wade - unreceive;
            }
            //更改值
            p.setWdve(wade);
        }

        long end = System.nanoTime();
        System.out.println("耗时2：" + (end - start));  //纳秒 10亿分之1
        System.out.println("循环次数：" + (icount));

        return poList;
    }



    /** 处理从服务器中取来的待交数量  */
//    public String dealPotemp(String potemp)
//    {
//        String repotemp = potemp ;
//        //待交数量 需要 减去 在途数量。
//
//        //查询在途数量  printService.queryUnreveiceDn(pmm01, pmn02, potemp)
//
//        int tlen = potemp.length();
//
//        int beginIndex = 0;
//        int endIndex = 0;
//        //截取订单号
//        beginIndex = potemp.indexOf("POlist",beginIndex) + 8;
//        endIndex = 	potemp.indexOf("POpage",beginIndex) - 2;
//
//        if(endIndex > tlen){endIndex = tlen;}
//
//        if(beginIndex > 2 && endIndex > beginIndex)
//        {
//            //头 ，中间，尾
//            String sHead ="";
//            String sBody ="";
//            String sEnd ="";
//
//            sHead = potemp.substring(0, beginIndex);
//            sBody = potemp.substring(beginIndex, endIndex);
//            sEnd =potemp.substring(endIndex);
//
//            //String 转 List
//            poList = JSONArray.parseArray(sBody, PO.class);
//
//            for (PO p:poList)
//            {
//                String pmm01= p.getPmm01();
//                int pmn02= p.getPmn02();
//                String pmm09 = p.getPmm09();  //供应商编号
//
//                //wade 可打印数量  wade1 未交量
//                Double wade = p.getWdve();
//
//                //增加字段wade1 保存原先的 未交量数据并显示。
//                //p.setWdve1(wade);
//
//                //Double unreceive = printService.queryUnreveiceDn(pmm01, String.valueOf(pmn02), supid);
//                Double unreceive = printService.queryUnreveiceDn(pmm01, String.valueOf(pmn02), pmm09);
//
//                if(unreceive >0)
//                {
//                    wade = wade - unreceive ;
//                }
//                if(wade < 0)
//                {
//                    //已收货确没有及时更新，有可能出现负数。设置为0就好，不影响什么
//                    //wade = 0.0 ;
//                }
//                //更改值
//                p.setWdve(wade);
//            }
//
//            //List 转回 String
//            sBody = JSONObject.toJSONString(poList);
//
//            repotemp = "";
//            repotemp = sHead + sBody + sEnd ;
//        }
//        return repotemp;
//    }
//






}
