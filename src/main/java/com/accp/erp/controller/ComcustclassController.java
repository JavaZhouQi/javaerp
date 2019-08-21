package com.accp.erp.controller;


import com.accp.erp.entity.Comcustclass;
import com.accp.erp.service.IComcustclassService;
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
@RequestMapping("/comcustclass")
public class ComcustclassController {
    @Autowired
    IComcustclassService comcustclassService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Comcustclass comcustclass){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comcustclass.FLAG,comcustclass.getFlag());
        if (comcustclass.getClassID() != null) {
            wrapper.eq(Comcustclass.CLASSID,comcustclass.getClassID());
        }
        if (comcustclass.getClassName() != null) {
            wrapper.like(Comcustclass.CLASSNAME,comcustclass.getClassName());
        }
        if (comcustclass.getMemo() != null) {
            wrapper.like(Comcustclass.MEMO,comcustclass.getMemo());
        }
        if (comcustclass.getEngName() != null) {
            wrapper.like(Comcustclass.ENGNAME,comcustclass.getEngName());
        }
        IPage<Comcustclass> page = comcustclassService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comcustclass> list = comcustclassService.list();
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
    public Result add(@RequestBody Comcustclass comcustclass){
        comcustclassService.save(comcustclass);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comcustclass comcustclass){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comcustclass.CLASSID,comcustclass.getClassID());
        comcustclassService.update(comcustclass,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        comcustclassService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id,Integer flag){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comcustclass.CLASSID,id);
        wrapper.eq(Comcustclass.FLAG,flag);
        comcustclassService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

}

