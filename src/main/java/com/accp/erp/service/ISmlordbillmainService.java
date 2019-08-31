package com.accp.erp.service;

import java.util.Date;

import com.accp.erp.entity.Comcustomer;
import com.accp.erp.entity.Smlordbillmain;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 销售主表 服务类
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface ISmlordbillmainService extends IService<Smlordbillmain> {
	String query_num(Integer flag,String date);
	
	boolean add(Smlordbillmain smlordbillmain);
	
	boolean updateSmlordbillmain(Smlordbillmain smlordbillmain);
	
	String remove(String  billNo,Integer flag);
	
	Smlordbillmain queryOne(String  billNo,Integer flag);
	
	IPage<Smlordbillmain> select(Page page, Wrapper<Smlordbillmain> wrapper);
}
