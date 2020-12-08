package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.tiptop.PO;
import com.grand.springcloud.helper.RDBSHelper;
import com.grand.springcloud.service.PoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
/**
 * @author zyq
 * @date DATE 2020/11/19 14:31
 **/
@Service
public class PoServiceImpl implements PoService
{
    @Resource
    RDBSHelper rdbsHelper;



    private static final String[] schema = { "s30", "s70", "s80","s90" };

    private static final String poBaseData
            = " select pmm01,pmn02,pmm04,pmm12,gen02,pmn04,pmn041,ima021,ima05,ima09,pmn31, pmn33,pmn07,pmn86,pmn20,pmn87," +
            " (pmn20-pmn50+pmn55+pmn58) as wdve1,case when (ceil(pmn33 - sysdate) > %d) then 0 else (pmn20-pmn50+pmn55+pmn58) end  as wdve," +
            " pmn50,pmn55,pmn58,pmnud01,nvl(pmm50,pmm09) pmm09,(case tc_pmb14 when '1' then '已接收' when '2' then '已完成交货' else '未接收' end) as tc_pmb14," +
            " pmmud08 from " +
            " %s.pmm_file," +
            " %s.pmn_file," +
            " %s.tc_pmb_file," +
            " %s.gen_file," +
            " %s.ima_file " +
            " where pmm01 = pmn01 and pmn04 = ima01 and pmm01 = tc_pmb01 and pmn02 = tc_pmb02 and gen01 = pmm12 " +
            "       and pmm04 >= to_date('2017-09-01', 'yyyy-MM-dd') and pmn16 = 2 and (pmn20-pmn50+pmn55+pmn58) > 0 and  1=1 and tc_pmb14 = '1' %s ";



    @Override
    public Map getPOSubmitListForAll(PO po, int pageSize, int pageNumber, int leadTime)
    {

        //region 准备数据
        StringBuilder filter = new StringBuilder();

        if(po!=null && po.getPmm01()!=null && !"".equals(po.getPmm01()))
        {
            filter.append(" pmm01 like '%"+po.getPmm01()+"%' ");
        }
        if(po!=null && po.getPmn04() != null && !"".equals(po.getPmn04()))
        {
            if(filter.length()>1) filter.append(" and ");
            filter.append(" pmn04 like '%"+po.getPmn04()+"%' ");
        }
        if(po!=null && po.getPmm09() !=null && !"".equals(po.getPmm09()))
        {
            if(filter.length()>1) filter.append(" and ");
            filter.append(" ( pmm09 = '"+po.getPmm09()+"' or pmm50 = '"+po.getPmm09()+"' ) ");
        }
        //endregion

        String dataView = getPoDataView(filter.toString(),leadTime);

        //System.out.println(dataView);

        Logger log = LoggerFactory.getLogger(PoServiceImpl.class);
        log.info(dataView);
//        log.warn("this is message {}", 1);
//        Exception ex = new Exception("this is a message.");
//        log.error("a new exeception", ex);
//        log.trace("trace message.");
//        log.info("info message.");


        Map map =rdbsHelper.ExecutePaging(dataView,""," where 1=1 ",pageSize,pageNumber);

        return map;
    }

    /**
     * 获取 采购订单有在外量 数据表 （外层，需要再加工）
     *
     *
     select pmm01,pmn02,pmm04,pmm12,gen02,pmn04,pmn041,ima021,ima05,ima09,pmn31, pmn33,pmn07,pmn86,pmn20,pmn87,(pmn20-pmn50+pmn55+pmn58) as wdve1,case when (ceil(pmn33 - sysdate) >10) then 0 else (pmn20-pmn50+pmn55+pmn58) end  as wdve, pmn50,pmn55,pmn58,pmnud01,nvl(pmm50,pmm09) pmm09,(case tc_pmb14 when '1' then '已接收' when '2' then '已完成交货' else '未接收' end) as tc_pmb14,pmmud08 from s30.pmm_file,s30.pmn_file,s30.tc_pmb_file,s30.gen_file,s30.ima_file where pmm01 = pmn01 and pmn04 = ima01 and pmm01 = tc_pmb01 and pmn02 = tc_pmb02 and gen01 = pmm12 and pmm04 >= to_date('2017-09-01', 'yyyy-MM-dd') and pmn16 = 2 and (pmn20-pmn50+pmn55+pmn58) > 0 and  1=1 and tc_pmb14 = '1'
     union all
     select pmm01,pmn02,pmm04,pmm12,gen02,pmn04,pmn041,ima021,ima05,ima09,pmn31, pmn33,pmn07,pmn86,pmn20,pmn87,(pmn20-pmn50+pmn55+pmn58) as wdve1,case when (ceil(pmn33 - sysdate) >10) then 0 else (pmn20-pmn50+pmn55+pmn58) end  as wdve, pmn50,pmn55,pmn58,pmnud01,nvl(pmm50,pmm09) pmm09,(case tc_pmb14 when '1' then '已接收' when '2' then '已完成交货' else '未接收' end) as tc_pmb14,pmmud08 from s70.pmm_file,s70.pmn_file,s70.tc_pmb_file,s70.gen_file,s70.ima_file where pmm01 = pmn01 and pmn04 = ima01 and pmm01 = tc_pmb01 and pmn02 = tc_pmb02 and gen01 = pmm12 and pmm04 >= to_date('2017-09-01', 'yyyy-MM-dd') and pmn16 = 2 and (pmn20-pmn50+pmn55+pmn58) > 0 and  1=1 and tc_pmb14 = '1'
     union all
     select pmm01,pmn02,pmm04,pmm12,gen02,pmn04,pmn041,ima021,ima05,ima09,pmn31, pmn33,pmn07,pmn86,pmn20,pmn87,(pmn20-pmn50+pmn55+pmn58) as wdve1,case when (ceil(pmn33 - sysdate) >10) then 0 else (pmn20-pmn50+pmn55+pmn58) end  as wdve, pmn50,pmn55,pmn58,pmnud01,nvl(pmm50,pmm09) pmm09,(case tc_pmb14 when '1' then '已接收' when '2' then '已完成交货' else '未接收' end) as tc_pmb14,pmmud08 from s80.pmm_file,s80.pmn_file,s80.tc_pmb_file,s80.gen_file,s80.ima_file where pmm01 = pmn01 and pmn04 = ima01 and pmm01 = tc_pmb01 and pmn02 = tc_pmb02 and gen01 = pmm12 and pmm04 >= to_date('2017-09-01', 'yyyy-MM-dd') and pmn16 = 2 and (pmn20-pmn50+pmn55+pmn58) > 0 and  1=1 and tc_pmb14 = '1'
     union all
     select pmm01,pmn02,pmm04,pmm12,gen02,pmn04,pmn041,ima021,ima05,ima09,pmn31, pmn33,pmn07,pmn86,pmn20,pmn87,(pmn20-pmn50+pmn55+pmn58) as wdve1,case when (ceil(pmn33 - sysdate) >10) then 0 else (pmn20-pmn50+pmn55+pmn58) end  as wdve, pmn50,pmn55,pmn58,pmnud01,nvl(pmm50,pmm09) pmm09,(case tc_pmb14 when '1' then '已接收' when '2' then '已完成交货' else '未接收' end) as tc_pmb14,pmmud08 from s90.pmm_file,s90.pmn_file,s90.tc_pmb_file,s90.gen_file,s90.ima_file where pmm01 = pmn01 and pmn04 = ima01 and pmm01 = tc_pmb01 and pmn02 = tc_pmb02 and gen01 = pmm12 and pmm04 >= to_date('2017-09-01', 'yyyy-MM-dd') and pmn16 = 2 and (pmn20-pmn50+pmn55+pmn58) > 0 and  1=1 and tc_pmb14 = '1' order by pmm04 desc,pmn02,pmm01
     *
     * */
    private String getPoDataView(String filter,int leadTime)
    {
        String cmdStr = "";
        if(!"".equals(filter))
        {
            filter = " and " + filter;
        }

        for (int i = 0; i < schema.length; i++)
        {
            if (i > 0)
            {
                cmdStr += " union all";
            }
            cmdStr += String.format(poBaseData, leadTime, schema[i], schema[i], schema[i], schema[i], schema[i], filter);
        }
        //排序
        cmdStr += "  order by pmm04 desc,pmn02,pmm01 ";
        return cmdStr;
    }

}
