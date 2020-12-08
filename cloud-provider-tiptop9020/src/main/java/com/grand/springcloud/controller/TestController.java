package com.grand.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.helper.RDBSHelper;
import com.grand.springcloud.service.BreService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/9/11 10:29
 **/
@RestController
public class TestController
{
    @Resource
    RDBSHelper rdbsHelper;
    @Resource
    BreService breService;


    @RequestMapping("/getBreJson/{bre01}")
    @ResponseBody
    public String getBreJson(@PathVariable("bre01")  String bre01)
    {
        String aa = "";
        CommonResult result = null;
        try
        {
            Map map = breService.getBreInfo(bre01);

           // String aa  = JSON.toJSONString(map);

            String dateformat = "yyyy-MM-dd HH:mm:ss";

            aa  =  JSON.toJSONStringWithDateFormat(map,dateformat, SerializerFeature.WriteDateUseDateFormat);
            //利用Json强转LinkedHashMap 成对象 PNSUB 方便前台点出方法
            //subList = JSON.parseArray(JSON.toJSONString(pnSubList), PNSub.class);

            result = new CommonResult<>(200, "成功9002" ,aa  );
        }
        catch (Exception ex)
        {
            result = new CommonResult<>(400,"失败9002",ex.getMessage());
        }
        return  aa;
    }

    @RequestMapping("/getRvbsJson/{rvbs01}")
    @ResponseBody
    public String getRvbsJson(@PathVariable("rvbs01")  String rvbs01)
    {
        String aa = "";
        CommonResult result = null;
        try
        {
            Map map = breService.getRvbsInfo(rvbs01);

            String dateformat = "yyyy-MM-dd HH:mm:ss";

            aa  =  JSON.toJSONStringWithDateFormat(map,dateformat, SerializerFeature.WriteDateUseDateFormat);
            //利用Json强转LinkedHashMap 成对象 PNSUB 方便前台点出方法
            //subList = JSON.parseArray(JSON.toJSONString(pnSubList), PNSub.class);

            result = new CommonResult<>(200, "成功9002" ,aa);
        }
        catch (Exception ex)
        {
            result = new CommonResult<>(400,"失败9002",ex.getMessage());
        }
        return  aa;
    }


}
