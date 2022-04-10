package com.example.voaserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.voaserver.pojo.Admin;
import com.example.voaserver.pojo.RespBean;
import com.example.voaserver.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Brilley
 * @description voa-server
 * @date 2022-04-10 18:37
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登陆之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);

//    //根据用户名获取用户信息
//    Admin getAdminByUserName(String username);
//
//    /**
//     * 根据用户ID查询角色列表
//     * @param adminId
//     * @return
//     */
//    List<Role> getRolesByAdminId(Integer adminId);

}
