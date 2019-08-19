package com.accp.erp.dao;

import com.accp.erp.entity.SysUsers;
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
public interface SysUsersDao extends BaseMapper<SysUsers> {

    SysUsers findByUsername(String username);

    List<String> findByCoumnAndSize(String coumn,Integer size,String table);
}
