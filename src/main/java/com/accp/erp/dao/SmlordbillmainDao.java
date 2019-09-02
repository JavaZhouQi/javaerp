package com.accp.erp.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.entity.Comcustomer;
import com.accp.erp.entity.Smlordbillmain;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 销售主表 Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface SmlordbillmainDao extends BaseMapper<Smlordbillmain> {
	
	String query_num(@Param("flag") Integer flag,@Param("date") String date);
	
	IPage<Smlordbillmain> select( Page page, @Param("smlordbillmain") Smlordbillmain smlordbillmain, @Param("ew") Wrapper<Smlordbillmain> wrapper);
	
	Smlordbillmain queryOne(@Param("billNo") String  billNo,@Param("flag") Integer flag);
}
