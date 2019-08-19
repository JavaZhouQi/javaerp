package com.accp.erp.controller;


import com.accp.erp.entity.Cominvoicetype;
import com.accp.erp.service.ICominvoicetypeService;
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
 * @since 2019-08-13
 */
@RestController
@RequestMapping("/cominvoicetype")
public class CominvoicetypeController {

    @Autowired
    ICominvoicetypeService iCominvoicetypeService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Cominvoicetype cominvoicetype){
        QueryWrapper wrapper = new QueryWrapper();
        if (cominvoicetype.getId() != null) {
            wrapper.eq(Cominvoicetype.ID,cominvoicetype.getId());
        }
        if (cominvoicetype.getName() != null) {
            wrapper.like(Cominvoicetype.NAME,cominvoicetype.getName());
        }
        if (cominvoicetype.getRemark() != null) {
            wrapper.like(Cominvoicetype.REMARK,cominvoicetype.getRemark());
        }
        if (cominvoicetype.getEngName() != null) {
            wrapper.like(Cominvoicetype.ENGNAME,cominvoicetype.getEngName());
        }
        IPage<Cominvoicetype> page = iCominvoicetypeService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Cominvoicetype> list = iCominvoicetypeService.list();
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
    public Result add(@RequestBody Cominvoicetype cominvoicetype){
        iCominvoicetypeService.save(cominvoicetype);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Cominvoicetype cominvoicetype){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Cominvoicetype.ID,cominvoicetype.getId());
        iCominvoicetypeService.update(cominvoicetype,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        iCominvoicetypeService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Cominvoicetype.ID,id);
        iCominvoicetypeService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

}

