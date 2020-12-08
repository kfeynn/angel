package com.grand.springcloud.entity.common;

import java.io.Serializable;

/**
 * @author zyq
 * @date DATE 2020/8/17 11:11
 **/
public class MesApiRequest<T> implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String serviceId;
    private T jsonData;

    public MesApiRequest()
    {
    }

    public MesApiRequest(String serviceId )
    {
        this.serviceId =serviceId;
        this.jsonData = null;
    }

    public MesApiRequest(String serviceId, T jsonData)
    {
        this.serviceId =serviceId;
        this.jsonData=jsonData;
    }


    public String getServiceId()
    {
        return serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }

    public T getJsonData()
    {
        return jsonData;
    }

    public void setJsonData(T jsonData)
    {
        this.jsonData = jsonData;
    }

//    @Override
//    public String toString()
//    {
//        return "MesApiRequest{" +
//                "serviceId='" + serviceId + '\'' +
//                ", jsonData=" + jsonData +
//                '}';
//    }




}
