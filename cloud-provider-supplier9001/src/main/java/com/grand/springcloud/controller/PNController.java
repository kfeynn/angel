package com.grand.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.helper.RDBSHelper;
import com.grand.springcloud.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/10/28 17:16
 **/
@RestController
@RequestMapping("/PN")
public class PNController
{
    @Resource
    RDBSHelper rdbsHelper;
    @Resource
    CommonMapper commonMapper;

    //@RequestMapping("/PnList")
    @RequestMapping(value="pnList", method= RequestMethod.POST)
    public CommonResult pnList(@RequestBody Map<String, Object> mapq) throws IOException
    {
        CommonResult commonResult = null;

        //user = (XpGridUser)result.getData();  //这样错，报linkedhashmap不能转XpGridUser

        //CommonResult 泛型T转实体类
//        String jsonString= JSON.toJSONString(result.getData());
//        user = JSON.parseObject(jsonString, XpGridUser.class);

        //获取传入的参数

//        PN pn = mapq.get("pn")==null? null:(PN)mapq.get("pn") ;
//        PNSub  pnSub = mapq.get("pnSub")==null? null:(PNSub)mapq.get("pnSub") ;

        PN pn = mapq.get("pn")==null? null: JSON.parseObject(JSON.toJSONString(mapq.get("pn")), PN.class) ;
        PNSub  pnSub = mapq.get("pnSub")==null? null:JSON.parseObject(JSON.toJSONString(mapq.get("pnSub")), PNSub.class)  ;


        //页尺寸
        int pageSize = mapq.get("pageSize")==null? 15:(int)mapq.get("pageSize");
        //页码
        int pageNumber = mapq.get("pageNumber")==null? 1:(int)mapq.get("pageNumber");


        if (pn == null)
        {
            pn = new PN();
        }
        if(pnSub == null)
        {
            pnSub = new PNSub();
        }
        if (pageSize <= 0)
            //防止除0操作
            pageSize = 1;

        //region 查询条件
        String filter = "";


        filter = "where 1=1";
        if (pn.getDnnum() != null && !"".equals(pn.getDnnum()))
        {
            if (filter.length() > 1)
            {
                filter += " and ";
            }
            filter += " DNNUM  like '%" + pn.getDnnum() + "%'";
        }
        if (pn.getSupid() != null && !"".equals(pn.getSupid()))
        {
            if (filter.length() > 1)
            {
                filter += " and ";
            }
            filter += " SUPID  = '" + pn.getSupid() + "'";
        }
        if (pn.getName() != null && !"".equals(pn.getName()))
        {
            if (filter.length() > 1)
            {
                filter += " and ";
            }
            filter += " NAME  like '%" + pn.getName() + "%'";
        }
        if (pn.getPlant() != null && !"".equals(pn.getPlant()))
        {
            if (filter.length() > 1)
            {
                filter += " and ";
            }
            filter += " PLANT  like '%" + pn.getPlant() + "%'";
        }
        if (pn.getPmn33() != null && !"".equals(pn.getPmn33()))
        {
            if (filter.length() > 1)
            {
                filter += " and ";
            }
            filter += " PMN33  = '" + pn.getPmn33() + "'";
        }
        if (pnSub.getPmm01() != null && !"".equals(pnSub.getPmm01()))
        {
            if (filter.length() > 1)
            {
                filter += " and ";
            }
            filter += "  dnnum in (select sdnnum from pnsub where pmm01 like '%" + pnSub.getPmm01() + "%' ) ";
        }
        if (pnSub.getPmn04() != null && !"".equals(pnSub.getPmn04()))
        {
            if (filter.length() > 1)
            {
                filter += " and ";
            }
            filter += "  dnnum in (select sdnnum from pnsub where pmn04 like '%" + pnSub.getPmn04() + "%' ) ";
        }
        //endregion

        //获取数据
        int totalpage = 0;
        int totalRecord = 0;
        Map map = rdbsHelper.ExecutePaging("PN", "pmn33 desc,dnnum asc", filter, pageSize, pageNumber, totalRecord);
        //List<LinkedHashMap<String,Object>>  list   = (List<LinkedHashMap<String,Object>>)map.get("list");
        List<PN> pnList = (List<PN>) map.get("list");
        //利用Json强转LinkedHashMap 成对象 PN
        pnList = JSON.parseArray(JSON.toJSONString(pnList), PN.class);
        totalRecord = (int) map.get("totalRecord");

        Map result = new HashMap();

        result.put("pnList",pnList);
        result.put("totalRecord",totalRecord);

        //region 子表数据
        String subFilter = "";
        for (PN p : pnList)
        {
            if (subFilter.length() > 1)
            {
                subFilter += ",";
            }
            subFilter += "'" + p.getDnnum() + "'";
        }
        if (subFilter.length() > 1)
        {
            subFilter = " sdnnum in (" + subFilter + ") ";
        }
        //List<PNSUB> pnSubList = new List<PNSUB>();
        List<PNSub> subList = null;
        List<LinkedHashMap<String, Object>> pnSubList = null;
        if (!"".equals(subFilter ))
        {
            String cmdStr = "select * from pnsub where 1=1 and  " + subFilter;
            pnSubList = commonMapper.commonSelect(cmdStr);
            //List<PNSUB> subList = null;
            //利用Json强转LinkedHashMap 成对象 PNSUB 方便前台点出方法
            subList = JSON.parseArray(JSON.toJSONString(pnSubList), PNSub.class);
            //model.addAttribute("pnSubList", subList);
        } else
        {
            //model.addAttribute("pnSubList", null);
        }
        //endregion

        result.put("pnSubList",subList);



        commonResult= new CommonResult<>(200,"成功",result);
        return commonResult;
    }



}
