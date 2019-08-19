package com.accp.erp.controller;

import com.accp.erp.entity.Comdepartment;
import com.accp.erp.service.IComdepartmentService;
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
 * @author zq
 * @since 2019-08-07
 */
@RestController
@RequestMapping("/comdepartment")
public class ComdepartmentController {

    @Autowired
    IComdepartmentService comdepartmentService;

    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Comdepartment comdepartment){
        QueryWrapper wrapper = new QueryWrapper();
        if (comdepartment.getDepartID() != null) {
            wrapper.eq(Comdepartment.DEPARTID,comdepartment.getDepartID());
        }
        if (comdepartment.getDepartName() != null) {
            wrapper.like(Comdepartment.DEPARTNAME,comdepartment.getDepartName());
        }
        if (comdepartment.getMemo() != null) {
            wrapper.like(Comdepartment.MEMO,comdepartment.getMemo());
        }
        if (comdepartment.getEngName() != null) {
            wrapper.like(Comdepartment.ENGNAME,comdepartment.getEngName());
        }
        IPage<Comdepartment> page = comdepartmentService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Comdepartment> list = comdepartmentService.list();
        return new Result(ResultCode.SUCCESS,list);
}
    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public Result findOne(String id){
        return new Result();
    }

    /**
     * 添加
     * @param comdepartment
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Comdepartment comdepartment){
        comdepartmentService.save(comdepartment);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Comdepartment comdepartment){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Comdepartment.DEPARTID,comdepartment.getDepartID());
        comdepartmentService.update(comdepartment,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
        comdepartmentService.removeByIds(ids);
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
        wrapper.eq(Comdepartment.DEPARTID,id);
        comdepartmentService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

