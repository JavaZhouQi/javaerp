package com.accp.erp.service.impl;

import com.accp.erp.entity.Chlsmbinvoicemain;
import com.accp.erp.dao.ChlsmbinvoicemainDao;
import com.accp.erp.service.IChlsmbinvoicemainService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 销售发票主表 服务实现类
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Service
public class ChlsmbinvoicemainServiceImpl extends ServiceImpl<ChlsmbinvoicemainDao, Chlsmbinvoicemain> implements IChlsmbinvoicemainService {
	@Override
    public IPage<Chlsmbinvoicemain> select(Page page, Wrapper<Chlsmbinvoicemain> wrapper) {
        return baseMapper.select(page,wrapper);
    }
}
