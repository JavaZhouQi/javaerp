package com.accp.erp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.erp.entity.Chlsmbinvoicesub;
import com.accp.erp.entity.Comcustaddress;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 销售发票从表 Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface ChlsmbinvoicesubDao extends BaseMapper<Chlsmbinvoicesub> {
	 List<Chlsmbinvoicesub> findByIdAndFlag(@Param("billNo") Integer id,@Param("flag") Integer flag);

}
