package com.accp.erp.service.impl;

import com.accp.erp.entity.Comcustomer;
import com.accp.erp.dao.ComcustomerDao;
import com.accp.erp.service.IComcustomerService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zq
 * @since 2019-08-22
 */
@Service
public class ComcustomerServiceImpl extends ServiceImpl<ComcustomerDao, Comcustomer> implements IComcustomerService {

    @Override
    public IPage<Comcustomer> select(Page page, Wrapper<Comcustomer> wrapper) {
        return baseMapper.select(page,wrapper);
    }

    @Override
    public Comcustomer findByIdAndFlag(Integer flag, Integer id) {
        return baseMapper.findByIdAndFlag(flag,id);
    }
}
