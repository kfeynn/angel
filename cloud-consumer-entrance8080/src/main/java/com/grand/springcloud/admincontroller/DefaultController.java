package com.grand.springcloud.admincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zyq
 * @date DATE 2020/10/20 11:19
 **/
@Controller("AdminDefaultController")
@RequestMapping("/Admin")
public class DefaultController
{
    @RequestMapping("/")
    public String index(Model model)
    {
        //跳转到默认首页
        return "redirect:Home/Default";
    }
}
