package com.accp.erp.dao;

import com.accp.erp.entity.SysRoles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zq
 * @since 2019-08-04
 */
public interface SysRolesDao extends BaseMapper<SysRoles> {
    List<SysRoles> findByUid(Integer uid);
}
