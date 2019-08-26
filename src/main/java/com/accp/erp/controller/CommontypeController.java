package com.accp.erp.controller;


import com.accp.erp.entity.Commontype;
import com.accp.erp.service.ICommontypeService;
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
 * @since 2019-08-26
 */
@RestController
@RequestMapping("/commontype")
public class CommontypeController {

    @Autowired
    ICommontypeService commontypeService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Commontype commontype){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Commontype.FLAG,commontype.getFlag());
        if (commontype.getTypeId() != null) {
            wrapper.eq(Commontype.TYPEID,commontype.getTypeId());
        }
        if (commontype.getTypeName() != null) {
            wrapper.like(Commontype.TYPENAME,commontype.getTypeName());
        }
        if (commontype.getMemo() != null) {
            wrapper.like(Commontype.MEMO,commontype.getMemo());
        }
        if (commontype.getEngName() != null) {
            wrapper.like(Commontype.ENGNAME,commontype.getEngName());
        }
        IPage<Commontype> page = commontypeService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }


    /**
     * 根据分类查询
     */
    @RequestMapping("/findByFlag")
    public Result findByFlag(Integer flag){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Commontype.FLAG,flag);
        List<Commontype> list = commontypeService.list(wrapper);
        return new Result(ResultCode.SUCCESS,list);
    }


    @RequestMapping("/findAll")
    public Result findAll(){
        List<Commontype> list = commontypeService.list();
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
    public Result add(@RequestBody Commontype commontype){
        commontypeService.save(commontype);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Commontype commontype){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Commontype.TYPEID,commontype.getTypeId());
        commontypeService.update(commontype,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        commontypeService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id,Integer flag){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Commontype.TYPEID,id);
        wrapper.eq(Commontype.FLAG,flag);
        commontypeService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

}

