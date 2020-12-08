package com.grand.springcloud.service.impl;

import com.grand.springcloud.entity.tiptop.IMM_FILE;
import com.grand.springcloud.entity.tiptop.IMN_FILE;
import com.grand.springcloud.mapper.tiptop.IMM_FILEMapper;
import com.grand.springcloud.mapper.tiptop.IMN_FILEMapper;
import com.grand.springcloud.service.Aimt324Service;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zyq
 * @date DATE 2020/12/4 11:24
 **/
@Service
public class Aimt324ServiceImpl implements Aimt324Service
{

    @Resource
    IMM_FILEMapper imm_fileMapper;

    @Resource
    IMN_FILEMapper imn_fileMapper;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean AddAimt324(String imm01)
    {
        //1.添加 imm_file
        //2.添加 imn_file
        //3.添加 rvbs_file
        //4.添加/更新 img_file
        //5.添加/更新 imgs_file

        IMM_FILE imm_file = new IMM_FILE();
        imm_file.setImm01("testzyq");
        imm_file.setImmplant("S31");
        imm_file.setImmlegal("S30");
        imm_file.setImm15("0");
        imm_file.setImmmksg("N");

        IMN_FILE imn_file = new IMN_FILE();
        imn_file.setImn01("testzyq");
        imn_file.setImn02(1);
        imn_file.setImnplant("S31");
        imn_file.setImnlegal("S30");

        int i = 0;
        int s = 9;

        imn_fileMapper.insert(imn_file);

        System.out.println(s / i);

        imm_fileMapper.insert(imm_file);


        return false;
    }

    //获取单号
    //Azz_Get.get_requisition("141","AIM","4",l_employee,g_plant,get_requisition_r);
//    public String get_requisition(String p_smyslip, String p_smysys,
//                                  String p_smykind, String p_user, String p_lant)
//    {
//        String l_requisition = "";
//        String l_gee06 = "";
//        String l_gee07 = "";
//        String l_gee08 = "";
//        String l_aza41 = "";
//        String l_aza42 = "";
//        String l_aza97 = "";
//        int l_aza98 = 0;
//        String l_aza101 = "";
//        int l_num = 0;
//        String l_buff = "";
//        int l_num1 = 0;
//        DBConnect conn = new DBConnect();
//        String g_date = df.format(new Date());
//
//        String l_sql = "SELECT gee06,gee07,gee08 FROM gee_file WHERE gee01 = '"
//                + p_smysys + "' AND gee02 = '" + p_smykind
//                + "'   AND gee03 = '2'";
//        try
//        {
//            ResultSet rs = conn.executeQuery(l_sql);
//            if (rs.next())
//            {
//                l_gee06 = rs.getString(1);
//                l_gee07 = rs.getString(2);
//                l_gee08 = rs.getString(3);
//            }
//            rs.close();
//        }
//        catch (SQLException e)
//        {
//            l_requisition = "";
//        }
//
//        l_sql = "SELECT aza97,aza98,aza101,aza41,aza42 FROM aza_file WHERE 1=1";
//        try
//        {
//            ResultSet rs = conn.executeQuery(l_sql);
//            if (rs.next())
//            {
//                l_aza97 = rs.getString(1);
//                l_aza98 = rs.getInt(2);
//                l_aza101 = rs.getString(3);
//                l_aza41 = rs.getString(4);
//                l_aza42 = rs.getString(5);
//            }
//            rs.close();
//        }
//        catch (SQLException e)
//        {
//            l_aza41 = "1";
//            l_aza42 = "3";
//            l_aza97 = "Y";
//            l_aza98 = 3;
//            l_aza101 = "4";
//        }
//        l_num = l_aza98 + 1;
//        p_lant = p_lant.substring(0, l_aza98);
//        switch (l_aza41.charAt(0))
//        {
//            case '1':
//                l_num = l_num + 3;
//                break;
//            case '2':
//                l_num = l_num + 4;
//                break;
//            case '3':
//                l_num = l_num + 5;
//                break;
//            default:
//                l_num = l_num + 3;
//        }
//        switch (l_aza42.charAt(0))
//        {
//            case '1':
//                l_num = l_num + 8;
//                l_aza98 = 8;
//                break;
//            case '2':
//                l_num = l_num + 9;
//                l_aza98 = 9;
//                break;
//            case '3':
//                l_num = l_num + 10;
//                l_aza98 = 10;
//                break;
//            default:
//                l_num = l_num + 10;
//                l_aza98 = 10;
//        }
//        if (l_aza97.equals("Y"))
//        {
//            l_buff = p_smyslip + "-" + p_lant;
//        }
//        else
//        {
//            l_buff = p_smyslip + "-";
//        }
//
//        switch (l_aza101.charAt(0))
//        {
//            case '1':
//                l_buff = l_buff;
//                break;
//            case '2':
//                l_buff = l_buff + g_date.substring(2, 5);
//                l_aza98 = l_aza98 - 4;
//                break;
//            case '3':
//                l_buff = l_buff + g_date.substring(2, 5);
//                l_aza98 = l_aza98 - 2;
//                break;
//            case '4':
//                l_buff = l_buff + g_date.substring(2, 8);
//                l_aza98 = l_aza98 - 6;
//                break;
//            case '5':
//                l_buff = l_buff + g_date.substring(2, 5);
//                l_aza98 = l_aza98 - 2;
//                break;
//            default:
//        }
//        l_sql = "SELECT MAX(" + l_gee07 + ")FROM " + l_gee06 + " WHERE "
//                + l_gee07 + " LIKE '" + l_buff + "%'";
//        try
//        {
//            ResultSet rs = conn.executeQuery(l_sql);
//            while (rs.next())
//            {
//                l_requisition = rs.getString(1);
//                break;
//            }
//            rs.close();
//        }
//        catch (SQLException e)
//        {
//            l_requisition = "";
//        }
//        if (l_requisition == null || "".equals(l_requisition))
//        {
//            for (int i = 1; i < l_aza98; i++)
//            {
//                l_buff = l_buff + "0";
//            }
//            l_requisition = l_buff + "1";
//
//        }
//        else
//        {
//            l_num1 = Integer.parseInt(l_requisition.substring(l_num - l_aza98)) + 1;
//            l_requisition = String.valueOf(l_num1).trim();
//            for (int i = l_requisition.length(); i < l_aza98; i++)
//            {
//                l_buff = l_buff + "0";
//            }
//            l_requisition = l_buff + l_requisition;
//
//        }
//        try
//        {
//            conn.close();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        return l_requisition;
//    }

}
