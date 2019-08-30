package com.accp.erp.controller;


import com.accp.erp.entity.SysPermissions;
import com.accp.erp.service.ISysPermissionsService;
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
@RequestMapping("/sysPermissions")
public class SysPermissionsController {

    @Autowired
    ISysPermissionsService sysPermissionsService;

    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody SysPermissions sysPermissions){
        QueryWrapper wrapper = new QueryWrapper();
        if (sysPermissions.getId() != null) {
            wrapper.eq(SysPermissions.ID,sysPermissions.getId());
        }
        if (sysPermissions.getDescription() != null) {
            wrapper.like(SysPermissions.DESCRIPTION,sysPermissions.getDescription());
        }
        IPage<SysPermissions> page = sysPermissionsService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<SysPermissions> list = sysPermissionsService.list();
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
    public Result add(@RequestBody SysPermissions sysPermissions){
        sysPermissionsService.save(sysPermissions);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody SysPermissions sysPermissions){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(SysPermissions.ID,sysPermissions.getId());
        sysPermissionsService.update(sysPermissions,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        sysPermissionsService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(SysPermissions.ID,id);
        sysPermissionsService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 批量新增
     */
    @RequestMapping("/adds")
    public Result add(@RequestBody List<SysPermissions> list){
        sysPermissionsService.saveBatch(list);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }
}

