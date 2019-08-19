package com.accp.erp.service.impl;

import com.accp.erp.entity.SysUsers;
import com.accp.erp.dao.SysUsersDao;
import com.accp.erp.service.ISysUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zq
 * @since 2019-08-04
 */
@Service
public class SysUsersServiceImpl extends ServiceImpl<SysUsersDao, SysUsers> implements ISysUsersService {

    public SysUsers findByUsername(String username) {
        return baseMapper.findByUsername(username);
    }

    @Override
    public List<String> findByCoumnAndSize(String coumn, Integer size, String table) {
        return baseMapper.findByCoumnAndSize(coumn,size,table);
    }
}
