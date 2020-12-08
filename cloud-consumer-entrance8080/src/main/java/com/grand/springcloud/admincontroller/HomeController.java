package com.grand.springcloud.admincontroller;

import com.grand.springcloud.entity.sqlserver.XpGridFunctions;
import com.grand.springcloud.entity.sqlserver.XpGridFunctionsForPublic;
import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.helper.CookieHelper;
import com.grand.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author zyq
 * @date DATE 2020/10/10 9:00
 **/
//后台controller加名称区别前台
@Controller("AdminHomeController")
@RequestMapping("/Admin/Home")
public class HomeController
{
    //自动注入
    @Resource
    private HttpServletRequest request;
    @Resource
    private HttpServletResponse response;

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model)
    {
        //跳转到默认首页
        return "redirect:Home/Default";
    }

    //整合bootstarp 样式后台。
    @RequestMapping("/Default")
    public String Default(Model model) throws  Exception
    {
        int uid = CookieHelper.getSidCookie(request);
        if(uid > 0)
        {
            List<XpGridFunctions> menuList = userService.getMenuByUid(uid);
            model.addAttribute("menuList", menuList);
            XpGridUser userModel = userService.getUserByID(uid);
            if (userModel != null)
            {
                model.addAttribute("userCName", userModel.getUsercname());
                model.addAttribute("userId", userModel.getUserid());
            }
        }
        //返回网页路径
        return "Admin/Home/Default";
    }


}
