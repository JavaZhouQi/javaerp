package com.accp.erp.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.entity.Yxpurchasedetail;
import com.accp.erp.entity.Yxpurchaseenquiry;
import com.accp.erp.entity.Yxrequisitions;
import com.accp.erp.service.IYxpurchasedetailService;
import com.accp.erp.service.IYxpurchaseenquiryService;
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
@RequestMapping("/yxpurchaseenquiry")
public class YxpurchaseenquiryController {
	@Autowired
	private IYxpurchaseenquiryService yxpurchaseenquiryService;
	@Autowired
	private IYxpurchasedetailService yxpurchasedetailService;
	
	@RequestMapping("/query")
	@ResponseBody
	public Result select(@RequestParam(defaultValue = "1") Long current,@RequestParam(defaultValue = "5") Long size,Yxpurchaseenquiry yxpurchaseenquiry){
		System.out.println(current+"....."+size);
		QueryWrapper<Yxpurchaseenquiry> queryWrapper = new QueryWrapper<>();
		if (yxpurchaseenquiry.getBillNO() != null) {
			queryWrapper.eq(Yxrequisitions.BILLNO,yxpurchaseenquiry.getBillNO());
        }
		IPage<Yxpurchaseenquiry> page = yxpurchaseenquiryService.page(new Page<>(current,size),queryWrapper);
		PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
		System.out.println(pageResult);
		return new Result(ResultCode.SUCCESS,pageResult);
	}
	
	@RequestMapping("/selectLikeBillNO")
	@ResponseBody
	public Result selectLikeBillNO(@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss") Date billDate) {
		System.out.println(billDate);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	    String bill = sdf.format(billDate);
	    String billNO = bill;
		Yxpurchaseenquiry yxpurchaseenquiry = yxpurchaseenquiryService.selectLikeBillNO(billNO);
		System.out.println(yxpurchaseenquiry+".....................");
		if(yxpurchaseenquiry!=null) {
			Integer ls=Integer.parseInt(yxpurchaseenquiry.getBillNO().substring(8, 10))+1;
			System.out.println(yxpurchaseenquiry.getBillNO().substring(8, 9));
			if(yxpurchaseenquiry.getBillNO().substring(8, 9).equals("0")) {
				billNO=billNO+"0"+ls;
			}else {
				billNO=billNO+ls;
			}
		}else {
			billNO=billNO+"01";
		}
		System.out.println(billNO);
		return new Result(ResultCode.SUCCESS,billNO);
	}
	
	@RequestMapping("/insertPDs")
	@ResponseBody
	public Result insertRDs(@RequestBody Yxpurchaseenquiry yxpurchaseenquiry) {
		System.out.println(yxpurchaseenquiry);
		yxpurchaseenquiryService.insertPDs(yxpurchaseenquiry);
		return new Result(ResultCode.SUCCESS,"新增成功");
	}
	
	@RequestMapping("/selectBillNO")
	@ResponseBody
	public Result selectBillNO(String billNO) {
		Yxpurchaseenquiry req = yxpurchaseenquiryService.selectRdNO(billNO);
		System.out.println(req);
		return new Result(ResultCode.SUCCESS,req);
	}
	
	@RequestMapping("/deleteRDs")
	@ResponseBody
	public Result deleteRDs(String billNO) {
		System.out.println(billNO);
		QueryWrapper<Yxpurchasedetail> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq(Yxpurchasedetail.BILLS, 1).eq(Yxpurchasedetail.BILLNO, billNO);
		yxpurchaseenquiryService.removeById(billNO);
		yxpurchasedetailService.remove(queryWrapper);
		return new Result(ResultCode.SUCCESS,"删除成功");
	}
}

