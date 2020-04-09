package com.kind1ess.controller;


import com.kind1ess.entity.Account;
import com.kind1ess.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping(value = "/testParam",params = {"username","password"}, method = RequestMethod.POST)
    public String testParam(String username,String password){
        System.out.println("执行了。。。");
        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        return "success";
    }

    /**
     * 把请求参数绑定封装到JavaBean对象中
     * 只需要在方法参数中加入对象（Account account）就可以
     * @return
     */
    @RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
    public String saveAccount(Account account){
        System.out.println("执行了。。。");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(User user){
        System.out.println("执行了。。。");
        System.out.println(user);
        return "success";
    }

    /**
     * 原生的servlet API获取
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
//        System.out.println(request);
//        HttpSession session = request.getSession();
//        System.out.println(session);
//        ServletContext servletContext = session.getServletContext();
//        System.out.println(servletContext);
        String id = request.getParameter("id");
        System.out.println(id);
        return "success";
    }
}
