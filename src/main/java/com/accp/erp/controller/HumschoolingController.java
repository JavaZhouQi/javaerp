package com.accp.erp.controller;


import com.accp.erp.entity.Humschooling;
import com.accp.erp.service.IHumschoolingService;
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
 * @since 2019-08-10
 */
@RestController
@RequestMapping("/humschooling")
public class HumschoolingController {

    @Autowired
    IHumschoolingService humschoolingService;

    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Humschooling humschooling){
        QueryWrapper wrapper = new QueryWrapper();
        if (humschooling.getSchoolingID() != null) {
            wrapper.eq(Humschooling.SCHOOLINGID,humschooling.getSchoolingID());
        }
        if (humschooling.getSchoolingName() != null) {
            wrapper.like(Humschooling.SCHOOLINGNAME,humschooling.getSchoolingName());
        }
        if (humschooling.getMemo() != null) {
            wrapper.like(Humschooling.MEMO,humschooling.getMemo());
        }
        if (humschooling.getEngName() != null) {
            wrapper.like(Humschooling.ENGNAME,humschooling.getEngName());
        }
        IPage<Humschooling> page = humschoolingService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Humschooling> list = humschoolingService.list();
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
    public Result add(@RequestBody Humschooling humschooling){
        humschoolingService.save(humschooling);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Humschooling humschooling){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Humschooling.SCHOOLINGID,humschooling.getSchoolingID());
        humschoolingService.update(humschooling,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        humschoolingService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Humschooling.SCHOOLINGID,id);
        humschoolingService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

