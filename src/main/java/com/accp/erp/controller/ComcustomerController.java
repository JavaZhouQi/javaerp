package com.accp.erp.controller;


import com.accp.erp.entity.Comcustomer;
import com.accp.erp.service.IComcustomerService;
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
@RequestMapping("/comcustomer")
public class ComcustomerController {
    @Autowired
    IComcustomerService comcustomerService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Comcustomer comcustomer){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comcustomer.FLAG,comcustomer.getFlag());
        if (comcustomer.getId() != null) {
            wrapper.eq(Comcustomer.ID,comcustomer.getId());
        }
        if (comcustomer.getFullName() != null) {
            wrapper.like(Comcustomer.FULLNAME,comcustomer.getFullName());
        }

        IPage<Comcustomer> page = comcustomerService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comcustomer> list = comcustomerService.list();
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
    public Result add(@RequestBody Comcustomer comcustomer){
        comcustomerService.save(comcustomer);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comcustomer comcustomer){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comcustomer.ID,comcustomer.getId());
        wrapper.eq(Comcustomer.FLAG,comcustomer.getFlag());
        comcustomerService.update(comcustomer,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        comcustomerService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id,Integer flag){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comcustomer.ID,id);
        wrapper.eq(Comcustomer.FLAG,flag);
        comcustomerService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

