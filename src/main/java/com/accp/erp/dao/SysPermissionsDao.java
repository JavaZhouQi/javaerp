package com.accp.erp.dao;

import com.accp.erp.entity.SysPermissions;
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
public interface SysPermissionsDao extends BaseMapper<SysPermissions> {
    List<SysPermissions> findByRid(Integer rid);
}
