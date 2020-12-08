package com.grand.springcloud.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author zyq
 * @date DATE 2020/12/7 10:00
 **/

@WebService
public interface MesService
{
    @WebMethod
    String Execute(@WebParam(name = "serviceId") String serviceId, @WebParam(name = "jsonData") String jsonData);

}
