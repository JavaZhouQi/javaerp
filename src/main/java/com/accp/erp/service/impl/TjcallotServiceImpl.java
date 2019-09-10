package com.accp.erp.service.impl;

import com.accp.erp.entity.Tjcallot;
import com.accp.erp.dao.TjcallotDao;
import com.accp.erp.service.ITjcallotService;
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
public class TjcallotServiceImpl extends ServiceImpl<TjcallotDao, Tjcallot> implements ITjcallotService {

	@Autowired
	ITjcallotService iTjcallotService;
	
	public boolean addtjcallot(Tjcallot tjcallot) {
		return iTjcallotService.addtjcallot(tjcallot);
	}

}
