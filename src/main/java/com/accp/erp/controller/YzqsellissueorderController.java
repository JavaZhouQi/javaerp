package com.accp.erp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.entity.Comwarehouse;
import com.accp.erp.entity.Yzqsellissueorder;
import com.accp.erp.service.IYzqsellissueorderService;
import com.accp.erp.uitis.PageResult;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@RestController
@RequestMapping("/yzqsellissueorder")
public class YzqsellissueorderController {
	 @Autowired
	 IYzqsellissueorderService iYzqsellissueorderService;
	 
	 /**
	     * 分页查询
	     */
	    @RequestMapping("/findPage")
	    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
	                           @RequestParam(defaultValue = "10")Integer size,
	                           @RequestBody Yzqsellissueorder yzqsellissueorder){
	        QueryWrapper wrapper = new QueryWrapper();
	        if (yzqsellissueorder.getBillNo() != null) {
	            wrapper.eq(Yzqsellissueorder.BILLNO,yzqsellissueorder.getBillNo());
	        }
	        if (yzqsellissueorder.getCustShortName()!= null) {
	            wrapper.like(Yzqsellissueorder.CUSTSHORTNAME,yzqsellissueorder.getCustShortName());
	        }
	        if (yzqsellissueorder.getBillDate() != null) {
	            wrapper.like(Yzqsellissueorder.BILLDATE,yzqsellissueorder.getBillDate());
	        }
	        if (yzqsellissueorder.getWareName() != null) {
	            wrapper.like(Yzqsellissueorder.WARENAME,yzqsellissueorder.getWareName());
	        }
	        IPage<Yzqsellissueorder> page = iYzqsellissueorderService.page(new Page<>(current,size),wrapper);
	        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
	        return new Result(ResultCode.SUCCESS,pageResult);
	    }

	    @RequestMapping("/findAll")
	    public Result findAll(){
	        List<Yzqsellissueorder> list = iYzqsellissueorderService.list();
	        return new Result(ResultCode.SUCCESS,list);
	    }
	    /**
	     * 根据id查询
	     */
	    @RequestMapping("/findOne")
	    //billNo
	    public Result findOne(String id){
	        return new Result();
	    }

	    /**
	     * 添加
	     */
	    @RequestMapping("/add")
	    public Result add(@RequestBody Yzqsellissueorder yzqsellissueorder){
	    	iYzqsellissueorderService.save(yzqsellissueorder);
	        return new Result(ResultCode.SUCCESS,"新增成功");
	    }

	    /**
	     * 修改
	     */
	    @RequestMapping("/update")
	    public Result update(@RequestBody Yzqsellissueorder yzqsellissueorder){
	        QueryWrapper wrapper = new QueryWrapper();
	        wrapper.eq(Yzqsellissueorder.BILLNO,yzqsellissueorder.getBillNo());
	        iYzqsellissueorderService.update(yzqsellissueorder,wrapper);
	        return new Result(ResultCode.SUCCESS,"修改成功");
	    }

	    /**
	     * 批量删除
	     */
	    @RequestMapping("/dels")
	    public Result dels(List<String> ids){
	    	iYzqsellissueorderService.removeByIds(ids);
	        return new Result(ResultCode.SUCCESS,"删除成功");
	    }
	    /**
	     * 单个删除
	     */
	    @RequestMapping("/del")
	    public Result del(String id){
	        QueryWrapper wrapper = new QueryWrapper();
	        wrapper.eq(Yzqsellissueorder.BILLNO,id);
	        iYzqsellissueorderService.remove(wrapper);
	        return new Result(ResultCode.SUCCESS,"删除成功");
	    }
		
}

