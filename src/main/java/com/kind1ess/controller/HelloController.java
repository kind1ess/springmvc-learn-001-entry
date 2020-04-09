package com.kind1ess.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello SpringMvc");
        return "success";
    }

    /**
     * 属性：
     *      value、path：指定当前方法的路径
     *      method：限制请求的方法
     *      params：指定请求的参数
     * @return
     */
    @RequestMapping(path = "/testRequestMapping",method = RequestMethod.GET,params = {"username","password"},headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解");
        return "success";
    }

}
