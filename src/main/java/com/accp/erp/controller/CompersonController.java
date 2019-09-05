package com.accp.erp.controller;


import com.accp.erp.entity.Comperson;
import com.accp.erp.service.ICompersonService;
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
 * @since 2019-08-23
 */
@RestController
@RequestMapping("/comperson")
public class CompersonController {

    @Autowired
    ICompersonService compersonService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Comperson comperson){
        QueryWrapper wrapper = new QueryWrapper();
        if (comperson.getPersonID() != null) {
            wrapper.eq(Comperson.PERSONID,comperson.getPersonID());
        }
        if (comperson.getPersonName() != null) {
            wrapper.like(Comperson.PERSONNAME,comperson.getPersonName());
        }
        if (comperson.getMemo() != null) {
            wrapper.like(Comperson.MEMO,comperson.getMemo());
        }
        if (comperson.getEngName() != null) {
            wrapper.like(Comperson.ENGNAME,comperson.getEngName());
        }
        IPage<Comperson> page = compersonService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comperson> list = compersonService.list();
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
    public Result add(@RequestBody Comperson comperson){
        compersonService.save(comperson);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comperson comperson){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comperson.PERSONID,comperson.getPersonID());
        compersonService.update(comperson,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        compersonService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comperson.PERSONID,id);
        compersonService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 带条件查询
     */
    @RequestMapping("/findByTable")
    public Result findByTable(@RequestBody Comperson comperson){
        QueryWrapper wrapper = new QueryWrapper();
        if (comperson.getPersonID() != null) {
            wrapper.like(Comperson.PERSONID,comperson.getPersonID());
        }
        if (comperson.getPersonName() != null) {
            wrapper.like(Comperson.PERSONNAME,comperson.getPersonName());
        }
        if (comperson.getMemo() != null) {
            wrapper.like(Comperson.MEMO,comperson.getMemo());
        }
        if (comperson.getEngName() != null) {
            wrapper.like(Comperson.ENGNAME,comperson.getEngName());
        }
        List list = compersonService.list(wrapper);
        return new Result(ResultCode.SUCCESS,list);
    }

}

