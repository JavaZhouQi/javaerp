package com.accp.erp.controller;


import com.accp.erp.entity.Comwarehouse;
import com.accp.erp.service.IComwarehouseService;
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
@RequestMapping("/comwarehouse")
public class ComwarehouseController {
    @Autowired
    IComwarehouseService iComwarehouseService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Comwarehouse comwarehouse){
        QueryWrapper wrapper = new QueryWrapper();
        if (comwarehouse.getWareHouseID() != null) {
            wrapper.eq(Comwarehouse.WAREHOUSEID,comwarehouse.getWareHouseID());
        }
        if (comwarehouse.getWareHouseName() != null) {
            wrapper.like(Comwarehouse.WAREHOUSENAME,comwarehouse.getWareHouseName());
        }
        if (comwarehouse.getMemo() != null) {
            wrapper.like(Comwarehouse.MEMO,comwarehouse.getMemo());
        }
        if (comwarehouse.getEngName() != null) {
            wrapper.like(Comwarehouse.ENGNAME,comwarehouse.getEngName());
        }
        IPage<Comwarehouse> page = iComwarehouseService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comwarehouse> list = iComwarehouseService.list();
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
    public Result add(@RequestBody Comwarehouse comwarehouse){
        iComwarehouseService.save(comwarehouse);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comwarehouse comwarehouse){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comwarehouse.WAREHOUSEID,comwarehouse.getWareHouseID());
        iComwarehouseService.update(comwarehouse,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        iComwarehouseService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comwarehouse.WAREHOUSEID,id);
        iComwarehouseService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }


    @RequestMapping("/findByTable")
    public Result findByTable(@RequestBody Comwarehouse comwarehouse){
        QueryWrapper wrapper = new QueryWrapper();
        if (comwarehouse.getWareHouseID() != null) {
            wrapper.like(Comwarehouse.WAREHOUSEID,comwarehouse.getWareHouseID());
        }
        if (comwarehouse.getWareHouseName() != null) {
            wrapper.like(Comwarehouse.WAREHOUSENAME,comwarehouse.getWareHouseName());
        }
        if (comwarehouse.getEngName() != null) {
            wrapper.like(Comwarehouse.ENGNAME,comwarehouse.getEngName());
        }
        List list = iComwarehouseService.list(wrapper);
        return new Result(ResultCode.SUCCESS,list);
    }
}

