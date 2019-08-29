package com.accp.erp.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.entity.Smlordbillmain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

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
}
