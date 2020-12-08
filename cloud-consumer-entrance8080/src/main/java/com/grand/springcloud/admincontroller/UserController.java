package com.grand.springcloud.admincontroller;

import com.grand.springcloud.entity.sqlserver.XpGridUser;
import com.grand.springcloud.entity.supplier.PN;
import com.grand.springcloud.entity.supplier.PNSub;
import com.grand.springcloud.helper.BootstrapPagerHelper;
import com.grand.springcloud.helper.CookieHelper;
import com.grand.springcloud.helper.PageHelper;
import com.grand.springcloud.helper.base.PageModel;
import com.grand.springcloud.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author zyq
 * @date DATE 2020/11/9 15:51
 **/
@Controller
@RequestMapping("/malladmin/User")
public class UserController
{
    @Resource
    HttpServletResponse response;
    @Resource
    HttpServletRequest request;
    @Resource
    private UserService userService;

    @RequestMapping("/list")
    public String list(String userName,
                       @RequestParam(value = "pageNumber", required = false, defaultValue = "1") int pageNumber,
                       @RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize,
                       Model model)
    {
        //获取数据
        //int totalpage =0;
        int totalRecord = 0;
        Map map = userService.getUserList(userName,pageSize,pageNumber);
        //普通分页 约定后台返回两个值 ：totalRecord、list
        totalRecord = (int) map.get("totalRecord"); //送货单总记录数 ，用于计算脚标
        List<XpGridUser> list = (List<XpGridUser>) map.get("list");  //当前页送货单列表
        //页脚Model
        PageModel pageModel = new PageModel(pageSize, pageNumber, totalRecord);
        String pageHelper = new PageHelper(pageModel).toString();

        model.addAttribute("pageHelper", pageHelper);  //页脚
        model.addAttribute("list", list);              //表数据
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("pageNumber", pageNumber);
        //记录本次访问地址， 用于返回上一层。
        CookieHelper.setAdminRefererCookie(request, response, String.format("%s?pageNumber=%s&pageSize=%s&roleName=%s",
                "list", String.valueOf(pageModel.getPagenumber()), String.valueOf(pageModel.getPagesize()),
                userName));
        //大小写敏感！！！
        return "Admin/User/list";
    }

    @RequestMapping("/delete")
    public String delete(int sid)
    {
        //xpGridUserDao.delete(sid);

        userService.deleteUser(sid);

        //返回上一级目录
        String refer = CookieHelper.getMallAdminRefererCookie(request);
        refer = "redirect:" + refer;
        //redirect : 同一Controller下 用相对目录。不能从根目录下查找 "/"
        return refer;
    }


}
