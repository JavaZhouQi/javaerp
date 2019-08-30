package com.accp.erp.service.impl;

import com.accp.erp.entity.SysRoles;
import com.accp.erp.dao.SysRolesDao;
import com.accp.erp.service.ISysRolesService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zq
 * @since 2019-08-04
 */
@Service
public class SysRolesServiceImpl extends ServiceImpl<SysRolesDao, SysRoles> implements ISysRolesService {

    @Override
    public IPage<SysRoles> myFindPage(Page page, Wrapper<SysRoles> wrapper) {
        return baseMapper.myFindPage(page,wrapper);
    }
}
