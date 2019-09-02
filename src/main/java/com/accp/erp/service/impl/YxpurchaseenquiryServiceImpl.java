package com.accp.erp.service.impl;

import com.accp.erp.dao.YxpurchaseenquiryDao;
import com.accp.erp.entity.Yxpurchaseenquiry;
import com.accp.erp.entity.Yxrequisitions;
import com.accp.erp.service.IYxpurchaseenquiryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class YxpurchaseenquiryServiceImpl extends ServiceImpl<YxpurchaseenquiryDao, Yxpurchaseenquiry> implements IYxpurchaseenquiryService {

	@Override
	public Yxpurchaseenquiry selectLikeBillNO(String billNO) {
		// TODO Auto-generated method stub
		return baseMapper.selectLikeBillNO(billNO);
	}

	@Override
	public int insertPDs(Yxpurchaseenquiry yxpurchaseenquiry) {
		// TODO Auto-generated method stub
		int count = baseMapper.insertDetails(yxpurchaseenquiry);
		if(count>0) {
			baseMapper.insertPD(yxpurchaseenquiry);
		}
		return count;
	}

	@Override
	public Yxpurchaseenquiry selectRdNO(String billNO) {
		// TODO Auto-generated method stub
		return baseMapper.selectPdNO(billNO);
	}

}
