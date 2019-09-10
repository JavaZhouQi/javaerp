package com.accp.erp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.service.IChlsmbinvoicesubService;


/**
 * <p>
 * 销售发票从表 前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@RestController
@RequestMapping("/chlsmbinvoicesub")
public class ChlsmbinvoicesubController {
	@Autowired
    IChlsmbinvoicesubService chlsmbinvoicesubService;
}

