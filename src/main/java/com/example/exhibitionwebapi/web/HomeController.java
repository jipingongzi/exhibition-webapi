package com.example.exhibitionwebapi.web;

import com.example.exhibitionwebapi.dto.Msg;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "/index";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_admin')")
    @ResponseBody
    public String admin(){
        return "admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_user')")
    @ResponseBody
    public String user(){
        return "user";
    }

    @GetMapping("/useradmin")
    @PreAuthorize("hasRole('ROLE_user') OR hasRole('ROLE_admin')")
    @ResponseBody
    public String useradmin(){
        int a = 1 / 0;
        return "useradmin";
    }
}
