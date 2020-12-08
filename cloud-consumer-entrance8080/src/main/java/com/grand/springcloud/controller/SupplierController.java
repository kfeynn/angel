package com.grand.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.zxing.WriterException;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.entity.tiptop.PO;
import com.grand.springcloud.helper.BootstrapPagerHelper;
import com.grand.springcloud.helper.base.PageModel;
import com.grand.springcloud.service.PnService;
import com.itextpdf.text.DocumentException;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Supplier")
public class SupplierController
{
    @Resource
    HttpServletResponse response;

    @Resource
    private PnService pnService;

    @RequestMapping("/PnList")
    public String PnList(PN pn, PNSub pnSub,
                         @RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNumber,
                         @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize,
                         Model model) throws IOException, DocumentException, WriterException
    {
        if (pn == null)
        {
            pn = new PN();
        }
        if(pnSub == null)
        {
            pnSub = new PNSub();
        }
        if (pageSize <= 0)
            //防止除0操作
            pageSize = 1;

        Map map = pnService.PnList(pn,pnSub,pageSize,pageNumber);

        int totalpage = 0;
        int totalRecord = 0;
        //约定后台返回三个值 ：totalRecord、pnList、pnSubList
        totalRecord = (int) map.get("totalRecord"); //送货单总记录数 ，用于计算脚标
        List<PN> pnList = (List<PN>) map.get("pnList");  //当前页送货单列表
        List<PNSub> subList = (List<PNSub>) map.get("pnSubList");  //当前页送货单子列表

        //页脚信息Model
        PageModel pageModel = new PageModel(pageSize, pageNumber, totalRecord);
        String pageHelper = new BootstrapPagerHelper(pageModel).toString();

        //保存前台查询条件的值
        model.addAttribute("PN", pn);
        model.addAttribute("PNSUB", pnSub);
        //返回后台查询列表
        model.addAttribute("pnList", pnList);
        model.addAttribute("pnSubList", subList);
        model.addAttribute("pageHelper", pageHelper); //脚标
        model.addAttribute("pageSize", pageSize);     //页尺寸
        model.addAttribute("pageNumber", pageNumber); //当前页码
        model.addAttribute("message", "");         //提示信息

        return "Supplier/PnList";
    }



    @RequestMapping("/PoList")
    public String PoList(PO po, @RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNumber,
                         @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize,
                         Model model)
    {

        Map map = pnService.PoList(po,pageSize,pageNumber);
        int totalRecord = 0;
        //约定后台返回三个值 ：totalRecord、pnList、pnSubList
        totalRecord = (int) map.get("totalRecord"); //当前查询条件总记录数 ，用于计算脚标
        //List<PO> poList = (List<PO>) map.get("list");  //当前页信息列表
        //1.当前页信息列表. 通过fastjson linkedhashmap 转为为实体类列表
        //List<PO> poList = JSON.parseObject(JSON.toJSONString(map.get("list")), new TypeReference<List<PO>>(){});
        //2.利用Json强转LinkedHashMap 成对象 PN
        List<PO> poList = JSON.parseArray(JSON.toJSONString(map.get("list")), PO.class);

        //页脚信息Model
        PageModel pageModel = new PageModel(pageSize, pageNumber, totalRecord);
        String pageHelper = new BootstrapPagerHelper(pageModel).toString();

        //保存前台查询条件的值
        model.addAttribute("po", po);

        //返回后台查询列表
        model.addAttribute("poList", poList);

        model.addAttribute("pageHelper", pageHelper); //脚标
        model.addAttribute("pageSize", pageSize);     //页尺寸
        model.addAttribute("pageNumber", pageNumber); //当前页码
        model.addAttribute("message", "");         //提示信息

        return "Supplier/PoList";
    }
}