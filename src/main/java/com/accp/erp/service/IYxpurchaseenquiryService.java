package com.accp.erp.service;

import com.accp.erp.entity.Yxpurchaseenquiry;
import com.accp.erp.entity.Yxrequisitions;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
public interface IYxpurchaseenquiryService extends IService<Yxpurchaseenquiry> {
	public Yxpurchaseenquiry selectLikeBillNO(String billNO);
	public int insertPDs(Yxpurchaseenquiry yxpurchaseenquiry);
	public Yxpurchaseenquiry selectRdNO (String billNO);
}
