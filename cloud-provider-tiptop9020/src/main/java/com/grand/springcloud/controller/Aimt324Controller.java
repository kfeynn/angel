package com.grand.springcloud.controller;

import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.service.Aimt324Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/12/4 9:42
 * 处理扫描调拨业务
 **/
@RestController
@RequestMapping("/Aimt324")
public class Aimt324Controller
{
    @Resource
    Aimt324Service aimt324Service;

    @RequestMapping(value="addAimt324", method= RequestMethod.POST)
    public CommonResult addAimt324(@RequestBody Map<String, Object> map)
    {

        CommonResult result = null;

        System.out.println(map);

        try
        {
            boolean flag = aimt324Service.AddAimt324("asdf");

            result = new CommonResult<>(200, "成功", true);
        }
        catch (Exception ex)
        {
            //
            result = new CommonResult<>(400, "失败", ex.getMessage());
        }

        return result;

    }

}
