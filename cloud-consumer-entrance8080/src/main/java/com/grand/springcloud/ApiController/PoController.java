package com.grand.springcloud.ApiController;

import cn.hutool.core.date.DateTime;
import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.tiptop.PO;
import com.grand.springcloud.helper.BootstrapPagerHelper;
import com.grand.springcloud.helper.base.PageModel;
import com.grand.springcloud.service.PnService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/9/3 17:25
 **/
//controller加名称区别
@RestController
@RequestMapping("/API/Po")
public class PoController
{
    //约定 统一对外（程序）提供服务入口 。前缀API
    @Resource
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-supplier-service}")
    private String serverURL;


    @Resource
    private PnService pnService;

    @GetMapping(value = "/consumer/getPn/{dnnum}")
    public CommonResult getPn(@PathVariable("dnnum")  String dnnum)
    {
        CommonResult result = restTemplate.getForObject(serverURL + "/getPn/" + dnnum.toString(), CommonResult.class);
        return result;
    }


    //待测试 前端用不同技术 访问 ，带参数！

    @RequestMapping("/PoList0")
    public CommonResult PoList0()
    {
        CommonResult result = null;

        System.out.println("PoList0");

        Map map = pnService.PoList(new PO(),15,1);

        result = new CommonResult<>(200,"成功",map);
        return result;
    }

//@RequestBody Map<String, Object> map
//@RequestParam(value = "pageNumber", required = false, defaultValue = "1")
    //@RequestMapping("/PoList")
    @RequestMapping(value="PoList", method= RequestMethod.POST)
//    public CommonResult PoList(@RequestBody PO po,
//                               @RequestBody  int pageNumber,
//                               @RequestBody @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize)
    public CommonResult PoList(@RequestBody Map<String, Object> map)
    {
        // map
        // {"pageNumber":1, "pageSize":10, "po":{"pcsCount":0,"pkgCount":0,"pmm09":"210005","pmn02":0,"pmn20":0,"pmn31":0,"pmn50":0,"pmn55":0,"pmn58":0,"pmn87":0,"sCount":0,"sPriceCount":0,"wdve":0,"wdve1":0}}

        System.out.println("in PoList" + DateTime.now().toString());

        //获取传入的参数
        PO po = map.get("po") == null ? null : JSON.parseObject(JSON.toJSONString(map.get("po")), PO.class);
        //尺寸、页码
        int pageSize = map.get("pageSize") == null ? 15 : Integer.valueOf( map.get("pageSize").toString());
        int pageNumber = map.get("pageNumber") == null ? 1 : Integer.valueOf( map.get("pageNumber").toString());

        CommonResult result = null;

        String poStr = JSON.toJSONString(po);

        System.out.println("进入PoList" + DateTime.now().toString());

//        System.out.println(poStr);
//        System.out.println(pageNumber);
//        System.out.println(pageSize);

        Map rmap = pnService.PoList(po, pageSize, pageNumber);

        result = new CommonResult<>(200, "成功", rmap);

        System.out.println("返回结果 ：" + DateTime.now().toString());
        System.out.println(result);

        return result;
    }



    @RequestMapping(value="PoList1", method= RequestMethod.POST)
    public CommonResult PoList1(@RequestBody Map<String, Object> map)
    {
        CommonResult result = null;

        System.out.println(map);


        PO po =  map.get("po") == null ? null : JSON.parseObject(JSON.toJSONString(map.get("po")), PO.class);
        //尺寸、页码
        int pageSize = map.get("pageSize") == null ? 15 : (int) map.get("pageSize");
        int pageNumber = map.get("pageNumber") == null ? 1 : (int) map.get("pageNumber");


        Map rmap = pnService.PoList(po,pageSize,pageNumber);

        result = new CommonResult<>(200,"成功",rmap);
        return result;
    }



}