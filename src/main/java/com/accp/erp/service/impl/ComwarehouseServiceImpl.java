package com.accp.erp.service.impl;

import com.accp.erp.entity.Comwarehouse;
import com.accp.erp.dao.ComwarehouseDao;
import com.accp.erp.service.IComwarehouseService;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zq
 * @since 2019-08-15
 */
@Service
public class ComwarehouseServiceImpl extends ServiceImpl<ComwarehouseDao, Comwarehouse> implements IComwarehouseService {


}
