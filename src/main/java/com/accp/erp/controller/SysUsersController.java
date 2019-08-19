package com.accp.erp.controller;


import com.accp.erp.entity.SysPermissions;
import com.accp.erp.entity.SysRoles;
import com.accp.erp.entity.SysUsers;
import com.accp.erp.service.ISysUsersService;
import com.accp.erp.service.impl.SysUsersServiceImpl;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.alibaba.fastjson.JSON;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-04
 */
@RestController
@RequestMapping("/sysUsers")
public class SysUsersController {

    @Autowired
    ISysUsersService usersService;

    @RequestMapping("/login")
    public Result login(@RequestBody SysUsers sysUsers, HttpSession httpSession){
        UsernamePasswordToken upToken = new UsernamePasswordToken(sysUsers.getUsername(),sysUsers.getPassword());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(upToken);
            SysUsers user = usersService.findByUsername(sysUsers.getUsername());
            Set<SysPermissions> permissionsList = new HashSet<>();
            for (SysRoles sysRoles : user.getRolesList()) {
                for (SysPermissions sysPermissions : sysRoles.getPermissionsList()) {
                    permissionsList.add(sysPermissions);
                }
            }
            String sessionId = httpSession.getId();
            Map<String,Object> map = new HashMap<>();
            // 存储权限
            map.put("permissions",permissionsList);
            map.put("sessionId",sessionId);
            return new Result(ResultCode.SUCCESS,map);
        } catch (UnknownAccountException e) {
            return new Result(ResultCode.FAIL,"用户名不存在！");
        }catch (IncorrectCredentialsException e){
            return new Result(ResultCode.FAIL,"密码错误！");
        }catch (Exception e){
            return new Result(ResultCode.SERVER_ERROR,"出现异常" + e);
        }
    }

    @RequiresPermissions("sys:user")
    @RequestMapping("/findUser")
    public Result findUser(){
        return new Result(ResultCode.SUCCESS);
    }


}

