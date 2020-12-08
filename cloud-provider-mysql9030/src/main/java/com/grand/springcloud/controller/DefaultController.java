package com.grand.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.mysql.StorageTbl;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.helper.RDBSHelper;
import com.grand.springcloud.service.PnService;
import lombok.experimental.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/9/3 11:22
 **/
@Controller
public class DefaultController
{
    @Resource
    RDBSHelper  rdbsHelper;
    @Resource
    PnService  pnService;

    //private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DefaultController.class);
    private static final Logger log = LoggerFactory.getLogger(DefaultController.class);

    @RequestMapping("/")
    @ResponseBody
    public String index(Model model)
    {
        return "----------eeeeeeeeeeeeeeeeee------------";
    }


    //PathVariable rest风格
    @RequestMapping("/getPn/{dnnum}")
    @ResponseBody
    public  CommonResult getPn(@PathVariable("dnnum")  String dnnum)
    {
        System.out.println("进入 getPn 参数：" + dnnum);

        CommonResult result = null;
        try
        {
            //Thread.sleep(15000);    //延时15秒
            StorageTbl pn = pnService.getModel(1);
            result = new CommonResult<>(200, "成功9030", pn);
        }
        catch (Exception ex)
        {
            result = new CommonResult<>(400,"失败9030",ex.getMessage());
        }
        return  result;
    }


    @RequestMapping("/JsonBstrap")
    @ResponseBody
    public CommonResult JsonBstrap(
            String content,
            String sortName,
            String sortOrder,
            @RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNumber,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize  //,
    )
    {
        CommonResult result = null;
        //查询条件
        String filter = "";
        filter = "where 1=1";
        if(!"".equals(content) && content != null)
        {
            if (filter.length() > 1)
            {
                filter += " and ";
            }
            filter += " DNNUM  like '%" + content + "%'";
        }
        if("".equals(sortOrder) || content == null)
        {
            sortOrder = " asc ";
        }
        try
        {
            JSONObject json = new JSONObject();
            //获取数据
            int totalpage = 0;
            int totalRecord = 0;
            Map map = rdbsHelper.ExecutePaging("PN", sortName + " " + sortOrder, filter, pageSize, pageNumber, totalRecord);
            //List<LinkedHashMap<String,Object>>  list   = (List<LinkedHashMap<String,Object>>)map.get("list");
            List<PN> pnList = (List<PN>) map.get("list");
            //利用Json强转LinkedHashMap 成对象 PN
            pnList = JSON.parseArray(JSON.toJSONString(pnList), PN.class);
            System.out.println(pnList);
            totalRecord = (int) map.get("totalRecord");
            json.put("rows", pnList);   //list
            json.put("total", totalRecord); //记录总数
            result = new CommonResult<>(200, "成功", json);
        }
        catch(Exception ex)
        {
            result = new CommonResult<>(400, "失败", ex.getMessage());
        }
        return  result ;
    }
}
