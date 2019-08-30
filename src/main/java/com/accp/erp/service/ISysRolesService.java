package com.accp.erp.service;

import com.accp.erp.entity.SysRoles;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zq
 * @since 2019-08-04
 */
public interface ISysRolesService extends IService<SysRoles> {

    IPage<SysRoles> myFindPage(Page page, @Param("ew") Wrapper<SysRoles> wrapper);

}
