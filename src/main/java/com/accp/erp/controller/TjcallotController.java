package com.accp.erp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.accp.erp.entity.Tjcallot;
import com.accp.erp.entity.Tjcallotlist;
import com.accp.erp.service.ITjcallotService;
import com.accp.erp.service.ITjcallotlistService;
import com.accp.erp.uitis.PageResult;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-30
 */
@RestController
@RequestMapping("/tjcallot")
public class TjcallotController {
	@Autowired 
	ITjcallotService iTjcallotService;
	@Autowired 
	ITjcallotlistService iTjcallotlistService;
    /**
     * 分页查询
     */
    @RequestMapping("/findPage")
    @ResponseBody
    public Result findPage(@RequestParam(defaultValue = "1") Integer current,
                           @RequestParam(defaultValue = "10")Integer size,
                           @RequestBody Tjcallot tjcallot){
        QueryWrapper wrapper = new QueryWrapper();
        if (tjcallot.getAllotId() != null) {
            wrapper.eq(Tjcallot.ALLOTID,tjcallot.getAllotId());
        }
        if (tjcallot.getWareOutName() != null) {
            wrapper.like(Tjcallot.WAREOUTNAME,tjcallot.getWareOutName());
        }
        if (tjcallot.getWareName() != null) {
            wrapper.like(Tjcallot.WARENAME,tjcallot.getWareName());
        }
        if (tjcallot.getMoveDate() != null) {
            wrapper.like(Tjcallot.MOVEDATE,tjcallot.getMoveDate());
        }
        IPage<Tjcallot> page = iTjcallotService.page(new Page<>(current,size),wrapper);
        PageResult pageResult = new PageResult(page.getTotal(),page.getRecords());
        
        return new Result(ResultCode.SUCCESS,pageResult);
    }
    @RequestMapping("/findAll")
    public Result findAll(){
        List<Tjcallot> list = iTjcallotService.list();
        return new Result(ResultCode.SUCCESS,list);
    }
    /**
     * 根据id查询
     */
    @RequestMapping("/findOne")
    public Result findOne(String id){
        return new Result();
    }

    /**
     * 添加
     */
    @RequestMapping("/add")
    public Result add(@RequestBody Tjcallot entity){
    	System.out.println();
    	boolean i=iTjcallotService.save(entity);
    	if(i) { 		
    		iTjcallotlistService.addtjcalloteach(entity);
    	}
        return new Result(ResultCode.SUCCESS,"新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Tjcallot tjcallot){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Tjcallot.ALLOTID,tjcallot.getAllotId());
        iTjcallotService.update(tjcallot,wrapper);
        return new Result(ResultCode.SUCCESS,"修改成功");
    }

    /**
     * 批量删除
     */
    @RequestMapping("/dels")
    public Result dels(List<Integer> ids){
    	iTjcallotService.removeByIds(ids);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }

    /**
     * 单个删除
     */
    @RequestMapping("/del")
    public Result del(Integer id){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(Tjcallot.ALLOTID,id);
        iTjcallotService.remove(wrapper);
        return new Result(ResultCode.SUCCESS,"删除成功");
    }
}

