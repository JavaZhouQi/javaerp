package com.accp.erp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.entity.Yxrequisitions;
import com.accp.erp.entity.Yxrequisitionsdetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface YxrequisitionsdetailDao extends BaseMapper<Yxrequisitionsdetail> {
	public int insertRD(@Param("yxrequisitions") Yxrequisitions yxrequisitions);
}
