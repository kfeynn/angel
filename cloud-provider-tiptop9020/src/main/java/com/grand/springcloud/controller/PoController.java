package com.grand.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.tiptop.PO;
import com.grand.springcloud.service.PoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/11/19 13:36
 **/
@RestController
@RequestMapping("/PO")
public class PoController
{
    @Resource
    PoService poService;

    //获取配置信息的值
    @Value("${config.leadTime}")
    private int leadTime;    //一般单据提前打印天数
    @Value("${config.jitLeadTime}")
    private int jitLeadTime; //JIT提前打印天数

    /**
     * 获取ERP采购订单在外量信息 。
     * */
     @RequestMapping("/getPOSubmitForAll")
     @ResponseBody
    //public CommonResult getPOSubmitForAll(String supId,  String filter,int pageNumber ,int pageSize, int leadTime)
    public CommonResult getPOSubmitForAll(String supId,  String filter)
    {
        CommonResult result = null;

        Map map = poService.getPOSubmitListForAll(null,1,15,7);

        result = new CommonResult<>(200,"成功",map);

        return  result;
    }

    @RequestMapping(value="getPOSubmit", method= RequestMethod.POST)
    public CommonResult getPOSubmit(@RequestBody Map<String, Object> map)
    {
        CommonResult result = null;
        try
        {
            //获取传入的参数
            PO po = map.get("po") == null ? null : JSON.parseObject(JSON.toJSONString(map.get("po")), PO.class);

            //尺寸、页码
            int pageSize = map.get("pageSize") == null ? 15 : Integer.valueOf(map.get("pageSize").toString());
            int pageNumber = map.get("pageNumber") == null ? 1 : Integer.valueOf(map.get("pageNumber").toString());
            //提前交期多久打印

            //int leadTime = 7; // map.get("leadTime") == null ? 7 : (int) map.get("leadTime");

            //获取传入的参数
            int sid = map.get("sid") == null ? 0 : (int) map.get("sid");

            Map resultmap = poService.getPOSubmitListForAll(po, pageSize, pageNumber, leadTime);

            result = new CommonResult<>(200, "获取成功", resultmap);
        }
        catch (Exception Ex)
        {
            result = new CommonResult<>(400,"获取失败",Ex.getMessage());
        }

        return result;
    }


}
