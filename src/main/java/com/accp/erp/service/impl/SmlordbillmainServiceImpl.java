package com.accp.erp.service.impl;

import com.accp.erp.dao.SmlordbillmainDao;
import com.accp.erp.entity.Smlordbillmain;
import com.accp.erp.service.ISmlordbillmainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 销售主表 服务实现类
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Service
public class SmlordbillmainServiceImpl extends ServiceImpl<SmlordbillmainDao, Smlordbillmain> implements ISmlordbillmainService {

	SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
	@Override
	public String query_num(Integer flag, String date) {
		String num=baseMapper.query_num(flag, date);
		String [] snum=date.split("-");
		
		if(num==null||num=="") {
			num=snum[0]+snum[1]+snum[2]+"001";
		}else {
			num=snum[0]+snum[1]+snum[2]+num.substring(num.indexOf("E")-3,num.indexOf("E"));
		}
		return num;
	}

}
