package com.accp.erp.dao;

import com.accp.erp.entity.Comcustomer;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-22
 */
public interface ComcustomerDao extends BaseMapper<Comcustomer> {
    IPage<Comcustomer> select(Page page, @Param("ew") Wrapper<Comcustomer> wrapper);

    Comcustomer findByIdAndFlag(@Param("flag") Integer flag, @Param("id") Integer id);
}
