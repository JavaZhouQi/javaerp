package com.accp.erp.controller;


import com.accp.erp.entity.SysRoles;
import com.accp.erp.entity.SysRolesPermissions;
import com.accp.erp.service.ISysRolesPermissionsService;
import com.accp.erp.service.ISysRolesService;
import com.accp.erp.uitis.PageResult;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-07
 */
@RestController
@RequestMapping("/sysRoles")
public class SysRolesController {

    @Autowired
    ISysRolesService sysRolesService;

    @Autowired
    ISysRolesPermissionsService rolesPermissionsService;

    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody SysRoles sysRoles){
        QueryWrapper wrapper = new QueryWrapper();
        if (sysRoles.getId() != null) {
            wrapper.eq(SysRoles.ID,sysRoles.getId());
        }
        if (sysRoles.getRole() != null) {
            wrapper.like(SysRoles.ROLE,sysRoles.getRole());
        }
        IPage<SysRoles> page = sysRolesService.myFindPage(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<SysRoles> list = sysRolesService.list();
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
    public Result add(@RequestBody SysRoles sysRoles){
        sysRolesService.save(sysRoles);
        addRolesPermission(sysRoles);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SysRoles sysRoles){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(SysRoles.ID,sysRoles.getId());
        sysRolesService.update(sysRoles,wrapper);
        QueryWrapper wrapper1 = new QueryWrapper();
        wrapper1.eq(SysRolesPermissions.ROLE_ID,sysRoles.getId());
        rolesPermissionsService.remove(wrapper1);
        addRolesPermission(sysRoles);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }
    // 新增角色权限关联表
    private void addRolesPermission(SysRoles sysRoles) {
        for (Long permissionId : sysRoles.getPermissionsIdList()) {
            SysRolesPermissions rolesPermissions = new SysRolesPermissions();
            rolesPermissions.setRoleId(sysRoles.getId());
            rolesPermissions.setPermissionId(permissionId);
            rolesPermissionsService.save(rolesPermissions);
        }
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        sysRolesService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(SysRoles.ID,id);
        sysRolesService.remove(wrapper);
        QueryWrapper wrapper1 = new QueryWrapper();
        wrapper1.eq(SysRolesPermissions.ROLE_ID,id);
        rolesPermissionsService.remove(wrapper1);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

}

