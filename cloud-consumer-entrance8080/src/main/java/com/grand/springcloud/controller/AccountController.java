package com.grand.springcloud.controller;


import com.grand.springcloud.entity.common.CommonResult;
import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.helper.CookieHelper;
import com.grand.springcloud.helper.WebHelper;
import com.grand.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/Account")
public class AccountController
{
    public AccountController(){}
    //自动注入
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;

    @Autowired
    private UserService userService;

    //@Autowired
    //XpGridUserDao xpGridUserDao;

    @RequestMapping("/login")
    public String login(String username, String password, String verifyCode, Model viewModel) throws Exception
    {
//        username = "admin";
//        password = "admin";



        boolean isExistsUser = userService.isExists(username,password);

        //1.判断cookie 获取账号 。存在则提醒已经登录。直接跳转。
        int sid = CookieHelper.getSidCookie(request);
        if(sid > 0)
        {
            //已经登录 跳转页面
            return "redirect:/Admin/Home/Default";   //转发重定向
        }
        if ("GET".equals(request.getMethod()))
        {
            return "Account/login";
        }
        //验证码
        String sessionCode = request.getSession().getAttribute("verCode").toString();
        if(verifyCode !=null && verifyCode.toUpperCase().equals(sessionCode.toUpperCase()))
        {
            //验证验证码通过
        }
        else
        {
            viewModel.addAttribute("message","验证码错误");
            return "Account/login";
        }
        if(isExistsUser)
        {
            XpGridUser userModel  = userService.getUserByUsernameAndPassword(username,password);
            if(userModel != null)
            {
                //添加cookie
                int expires = 60 * 60 * 24;  //有效期
                CookieHelper.setUserCookie(request, response, userModel, expires);
            }
            //跳转页面
            return "redirect:/Admin/Home/Default";   //转发重定向
        }
        else
        {
            //用户名密码错误！
            viewModel.addAttribute("message", "用户名或密码错误");
            //大小写敏感！！！
            return "Account/login";
        }
    }

    /**
     * 退出
     * @return
     */
    @RequestMapping("/logout")
    public String logout() throws Exception
    {
        int sid = CookieHelper.getSidCookie(request);
        if(sid > 0)
        {
            WebHelper.deleteCookie(request,response,"userinfo");
        }
        return "Account/login";
    }

}
