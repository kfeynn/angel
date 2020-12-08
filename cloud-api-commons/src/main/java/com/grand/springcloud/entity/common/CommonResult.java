package com.grand.springcloud.entity.common;

import java.io.Serializable;

/**
 * @author zyq
 * @date DATE 2020/8/17 11:11
 **/

public class CommonResult<T>  implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Integer code;
    private String message;
    private T data;

    public CommonResult()
    {}
    public CommonResult(Integer code, String message)
    {
        this.code =code;
        this.message=message;
        this.data = null;
    }

    public CommonResult(Integer code, String message, T data)
    {
        this.code =code;
        this.message=message;
        this.data = data;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
