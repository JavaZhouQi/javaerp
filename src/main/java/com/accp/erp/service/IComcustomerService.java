package com.accp.erp.service;

import com.accp.erp.entity.Comcustomer;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zq
 * @since 2019-08-22
 */
public interface IComcustomerService extends IService<Comcustomer> {

    IPage<Comcustomer> select(Page page, Wrapper<Comcustomer> wrapper);
    // 根据 flag 和 id 查询
    Comcustomer findByIdAndFlag(Integer flag,Integer id);
}
