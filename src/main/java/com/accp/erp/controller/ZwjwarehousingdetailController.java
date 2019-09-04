package com.accp.erp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.erp.entity.Comdepartment;
import com.accp.erp.entity.Zwjwarehousingdetail;
import com.accp.erp.service.IZwjwarehousingdetailService;
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
@RequestMapping("/zwjwarehousingdetail")
public class ZwjwarehousingdetailController {
	@Autowired
	IZwjwarehousingdetailService service;
	
	@PostMapping("/warehousingdetailquery")
	public Result findPage(@RequestParam(defaultValue = "1") Integer current,
            @RequestParam(defaultValue = "10")Integer size,
			@RequestBody Zwjwarehousingdetail zwjwarehousingdetail) {
		
//			IPage<Comdepartment> page = comdepartmentService.page(new Page<>(current,size),wrapper);
//	        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
		
				QueryWrapper wrapper = new QueryWrapper();
		
				System.out.println(11);
				
		
				
				IPage<Zwjwarehousingdetail> page = service.page(new Page<>(current,size),wrapper);
				
				
				PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
				
				System.out.println(page+"111");
				
				
				
				return new Result(ResultCode.SUCCESS,pageResult);
	}
	
	/**
     * 单个删除
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public Result del(String id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Zwjwarehousingdetail.PRODID,id);
        service.remove(wrapper); 
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
    /**
     * 修改
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Zwjwarehousingdetail zwjwarehousingdetail){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Zwjwarehousingdetail.PRODID,zwjwarehousingdetail.getProdID());
        service.update(zwjwarehousingdetail,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }
    
    /**
     * 新增采购入库单
     */
    
    public Result add(@RequestBody Zwjwarehousingdetail zwjwarehousingdetail) {
    	
    	QueryWrapper wrapper = new QueryWrapper();
    	
    	service.save(zwjwarehousingdetail);
    	
    	 return new Result(ResultCode.SUCCESS,"新增成功");
    }

}

