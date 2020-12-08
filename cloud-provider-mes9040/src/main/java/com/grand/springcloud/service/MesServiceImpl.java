package com.grand.springcloud.service;

import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.common.CommonResult;
import com.uinfor.mes.si.webservice._7084.WebServiceResult;
import com.uinfor.mes.si.webservice._7084.WsEntranceService;
import com.uinfor.mes.si.webservice._7084.WsEntranceServiceImplService;

/**
 * @author zyq
 * @date DATE 2020/12/7 10:02
 **/
public class MesServiceImpl implements MesService
{
    @Override
    public String Execute(String serviceId, String jsonData)
    {

        System.out.println("进入webservice：" + serviceId);

        //String resultString = "进入webservice： " + serviceId;

        WsEntranceService service = new WsEntranceServiceImplService().getWsEntranceServiceImplPort();

        WebServiceResult mesresult =  service.execute(serviceId,jsonData);

        String resultString = JSON.toJSONString(mesresult);

        CommonResult result = new CommonResult<>(200,"返回成功",resultString);

        resultString  = JSON.toJSONString(result);

        return resultString;

    }
}
