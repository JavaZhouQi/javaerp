package com.accp.erp.service.impl;

import com.accp.erp.entity.Tjcallot;
import com.accp.erp.entity.Tjcallotlist;
import com.accp.erp.dao.TjcallotlistDao;
import com.accp.erp.service.ITjcallotlistService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zq
 * @since 2019-08-30
 */
@Service
public class TjcallotlistServiceImpl extends ServiceImpl<TjcallotlistDao, Tjcallotlist> implements ITjcallotlistService {

	@Autowired
	ITjcallotlistService iTjcallotlistService;
	@Override
	public boolean addtjcalloteach(Tjcallot entity) {
		// TODO Auto-generated method stub
		return iTjcallotlistService.addtjcalloteach(entity);
	}

}
