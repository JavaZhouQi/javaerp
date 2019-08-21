package com.accp.erp.controller;


import com.accp.erp.entity.Comcustomerlevel;
import com.accp.erp.service.IComcustomerlevelService;
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
@RequestMapping("/comcustomerlevel")
public class ComcustomerlevelController {
    @Autowired
    IComcustomerlevelService comcustomerlevelService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Comcustomerlevel comcustomerlevel){
        QueryWrapper wrapper = new QueryWrapper();
        if (comcustomerlevel.getLevelID() != null) {
            wrapper.eq(Comcustomerlevel.LEVELID,comcustomerlevel.getLevelID());
        }
        if (comcustomerlevel.getLevelName() != null) {
            wrapper.like(Comcustomerlevel.LEVELNAME,comcustomerlevel.getLevelName());
        }
        if (comcustomerlevel.getMemo() != null) {
            wrapper.like(Comcustomerlevel.MEMO,comcustomerlevel.getMemo());
        }
        IPage<Comcustomerlevel> page = comcustomerlevelService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comcustomerlevel> list = comcustomerlevelService.list();
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
    public Result add(@RequestBody Comcustomerlevel comcustomerlevel){
        comcustomerlevelService.save(comcustomerlevel);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comcustomerlevel comcustomerlevel){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comcustomerlevel.LEVELID,comcustomerlevel.getLevelID());
        comcustomerlevelService.update(comcustomerlevel,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        comcustomerlevelService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(String id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comcustomerlevel.LEVELID,id);
        comcustomerlevelService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

}

