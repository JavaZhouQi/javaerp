package com.accp.erp.service;

import java.util.Date;

import com.accp.erp.entity.Smlordbillmain;
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
}
