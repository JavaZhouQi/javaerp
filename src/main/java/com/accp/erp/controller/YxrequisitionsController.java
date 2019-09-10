package com.accp.erp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.entity.Comarea;
import com.accp.erp.entity.Yxrequisitions;
import com.accp.erp.service.IYxrequisitionsService;
import com.accp.erp.service.IYxrequisitionsdetailService;
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
@RequestMapping("/yxrequisitions")
public class YxrequisitionsController {
	@Autowired
	private IYxrequisitionsService yxrequisitionsService;
	@Autowired
	private IYxrequisitionsdetailService yxrequisitionsdetailService;
	
	@RequestMapping("/query")
	@ResponseBody
	public Result select(@RequestParam(defaultValue = "1") Long current,@RequestParam(defaultValue = "5") Long size,@RequestBody Yxrequisitions yxrequisitions){
		System.out.println(current+"....."+size);
		QueryWrapper<Yxrequisitions> queryWrapper = new QueryWrapper<>();
		if (yxrequisitions.getBillNO() != null) {
			queryWrapper.eq(Yxrequisitions.BILLNO,yxrequisitions.getBillNO());
        }
		IPage<Yxrequisitions> page = yxrequisitionsService.page(new Page<>(current,size),queryWrapper);
		PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
		return new Result(ResultCode.SUCCESS,pageResult);
	}
	
	@RequestMapping("/selectLikeBillNO")
	@ResponseBody
	public Result selectLikeBillNO(@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss") Date billDate) {
		System.out.println(billDate);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	    String bill = sdf.format(billDate);
	    String billNO = bill;
		Yxrequisitions yxrequisitions = yxrequisitionsService.selectLikeBillNO(billNO);
		System.out.println(yxrequisitions+".....................");
		if(yxrequisitions!=null) {
			Integer ls=Integer.parseInt(yxrequisitions.getBillNO().substring(8, 10))+1;
			System.out.println(yxrequisitions.getBillNO().substring(8, 9));
			if(yxrequisitions.getBillNO().substring(8, 9).equals("0")) {
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
	
	@RequestMapping("/insertRDs")
	@ResponseBody
	public Result insertRDs(@RequestBody Yxrequisitions yxrequisitions) {
		System.out.println(yxrequisitions);
		yxrequisitionsService.insertRDs(yxrequisitions);
		return new Result(ResultCode.SUCCESS,"新增成功");
	}
	
	@RequestMapping("/selectBillNO")
	@ResponseBody
	public Result selectBillNO(String billNO) {
		Yxrequisitions req = yxrequisitionsService.selectRdNO(billNO);
		System.out.println(req);
		return new Result(ResultCode.SUCCESS,req);
	}
	
	@RequestMapping("/deleteRDs")
	@ResponseBody
	public Result deleteRDs(String billNO) {
		System.out.println(billNO);
		yxrequisitionsdetailService.removeById(billNO);
		yxrequisitionsService.removeById(billNO);
		return new Result(ResultCode.SUCCESS,"删除成功");
	}
}

