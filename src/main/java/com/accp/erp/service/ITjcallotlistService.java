package com.accp.erp.service;

import com.accp.erp.entity.Tjcallot;
import com.accp.erp.entity.Tjcallotlist;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zq
 * @since 2019-08-30
 */
public interface ITjcallotlistService extends IService<Tjcallotlist> {
	//新增调拨单明细单
	public boolean addtjcalloteach(Tjcallot entity);
}
