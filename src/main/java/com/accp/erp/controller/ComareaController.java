package com.accp.erp.controller;


import com.accp.erp.entity.Comarea;
import com.accp.erp.service.IComareaService;
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
@RequestMapping("/comarea")
public class ComareaController {

    @Autowired
    IComareaService iComareaService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Comarea comarea){
        QueryWrapper wrapper = new QueryWrapper();
        if (comarea.getAreaID() != null) {
            wrapper.eq(Comarea.AREAID,comarea.getAreaID());
        }
        if (comarea.getAreaName() != null) {
            wrapper.like(Comarea.AREANAME,comarea.getAreaName());
        }
        if (comarea.getMemo() != null) {
            wrapper.like(Comarea.MEMO,comarea.getMemo());
        }
        if (comarea.getEngName() != null) {
            wrapper.like(Comarea.ENGNAME,comarea.getEngName());
        }
        IPage<Comarea> page = iComareaService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comarea> list = iComareaService.list();
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
    public Result add(@RequestBody Comarea comarea){
        iComareaService.save(comarea);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comarea comarea){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comarea.AREAID,comarea.getAreaID());
        iComareaService.update(comarea,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        iComareaService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comarea.AREAID,id);
        iComareaService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

