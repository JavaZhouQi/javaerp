package com.accp.erp.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.entity.Smlordbillmain;
import com.accp.erp.service.ISmlordbillmainService;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;

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
}

