package com.accp.erp.controller;


import com.accp.erp.entity.Combankcls;
import com.accp.erp.service.ICombankclsService;
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
 * @since 2019-08-11
 */
@RestController
@RequestMapping("/combankcls")
public class CombankclsController {

    @Autowired
    ICombankclsService iCombankclsService;

    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Combankcls combankcls){
        QueryWrapper wrapper = new QueryWrapper();
        if (combankcls.getBankClsID() != null) {
            wrapper.eq(Combankcls.BANKCLSID,combankcls.getBankClsID());
        }
        if (combankcls.getBankClsName() != null) {
            wrapper.like(Combankcls.BANKCLSNAME,combankcls.getBankClsName());
        }
        if (combankcls.getMemo() != null) {
            wrapper.like(Combankcls.MEMO,combankcls.getMemo());
        }
        if (combankcls.getEngName() != null) {
            wrapper.like(Combankcls.ENGNAME,combankcls.getEngName());
        }
        IPage<Combankcls> page = iCombankclsService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Combankcls> list = iCombankclsService.list();
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
    public Result add(@RequestBody Combankcls combankcls){
        iCombankclsService.save(combankcls);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Combankcls combankcls){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Combankcls.BANKCLSID,combankcls.getBankClsID());
        iCombankclsService.update(combankcls,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        iCombankclsService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Combankcls.BANKCLSID,id);
        iCombankclsService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

