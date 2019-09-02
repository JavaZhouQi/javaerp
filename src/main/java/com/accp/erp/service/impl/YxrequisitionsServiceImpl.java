package com.accp.erp.service.impl;

import com.accp.erp.dao.YxrequisitionsDao;
import com.accp.erp.dao.YxrequisitionsdetailDao;
import com.accp.erp.entity.Yxrequisitions;
import com.accp.erp.entity.Yxrequisitionsdetail;
import com.accp.erp.service.IYxrequisitionsService;
import com.accp.erp.service.IYxrequisitionsdetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Service
public class YxrequisitionsServiceImpl extends ServiceImpl<YxrequisitionsDao, Yxrequisitions> implements IYxrequisitionsService {
	
	@Override
	public Yxrequisitions selectLikeBillNO(String billNO) {
		// TODO Auto-generated method stub
		return baseMapper.selectLikeBillNO(billNO);
	}

	@Override
	public int insertRDs(Yxrequisitions yxrequisitions) {
		// TODO Auto-generated method stub
		int count = baseMapper.insertDetails(yxrequisitions);
		if(count>0) {
			baseMapper.insertRD(yxrequisitions);
		}
		return count;
	}

	@Override
	public Yxrequisitions selectRdNO(String billNO) {
		// TODO Auto-generated method stub
		return baseMapper.selectRdNO(billNO);
	}

}
