package com.accp.erp.service;

import com.accp.erp.entity.SysUsers;
import com.baomidou.mybatisplus.extension.service.IService;

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

}
