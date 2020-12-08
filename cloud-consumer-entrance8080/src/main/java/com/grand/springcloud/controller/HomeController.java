package com.grand.springcloud.controller;

import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.helper.CookieHelper;
import com.grand.springcloud.service.PnService;
import com.grand.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Home")
public class HomeController
{
    @Autowired
    private HttpServletRequest request;
//    @Autowired
//    XpGridFunctionsForPublicDao  xpGridFunctionsForPublicDao;
//
//    @Autowired
//    XpGridUserDao xpGridUserDao;

    @Resource
    private UserService userService;


    //整合bootstarp 样式后台。
    @RequestMapping("/Default")
    public String Default(Model model) throws Exception
    {


        List<XpGridFunctionsForPublic> menuList = userService.getMenuForPublic();
        model.addAttribute("menuList", menuList);

        int uid = CookieHelper.getSidCookie(request);
        if(uid > 0)
        {
            XpGridUser userModel = userService.getUserByID(uid);
//            XpGridUser userModel = xpGridUserDao.getModelByUserID(uid);
            if (userModel != null)
            {
                model.addAttribute("userCName", userModel.getUsercname());
                model.addAttribute("userId",userModel.getUserid());
            }
            else
            {
                model.addAttribute("userCName", "游客");
                model.addAttribute("userId","");
            }
        }
        //返回网页路径
        return "Home/Default";
    }


    //业务提醒功能页
    @RequestMapping("/mallruninfo")
    public String mallruninfo()
    {
        //返回网页路径
        return "Home/mallruninfo";
    }
}
