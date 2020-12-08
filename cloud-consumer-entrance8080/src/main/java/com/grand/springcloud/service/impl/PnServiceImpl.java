package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.entity.tiptop.PO;
import com.grand.springcloud.service.PnService;
import com.grand.springcloud.utils.ServiceSqlserverApi;
import com.grand.springcloud.utils.ServiceSupplierApi;
import com.grand.springcloud.utils.ServiceTiptopApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/10/29 10:58
 **/
@Service
public class PnServiceImpl implements PnService
{

    @Resource
    private RestTemplate restTemplate;

//    //内容提供者,
//    @Value("${service-url.nacos-supplier-service}")
//    private String supplierURL;

    @Resource
    ServiceSupplierApi supplierApi;

    @Resource
    ServiceTiptopApi serviceTiptopApi;
    //@Resource




    @Override
    public Map PnList(PN pn, PNSub pnSub, int pageSize, int pageNumber)
    {
        Map result = new HashMap();
        //Post 传递，有map 默认包换 url，data 两个值
        Map map  = supplierApi.pnList(pn,pnSub,pageSize,pageNumber);

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

        return result;
    }

    @Override
    public Map PoList(PO po, int pageSize, int pageNumber)
    {
        Map result = new HashMap();
        //region 准备数据
//        StringBuilder filter = new StringBuilder();
//
//        if(po!=null && po.getPmm01()!=null && !"".equals(po.getPmm01()))
//        {
//            filter.append(" pmm01 like '%"+po.getPmm01()+"%' ");
//        }
//        if(po!=null && po.getPmm04() != null && !"".equals(po.getPmm04()))
//        {
//            if(filter.length()>1) filter.append(" and ");
//            filter.append(" pmn04 like '%"+po.getPmn04()+"%' ");
//        }
//        if(po!=null && po.getPmm09() !=null && !"".equals(po.getPmm09()))
//        {
//            if(filter.length()>1) filter.append(" and ");
//            filter.append(" ( pmm09 = '"+po.getPmm09()+"' or pmm50 = '"+po.getPmm09()+"' ) ");
//        }
        //endregion

        //调用tiptop获取数据 list ，totalRecordCount
        Map map = supplierApi.poList(po,pageSize,pageNumber);

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
        return result;


    }


}
