package com.accp.erp.service;

import com.accp.erp.entity.SysUsers;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zq
 * @since 2019-08-04
 */
public interface ISysUsersService extends IService<SysUsers> {

    SysUsers findByUsername(String username);

    List<String> findByCoumnAndSize(String coumn, Integer size, String table);

    IPage<SysUsers> myFindPage(Page page, @Param("ew") Wrapper<SysUsers> wrapper);

}
