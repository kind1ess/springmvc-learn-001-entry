package com.kind1ess.controller;


import com.kind1ess.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})
public class AnnotationController {


    /**
     * RequestParam注解，用于修饰参数，让其接受客户端发来强求的参数
     *      属性：name、value：用于指定前端发来参数的key，此时参数的value就会赋值给方法的传入参数
     *          required：表示客户端请求的参数名称是否必须为属性name或者value的值，默认值为true
     * @param name
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "username") String name){
        System.out.println("执行了。。。");
        System.out.println(name);
        return "success";
    }

    /**
     * RequestBody注解，用于修饰传入参数，让其接收客户端发来的请求的请求体，get方法不适用
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了。。");
        System.out.println(body);
        return "success";
    }

    /**
     *  restful风格：将请求参数直接放到请求的路径中，在服务器端直接通过请求参数和请求类型来定位要执行的方法
     *  不用再多写每个方法的路径
     *  PathVariable注解，用于修饰传入参数，让其接收请求路径的参数
     *      属性：name、value：用于指定路径参数的key值
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(name = "id") String id){
        System.out.println("执行了。。。");
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("执行。。。");
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("执行了。。。");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute注解加在参数上，表示从map中取值传给参数
     * @param user
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("user") User user){
        System.out.println("testModelAttribute执行了。。。");
        System.out.println(user);
        return "success";
    }

    /**
     * ModelAttribute注解的方法会先于testModelAttribute执行
    @ModelAttribute
    public User showUser(String name){
        System.out.println("showUser方法执行了。。。");
        User user = new User(name,20,new Date());
        return user;
    }*/

    /**
     * 无返回值类型的，传入一个Map集合，并将数据存入map中
     * @param name
     * @param map
     */
    @ModelAttribute
    public void showUser(String name, Map<String,User> map){
        System.out.println("showUser方法执行了。。。");
        User user = new User(name,20,new Date());
        map.put("user",user);
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testModelAttribute执行了。。。");
        model.addAttribute("msg","康康");
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("getSessionAttributes。。。");
        System.out.println(modelMap.getAttribute("msg"));
        return "success";
    }

    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus sessionStatus){
        System.out.println("delSessionAttributes。。。");
        sessionStatus.setComplete();
        return "success";
    }
}
