package com.accp.erp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.entity.Comperson;
import com.accp.erp.entity.Lypurchaseinvoice;
import com.accp.erp.service.ILypurchaseinvoiceService;
import com.accp.erp.uitis.PageResult;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  	采购发票主表(lypurchaseinvoice)
 * </p>
 *
 * @author 李佑
 * @since 2019-08-29
 */
@RestController
@RequestMapping("/lypurchaseinvoice")
public class LypurchaseinvoiceController {
	
	@Autowired
	ILypurchaseinvoiceService service;
	/**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Lypurchaseinvoice comperson){
  
        QueryWrapper wrapper = new QueryWrapper();
        if (comperson.getFundBillNo() != null) {
            wrapper.eq(Lypurchaseinvoice.FUNDBILLNO,comperson.getFundBillNo());
        }
        if (comperson.getAffirmState() != null) {
            wrapper.like(Lypurchaseinvoice.AFFIRMSTATE,comperson.getAffirmState());
        }
        if (comperson.getFullName() != null) {
            wrapper.like(Lypurchaseinvoice.FULLNAME,comperson.getFullName());
        }
        if (comperson.getBillDate() != null) {
            wrapper.like(Lypurchaseinvoice.BILLDATE,comperson.getBillDate());
        }
        IPage<Lypurchaseinvoice> page = service.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Lypurchaseinvoice> list = service.list();
        return new Result(ResultCode.SUCCESS,list);
    }
    /**
     * 根据id查询
     */
    @RequestMapping("/findOne")
    public Result findOne(String id){
    	QueryWrapper wrapper = new QueryWrapper();
    	wrapper.eq(Lypurchaseinvoice.FUNDBILLNO,id);
        return new Result(ResultCode.SUCCESS,service.list(wrapper).get(0));
    }

    /**
     * 添加
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Lypurchaseinvoice purchaseinvoice){
    	service.save(purchaseinvoice);
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public Result update(@RequestBody Lypurchaseinvoice purchaseinvoice){
        QueryWrapper<Lypurchaseinvoice> wrapper = new QueryWrapper();
        wrapper.eq(Lypurchaseinvoice.FUNDBILLNO,purchaseinvoice.getFundBillNo());
        boolean bol= service.update(purchaseinvoice,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
    	service.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(String id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Lypurchaseinvoice.FUNDBILLNO,id);
        service.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}



