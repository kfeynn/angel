package com.grand.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.uinfor.mes.si.webservice._7084.WebServiceResult;
import com.uinfor.mes.si.webservice._7084.WsEntranceService;
import com.uinfor.mes.si.webservice._7084.WsEntranceServiceImplService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/12/7 11:20
 **/
@RestController
public class TestController
{

    @RequestMapping("/test")
    public String testWebService()
    {
        Map map = new HashMap();

        map.put("key1","value1");
        map.put("key2","value2");

        String serviceId = "MaterialInformation";

        //String jsonData = JSON.toJSONString(map);
        String jsonData = "{\"ServiceTime\":20/09/28,\"data\":[{\"MaterialCode\":\"910121133846\",\"FigureNumber\":\"DKBA8.817.3543\",\"MaterialName\":\"拉手条\",\"Description\":\"拉手条DKBA4.130.4707MX-KW31UAIC拉手条-SGSN9810-铝型材-华为白\",\"VersionNumber\":\" \",\"MaterialTypeCode\":\"9101\",\"MaterialStandard\":\"\",\"HuaWeiCode\":\"21133846\",\"StockCode\":\"\",\"Unit\":\"pcs\",\"IsEnable\":\"Y\",\"IsHuaWeiCode\":\"\",\"EditTime\":\"20/09/28\",\"EditUser\":\"GT35804\"}]}";

        WsEntranceService service = new WsEntranceServiceImplService().getWsEntranceServiceImplPort();


        //WsEntranceService service = new WsEntranceServiceImplService().getWsEntranceServiceImplPort();

        //WebServiceResult result =  service.execute(serviceId,jsonData);

        WebServiceResult result =  service.execute(serviceId,jsonData);

        String resultString = JSON.toJSONString(result);

        return resultString;
    }
}
