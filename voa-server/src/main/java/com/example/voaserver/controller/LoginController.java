package com.example.voaserver.controller;

import com.example.voaserver.pojo.Admin;
import com.example.voaserver.pojo.AdminLoginParam;
import com.example.voaserver.pojo.RespBean;
import com.example.voaserver.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @author Brilley
 * @description voa-server
 * @date 2022-04-10 18:21
 */

@Api(tags="LoginController")
@RestController
public class LoginController {

    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "登陆之后返回token")
    @PostMapping("/login")
    public RespBean login(AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }

    @ApiOperation(value="退出登陆")
    @PostMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功!");
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @GetMapping("/admin/info")
    public Admin getAdminInfo(Principal principal){
        if (principal == null){
            return null;
        }
        String username = principal.getName();
        Admin admin = adminService.getAdminByUserName(username);
        admin.setPassword(null);
        //admin.setRoles(adminService.getRolesByAdminId(admin.getId()));
        return admin;
    }

}
