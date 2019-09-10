package com.accp.erp.service;

import com.accp.erp.entity.Chlsmbinvoicemain;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 销售发票主表 服务类
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface IChlsmbinvoicemainService extends IService<Chlsmbinvoicemain> {
	 IPage<Chlsmbinvoicemain> select(Page page, Wrapper<Chlsmbinvoicemain> wrapper);
}
