package com.accp.erp.controller;


import com.accp.erp.entity.Combank;
import com.accp.erp.service.ICombankService;
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
@RequestMapping("/combank")
public class CombankController {

    @Autowired
    ICombankService iCombankService;

    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Combank combank){
        QueryWrapper wrapper = new QueryWrapper();
        if (combank.getBankID() != null) {
            wrapper.eq(Combank.BANKID,combank.getBankID());
        }
        if (combank.getBankName() != null) {
            wrapper.like(Combank.BANKNAME,combank.getBankName());
        }
        if (combank.getMemo() != null) {
            wrapper.like(Combank.MEMO,combank.getMemo());
        }
        if (combank.getEngName() != null) {
            wrapper.like(Combank.ENGNAME,combank.getEngName());
        }
        IPage<Combank> page = iCombankService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Combank> list = iCombankService.list();
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
    public Result add(@RequestBody Combank combank){
        iCombankService.save(combank);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Combank combank){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Combank.BANKID,combank.getBankID());
        iCombankService.update(combank,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        iCombankService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Combank.BANKID,id);
        iCombankService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

