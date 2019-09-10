package com.accp.erp.controller;

import com.accp.erp.service.ISysUsersService;
import com.accp.erp.uitis.Result;
import com.accp.erp.uitis.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 通用查询mapper
 */
@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    ISysUsersService usersService;

    @RequestMapping("/find")
    public Result find(String coumn,Integer size,String table){
        List<String> list = usersService.findByCoumnAndSize(coumn,size,table);
        return new Result(ResultCode.SUCCESS,list);
    }

    @RequestMapping("/findByTable")
    public Result findByTable(String table, String coumn, String selectName){
        selectName = "'" + selectName+"%'";
        List<HashMap<String, Object>> byTable = usersService.findByTable(table, coumn, selectName);
        return new Result(ResultCode.SUCCESS,byTable);
    }

}
