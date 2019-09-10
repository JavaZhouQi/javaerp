package com.accp.erp.service;

import com.accp.erp.entity.Yxpurchaseenquiry;
import com.accp.erp.entity.Yxpurchaseorder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface IYxpurchaseorderService extends IService<Yxpurchaseorder> {
	public Yxpurchaseorder selectLikeBillNO(String billNO);
	public int insertPDs(Yxpurchaseorder yxpurchaseorder);
	public Yxpurchaseorder selectRdNO (String billNO);
}
