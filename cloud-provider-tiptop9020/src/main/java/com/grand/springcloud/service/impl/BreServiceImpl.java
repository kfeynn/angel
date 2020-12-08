package com.grand.springcloud.service.impl;

import cn.hutool.core.date.DateTime;
import com.alibaba.fastjson.JSON;
import com.grand.springcloud.entity.tiptop.*;
import com.grand.springcloud.mapper.tiptop.*;
import com.grand.springcloud.service.BreService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/11/2 15:06
 **/
@Service
public class BreServiceImpl implements BreService
{
    @Resource
    TC_BRE_FILEMapper tc_bre_fileMapper;

    @Resource
    TC_BRF_FILEMapperPlus tc_brf_fileMapperPlus;

    @Resource
    RVBS_FILEMapperPlus  rvbs_fileMapperPlus;

    @Resource
    TC_QCBRF_FILEMapperPlus tc_qcbrf_fileMapperPlus;

    public  void reflect(Object e) throws  Exception {
        Class cls = e.getClass();
        Field[] fields = cls.getDeclaredFields();
        for(int i=0; i<fields.length; i++){
            Field f = fields[i];
            f.setAccessible(true);
            System.out.println("属性名:" + f.getName() + " 属性值:" + f.get(e));
        }
    }

    @Override
    /**
     * */
    public Map getBreInfo(String tc_bre01)
    {
        TC_BRE_FILE breModel = tc_bre_fileMapper.selectByPrimaryKey("07212154172003150020");

        List<TC_BRF_FILE> brfList = tc_brf_fileMapperPlus.selectByBrf01("07212154172003150020");

        List<TC_QCBRF_FILE> qcBrfList =tc_qcbrf_fileMapperPlus.selectByQcBrf01("07212154172003150020");

        Map result = new HashMap();
        result.put("tc_bre_file",breModel);
        result.put("brfList",brfList);
        if(qcBrfList != null )
        {
            result.put("qcBrfList",qcBrfList);
        }
        return result;
    }


    @Override
    public Map getRvbsInfo(String rvbs01)
    {
        //381-S311408270135

//        TC_BRE_FILE breModel =  new TC_BRE_FILE();
//        breModel.setTcBreud05(DateTime.now());
//        breModel.setTcBreuser("GT36434");
//

        TC_BRE_FILE breModel = tc_bre_fileMapper.selectByPrimaryKey("07212154172003150020");


        List<RVBS_FILE> rvbsList = rvbs_fileMapperPlus.selectByRvbs01("381-S311408270135");


        Map result = new HashMap();
        result.put("tc_bre_file",breModel);
        result.put("rvbsList",rvbsList);

        return result;
    }


}
