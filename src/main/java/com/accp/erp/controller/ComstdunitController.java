package com.accp.erp.controller;


import com.accp.erp.entity.Comstdunit;
import com.accp.erp.service.IComstdunitService;
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
 * @since 2019-08-15
 */
@RestController
@RequestMapping("/comstdunit")
public class ComstdunitController {
    @Autowired
    IComstdunitService comstdunitService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Comstdunit comstdunit){
        QueryWrapper wrapper = new QueryWrapper();
        if (comstdunit.getUnitID() != null) {
            wrapper.eq(Comstdunit.UNITID,comstdunit.getUnitID());
        }
        if (comstdunit.getUnitName() != null) {
            wrapper.like(Comstdunit.UNITNAME,comstdunit.getUnitName());
        }
        if (comstdunit.getMemo() != null) {
            wrapper.like(Comstdunit.MEMO,comstdunit.getMemo());
        }
        if (comstdunit.getEngName() != null) {
            wrapper.like(Comstdunit.ENGNAME,comstdunit.getEngName());
        }
        IPage<Comstdunit> page = comstdunitService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comstdunit> list = comstdunitService.list();
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
    public Result add(@RequestBody Comstdunit comstdunit){
        comstdunitService.save(comstdunit);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comstdunit comstdunit){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comstdunit.UNITID,comstdunit.getUnitID());
        comstdunitService.update(comstdunit,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        comstdunitService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comstdunit.UNITID,id);
        comstdunitService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

