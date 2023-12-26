package org.example.controller;

import org.example.pojo.dto.UserFront;
import org.example.response.RespBody;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@ResponseBody
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService us;

    @RequestMapping("/logout")
    public RespBody logout( HttpServletRequest request){
        HttpSession session=request.getSession();
        session.setAttribute("loginInfo",null);
        return new RespBody(200,null,"登出成功");
    }
}