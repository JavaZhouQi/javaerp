package com.accp.erp.service.impl;

import com.accp.erp.dao.SmlordbillmainDao;
import com.accp.erp.dao.SmlordbillsubDao;
import com.accp.erp.entity.Smlordbillmain;
import com.accp.erp.entity.Smlordbillsub;
import com.accp.erp.service.ISmlordbillmainService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	SmlordbillsubDao subDao;
	
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
	@Override
	public boolean add(Smlordbillmain smlordbillmain) {
		int bol=baseMapper.insert(smlordbillmain);
		if(bol>0) {
			for (int i = 0; i < smlordbillmain.getSubList().size(); i++) {
				Smlordbillsub s=smlordbillmain.getSubList().get(i);
				s.setRowNO(i+1);
				s.setBillNo(smlordbillmain.getBillNo());
				s.setFlag(smlordbillmain.getFlag());
				s.setBillDate(smlordbillmain.getBillDate());
				subDao.insert(s);
			}
		}
		
		return bol>0;
	}
	@Override
	public String remove(String billNo,Integer flag) {
		Smlordbillmain smlordbillmain=baseMapper.queryOne(billNo, flag);
		if(smlordbillmain.getAuditStatus()==1) {
			return "该订单已审核，不能被删除";
		}
		QueryWrapper<Smlordbillmain> queryWrapper=new QueryWrapper<>();
		queryWrapper.eq(Smlordbillmain.BILLNO, billNo);
		queryWrapper.eq(Smlordbillmain.FLAG, flag);
		int bool=baseMapper.delete(queryWrapper);
		QueryWrapper<Smlordbillsub> queryWrapper2=new QueryWrapper<>();
		queryWrapper2.eq(Smlordbillsub.BILLNO, billNo);
		queryWrapper2.eq(Smlordbillsub.FLAG, flag);
		subDao.delete(queryWrapper2);
		return "true";
	}
	
	@Override
	public boolean updateSmlordbillmain(Smlordbillmain smlordbillmain) {
		QueryWrapper<Smlordbillmain> queryWrapper=new QueryWrapper<>();
		queryWrapper.eq(Smlordbillmain.BILLNO, smlordbillmain.getBillNo());
		queryWrapper.eq(Smlordbillmain.FLAG, smlordbillmain.getFlag());
		int bool=baseMapper.update(smlordbillmain, queryWrapper);
		if(bool>0) {
			//删除明细表的数据
			QueryWrapper<Smlordbillsub> queryWrapper2=new QueryWrapper<>();
			queryWrapper2.eq(Smlordbillsub.BILLNO, smlordbillmain.getBillNo());
			queryWrapper2.eq(Smlordbillsub.FLAG, smlordbillmain.getFlag());
			subDao.delete(queryWrapper2);
			//新增明细表的数据
			for (int i = 0; i < smlordbillmain.getSubList().size(); i++) {
				Smlordbillsub s=smlordbillmain.getSubList().get(i);
				s.setRowNO(i+1);
				s.setBillNo(smlordbillmain.getBillNo());
				s.setFlag(smlordbillmain.getFlag());
				s.setBillDate(smlordbillmain.getBillDate());
				subDao.insert(s);
			}
		}
		return bool>0;
	}
	@Override
	public Smlordbillmain queryOne(String billNo, Integer flag) {
		
		return baseMapper.queryOne(billNo, flag);
	}
	@Override
	public IPage<Smlordbillmain> select(Page page, Wrapper<Smlordbillmain> wrapper) {
		return baseMapper.select(page, wrapper);
	}
	
	

}
