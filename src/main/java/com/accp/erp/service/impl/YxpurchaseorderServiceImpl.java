package com.accp.erp.service.impl;

import com.accp.erp.dao.YxpurchaseorderDao;
import com.accp.erp.entity.Yxpurchaseorder;
import com.accp.erp.service.IYxpurchaseorderService;
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
public class YxpurchaseorderServiceImpl extends ServiceImpl<YxpurchaseorderDao, Yxpurchaseorder> implements IYxpurchaseorderService {

	@Override
	public Yxpurchaseorder selectLikeBillNO(String billNO) {
		// TODO Auto-generated method stub
		return baseMapper.selectLikeBillNO(billNO);
	}

	@Override
	public int insertPDs(Yxpurchaseorder yxpurchaseorder) {
		int count = baseMapper.insertDetails(yxpurchaseorder);
		if(count>0) {
			baseMapper.insertPD(yxpurchaseorder);
		}
		return count;
	}

	@Override
	public Yxpurchaseorder selectRdNO(String billNO) {
		// TODO Auto-generated method stub
		return baseMapper.selectPdNO(billNO);
	}

}
