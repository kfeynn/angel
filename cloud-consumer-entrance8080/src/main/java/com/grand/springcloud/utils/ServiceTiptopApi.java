package com.grand.springcloud.utils;

import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.entity.tiptop.PO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/10/29 11:01
 **/
@Service
public class ServiceTiptopApi
{
    //内容提供者
    @Value("${service-url.nacos-tiptop-service}")
    private String tiptopUrl;

    /** post传递的API封装
     * url    返回地址
     * data   返回post参数
     * */
    public Map poList(PO po,int pageNumber ,int pageSize)
    {
        //String supId,String filter,int pageNumber ,int pageSize, int leadTime

        Map<String,Object> map = new HashMap();
        map.put("url",tiptopUrl + "/PO/getPOSubmit");

        Map data = new HashMap();
        data.put("po",po);                 // 去到 tiptop 由其 组织查询条件
        data.put("pageSize",pageSize);     //页尺寸
        data.put("pageNumber",pageNumber); //页码
        //data.put("leadTime",leadTime);     //提前多少天可打印,由tiptop决定

        map.put("data",data);

        return map;
    }

}
