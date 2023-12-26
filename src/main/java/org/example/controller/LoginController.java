package org.example.controller;

import org.example.pojo.User;
import org.example.response.RespBody;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@ResponseBody
public class LoginController {

    @Autowired
    UserService us;

    // 登录页面
    @RequestMapping("/login")
    public RespBody login(@RequestBody User sysUser, HttpSession session){
        User su= us.loginC(sysUser.getAccount(),sysUser.getPassword());
        if (null!=su){
            session.setAttribute("loginInfo", su);
            return new RespBody(200,su,"成功");
        }
        return new RespBody(400,null,"用户名或密码输入错误");
    }
}