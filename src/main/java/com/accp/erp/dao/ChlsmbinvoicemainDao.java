package com.accp.erp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.entity.Chlsmbinvoicemain;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 销售发票主表 Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface ChlsmbinvoicemainDao extends BaseMapper<Chlsmbinvoicemain> {
	IPage<Chlsmbinvoicemain> select(Page page, @Param("ew") Wrapper<Chlsmbinvoicemain> wrapper);
}

