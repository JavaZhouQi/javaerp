package com.accp.erp.dao;

import com.accp.erp.entity.SysUsers;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
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

    List<String> findByCoumnAndSize(@Param("coumn") String coumn,@Param("size") Integer size,@Param("table") String table);

    IPage<SysUsers> myFindPage(Page page, @Param("ew") Wrapper<SysUsers> wrapper);

    List<HashMap<String,Object>> findByTable(String table,String coumn,String selectName);
}
