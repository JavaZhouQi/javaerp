package com.accp.erp.controller;


import com.accp.erp.entity.SysPermissions;
import com.accp.erp.entity.SysRoles;
import com.accp.erp.entity.SysUsers;
import com.accp.erp.entity.SysUsersRoles;
import com.accp.erp.service.ISysUsersRolesService;
import com.accp.erp.service.ISysUsersService;
import com.accp.erp.service.impl.SysUsersServiceImpl;
import com.accp.erp.uitis.PageResult;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

import org.springframework.web.bind.annotation.RequestParam;
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

    @Autowired
    ISysUsersRolesService usersRolesService;

    /**
     * 登录认证
     */
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
            SysUsers users = (SysUsers) SecurityUtils.getSubject().getPrincipal();
            map.put("session",users);
            return new Result(ResultCode.SUCCESS,map);
        } catch (UnknownAccountException e) {
            return new Result(ResultCode.FAIL,"用户名不存在！");
        }catch (IncorrectCredentialsException e){
            return new Result(ResultCode.FAIL,"密码错误！");
        }catch (Exception e){
            return new Result(ResultCode.SERVER_ERROR,"出现异常" + e);
        }
    }
    // 权限测试
    @RequiresPermissions("sys:user")
    @RequestMapping("/findUser")
    public Result findUser(){
        return new Result(ResultCode.SUCCESS);
    }

    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody SysUsers sysUsers){
        QueryWrapper wrapper = new QueryWrapper();
        if (sysUsers.getId() != null) {
            wrapper.eq(SysUsers.ID,sysUsers.getId());
        }
        if (sysUsers.getUsername() != null) {
            wrapper.like(SysUsers.USERNAME,sysUsers.getUsername());
        }
        IPage<SysUsers> page = usersService.myFindPage(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<SysUsers> list = usersService.list();
        return new Result(ResultCode.SUCCESS,list);
    }
    /**
     * 根据id查询
     */
    @RequestMapping("/findOne")
    public Result findOne(String id){
        return new Result();
    }

    /**
     * 添加
     */
    @RequestMapping("/add")
    public Result add(@RequestBody SysUsers sysUsers){
        usersService.save(sysUsers);
        for (Long rolesId : sysUsers.getRolesIdList()) {
            SysUsersRoles sysUsersRoles = new SysUsersRoles();
            sysUsersRoles.setRoleId(rolesId);
            sysUsersRoles.setUserId(sysUsers.getId());
            usersRolesService.save(sysUsersRoles);
        }
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SysUsers sysUsers){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(SysUsers.ID,sysUsers.getId());
        usersService.update(sysUsers,wrapper);

        // 删除用户和角色的关联
        QueryWrapper wrapper1 = new QueryWrapper();
        wrapper1.eq(SysUsersRoles.USER_ID,sysUsers.getId());
        usersRolesService.remove(wrapper1);

        // 新增用户和角色的关联
        for (Long rolesId : sysUsers.getRolesIdList()) {
            SysUsersRoles sysUsersRoles = new SysUsersRoles();
            sysUsersRoles.setRoleId(rolesId);
            sysUsersRoles.setUserId(sysUsers.getId());
            usersRolesService.save(sysUsersRoles);
        }
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        usersService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(SysUsers.ID,id);
        usersService.remove(wrapper);
        // 删除用户和角色的关联
        QueryWrapper wrapper1 = new QueryWrapper();
        wrapper1.eq(SysUsersRoles.USER_ID,id);
        usersRolesService.remove(wrapper1);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }


}

