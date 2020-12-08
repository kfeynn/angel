package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.tiptop.PO;
import com.grand.springcloud.helper.RDBSHelper;
import com.grand.springcloud.mapper.CommonMapper;
import com.grand.springcloud.mapper.supplier.PNMapper;
import com.grand.springcloud.service.PnService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/9/3 14:57
 **/
@Service
public class PnServiceImpl implements PnService
{
    @Resource
    PNMapper pnMapper;

    @Resource
    CommonMapper commonMapper;

    @Resource
    RDBSHelper rdbsHelper;

    @Override
    public PN getModel(String dnnum)
    {
        return pnMapper.selectByPrimaryKey(dnnum);
    }

    public List<LinkedHashMap<String,Object>> getOnwayPO(PO po)
    {
        //region 准备数据
        StringBuilder filter1 = new StringBuilder();
        if(po!=null && po.getPmm01()!=null && !"".equals(po.getPmm01()))
        {
            filter1.append(" and ");
            filter1.append(" pmm01 like '%"+po.getPmm01()+"%' ");
        }
        if(po!=null && po.getPmn04() != null && !"".equals(po.getPmn04()))
        {
            filter1.append(" and ");
            filter1.append(" pmn04 like '%"+po.getPmn04()+"%' ");
        }

        StringBuilder filter2 = new StringBuilder();
        if(po!=null && po.getPmm09() !=null && !"".equals(po.getPmm09()))
        {
            filter2.append(" and ");
            filter2.append(" supid='"+po.getPmm09()+"'   ");
        }
        //endregion

        String cmdStr = "select pmm01,pmn02,sum(pmn20) pmn20 from pnsub where sdnnum in (select dnnum from pn where status = 1 "+ filter2 +" ) " + filter1 +
                " group by pmm01,pmn02";

        //返回一个map泛型，内含字段  pmm01,pmn02,pmn20
        List<LinkedHashMap<String,Object>> list = commonMapper.commonSelect(cmdStr);


        return list;
    }
}
