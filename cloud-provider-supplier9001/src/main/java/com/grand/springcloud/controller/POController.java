package com.grand.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.entity.tiptop.PO;
import com.grand.springcloud.helper.RDBSHelper;
import com.grand.springcloud.mapper.CommonMapper;
import com.grand.springcloud.service.PoService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/11/20 16:06
 **/
@RestController
@RequestMapping("/PO")
public class POController
{
    @Resource
    RDBSHelper rdbsHelper;
    @Resource
    CommonMapper commonMapper;

    @Resource
    PoService poService;

    @RequestMapping(value="getPOSubmit", method= RequestMethod.POST)
    public CommonResult getPOSubmit(@RequestBody Map<String, Object> map)
    {
        CommonResult result = null;

        String aa  = JSON.toJSONString(map.get("po"));
        //获取传入的参数
        PO po =  map.get("po") == null ? null : JSON.parseObject(JSON.toJSONString(map.get("po")), PO.class);
        //尺寸、页码
        int pageSize = map.get("pageSize") == null ? 15 : (int) map.get("pageSize");
        int pageNumber = map.get("pageNumber") == null ? 1 : (int) map.get("pageNumber");

        //调用tiptop 返回基础数据，再加工 supplier 。

        Map rmap = poService.getPOList(po,pageSize,pageNumber);

        result = new CommonResult<>(200,"获取成功",rmap);

        return result;
    }




}
