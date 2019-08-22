package com.accp.erp.dao;

import com.accp.erp.entity.Comcustaddress;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-21
 */
public interface ComcustaddressDao extends BaseMapper<Comcustaddress> {

    List<Comcustaddress> findByIdAndFlag(@Param("id") Integer id,@Param("flag") Integer flag);

}
