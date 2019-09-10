package com.accp.erp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.entity.Yxpurchaseenquiry;
import com.accp.erp.entity.Yxrequisitions;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface YxpurchaseenquiryDao extends BaseMapper<Yxpurchaseenquiry> {
	public Yxpurchaseenquiry selectLikeBillNO(@Param("billNO") String billNO);
	public int insertDetails(Yxpurchaseenquiry yxpurchaseenquiry);
	public int insertPD(Yxpurchaseenquiry yxpurchaseenquiry);
	public Yxpurchaseenquiry selectPdNO(@Param("billNO") String billNO);
}
