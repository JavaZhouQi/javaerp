package com.accp.erp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.entity.Chlsmbinvoicemain;
import com.accp.erp.entity.Chlsmbinvoicesub;
import com.accp.erp.service.IChlsmbinvoicemainService;
import com.accp.erp.service.IChlsmbinvoicesubService;
import com.accp.erp.uitis.PageResult;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 销售发票主表 前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@RestController
@RequestMapping("/chlsmbinvoicemain")
public class ChlsmbinvoicemainController {
	 @Autowired
	    IChlsmbinvoicemainService chlsmbinvoicemainService;

	    @Autowired
	    IChlsmbinvoicesubService chlsmbinvoicesubService;

	    /**
	     * 分页查询
	     */
	    @RequestMapping("/findPage")
	    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
	                           @RequestParam(defaultValue = "10")Integer size,
	                           @RequestBody Chlsmbinvoicemain chlsmbinvoicemain){
	        QueryWrapper wrapper = new QueryWrapper();
	        wrapper.eq(Chlsmbinvoicemain.FLAG,chlsmbinvoicemain.getFlag());
	        if (chlsmbinvoicemain.getBillNo() != null) {
	            wrapper.eq(chlsmbinvoicemain.BILLNO,chlsmbinvoicemain.getBillNo());
	        }
	        if (chlsmbinvoicemain.getExportID() != null) {
	            wrapper.like(chlsmbinvoicemain.EXPORTID,chlsmbinvoicemain.getExportID());
	        }

//	        IPage<Comcustomer> page = comcustomerService.page(new Page<>(current,size),wrapper);
//	        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
	        IPage page = chlsmbinvoicemainService.select(new Page(current,size),wrapper);
	        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

	        return new Result(ResultCode.SUCCESS,pageResult);
	    }

	    @RequestMapping("/findAll")
	    public Result findAll(){
	        List<Chlsmbinvoicemain> list = chlsmbinvoicemainService.list();
	        return new Result(ResultCode.SUCCESS,list);
	    }
	    /**
	     * 根据id查询
	     */
	    @RequestMapping("/findOne")
	    public Result findOne(String billNo){
	        return new Result();
	    }

	    /**
	     * 添加
	     */
	    @RequestMapping("/add")
	    public Result add(@RequestBody Chlsmbinvoicemain chlsmbinvoicemain){
	    	chlsmbinvoicemainService.save(chlsmbinvoicemain);
	        // 保存内容及清单明细表
	        if (chlsmbinvoicemain.getChlsmbinvoicesubList() != null) {
	            for (Chlsmbinvoicesub chlsmbinvoicesub : chlsmbinvoicemain.getChlsmbinvoicesubList()) {
	            	chlsmbinvoicesub.setBillNo(chlsmbinvoicemain.getBillNo());
	            	chlsmbinvoicesub.setFlag(chlsmbinvoicemain.getFlag());
	            	chlsmbinvoicesubService.save(chlsmbinvoicesub);
	            }
	        }
	        return new Result(ResultCode.SUCCESS,"新增成功");
	    }

	    /**
	     * 修改
	     */
	    @RequestMapping("/update")
	    public Result update(@RequestBody Chlsmbinvoicemain chlsmbinvoicemain){
	        QueryWrapper wrapper = new QueryWrapper();
	        wrapper.eq(Chlsmbinvoicemain.BILLNO,chlsmbinvoicemain.getBillNo());
	        wrapper.eq(Chlsmbinvoicemain.FLAG,chlsmbinvoicemain.getFlag());
	        chlsmbinvoicemainService.update(chlsmbinvoicemain,wrapper);
	        // 保存客户编号
	        if (chlsmbinvoicemain.getChlsmbinvoicesubList() != null) {
	            QueryWrapper queryWrapper = new QueryWrapper();
	            queryWrapper.eq(Chlsmbinvoicesub.FLAG,chlsmbinvoicemain.getFlag());
	            queryWrapper.eq(Chlsmbinvoicesub.BILLNO,chlsmbinvoicemain.getBillNo());
	            chlsmbinvoicesubService.remove(queryWrapper);
	            for (Chlsmbinvoicesub chlsmbinvoicesub : chlsmbinvoicemain.getChlsmbinvoicesubList()) {
	            	chlsmbinvoicesub.setBillNo(chlsmbinvoicemain.getBillNo());
	            	chlsmbinvoicesub.setFlag(chlsmbinvoicemain.getFlag());
	            	chlsmbinvoicesubService.save(chlsmbinvoicesub);
	            }
	        }

	        return new Result(ResultCode.SUCCESS,"修改成功");
	    }

	    /**
	     * 批量删除
	     */
	    @RequestMapping("/dels")
	    public Result dels(List<Integer> billNo){
	    	chlsmbinvoicemainService.removeByIds(billNo);
	        return new Result(ResultCode.SUCCESS,"删除成功");
	    }

	    /**
	     * 单个删除
	     */
	    @RequestMapping("/del")
	    public Result del(Integer billNo,Integer flag){
	        QueryWrapper wrapper = new QueryWrapper();
	        wrapper.eq(Chlsmbinvoicemain.BILLNO,billNo);
	        wrapper.eq(Chlsmbinvoicemain.FLAG,flag);
	        chlsmbinvoicemainService.remove(wrapper);
	        return new Result(ResultCode.SUCCESS,"删除成功");
	    }
}

