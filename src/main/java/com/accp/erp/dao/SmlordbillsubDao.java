package com.accp.erp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.entity.Smlordbillsub;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 销售报价、订单明细表 Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface SmlordbillsubDao extends BaseMapper<Smlordbillsub> {
	
	List<Smlordbillsub> queryByflagAndBillNo(@Param("billNo") String billNo,@Param("flag") Integer flag);
	
}
