package com.accp.erp.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.entity.Comproduct;
import com.accp.erp.entity.Smlordbillmain;
import com.accp.erp.service.ISmlordbillmainService;
import com.accp.erp.uitis.PageResult;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 销售主表 前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@RestController
@RequestMapping("/smlordbillmain")
public class SmlordbillmainController {
	
	@Autowired
	ISmlordbillmainService service;
	
	@PostMapping("/querynum")
	private Result query_num(@RequestBody Smlordbillmain smlordbillmain) {
		String num=service.query_num(smlordbillmain.getFlag(),smlordbillmain.getBillDate()+"");
		return new Result(ResultCode.SUCCESS,num );
//		return null;
	}
	
	@PostMapping("/add")
	private Result add(@RequestBody Smlordbillmain smlordbillmain) {
		System.out.println("拿到的对象"+JSON.toJSONString(smlordbillmain));
		boolean b=service.add(smlordbillmain);
		return new Result(ResultCode.SUCCESS,b );
//		return null;
	}
	
	/**
     * 分页查询
     */
    @RequestMapping("/findPage")
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Smlordbillmain smlordbillmain){
        QueryWrapper wrapper = new QueryWrapper();
        if (smlordbillmain.getAuditStatus() != null) {
            wrapper.eq(Smlordbillmain.AUDITSTATUS,smlordbillmain.getAuditStatus());
        }
        if (smlordbillmain.getBillDate() != null) {
            wrapper.like(smlordbillmain.BILLDATE,smlordbillmain.getBillDate());
        }
//        if (smlordbillmain.getEngName() != null) {
//            wrapper.like(Comproduct.ENGNAME,smlordbillmain.getEngName());
//        }

        IPage<Smlordbillmain> page = service.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());

        return new Result(ResultCode.SUCCESS,pageResult);
	
    }
}

