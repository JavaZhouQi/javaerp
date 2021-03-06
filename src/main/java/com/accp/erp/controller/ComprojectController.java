package com.accp.erp.controller;


import com.accp.erp.entity.Comdepartment;
import com.accp.erp.entity.Comproject;
import com.accp.erp.service.IComprojectService;
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
@RequestMapping("/comproject")
public class ComprojectController {

    @Autowired
    IComprojectService comprojectService;

    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody  Comproject comproject){
        QueryWrapper wrapper = new QueryWrapper();
        if (comproject.getProjectID() != null) {
            wrapper.eq(Comproject.PROJECTID,comproject.getProjectID());
        }
        if (comproject.getProjectName() != null) {
            wrapper.like(Comproject.PROJECTNAME,comproject.getProjectName());
        }
        if (comproject.getEngName() != null) {
            wrapper.like(Comproject.ENGNAME,comproject.getEngName());
        }
        if (comproject.getMemo() != null) {
            wrapper.like(Comproject.MEMO,comproject.getMemo());
        }
        IPage<Comdepartment> page = comprojectService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comproject> list = comprojectService.list();
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
    public Result add(@RequestBody Comproject comproject){
        comprojectService.save(comproject);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comproject comproject){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comproject.PROJECTID,comproject.getProjectID());
        comprojectService.update(comproject,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        comprojectService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comproject.PROJECTID,id);
        comprojectService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

