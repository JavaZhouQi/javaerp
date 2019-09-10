package com.accp.erp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.entity.Yxpurchaseenquiry;
import com.accp.erp.entity.Yxpurchaseorder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface YxpurchaseorderDao extends BaseMapper<Yxpurchaseorder> {
	public Yxpurchaseorder selectLikeBillNO(@Param("billNO") String billNO);
	public int insertDetails(Yxpurchaseorder yxpurchaseorder);
	public int insertPD(Yxpurchaseorder yxpurchaseorder);
	public Yxpurchaseorder selectPdNO(@Param("billNO") String billNO);
}
