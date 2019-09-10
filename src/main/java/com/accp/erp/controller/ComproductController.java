package com.accp.erp.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-30
 */
@RestController
@RequestMapping("/comproduct")
public class ComproductController {

    /**
     * 带条件查询
     */
    @RequestMapping("/findByTable")
    public Result findByTable(@RequestBody Comproduct comproduct){
        QueryWrapper wrapper = new QueryWrapper();
        if (comproduct.getProdID() != null) {
            wrapper.like(Comproduct.PRODID,comproduct.getProdID());
        }
        if (comproduct.getProdName() != null) {
            wrapper.like(Comproduct.PRODNAME,comproduct.getProdName());
        }
        if (comproduct.getEngName() != null) {
            wrapper.like(Comproduct.ENGNAME,comproduct.getEngName());
        }
        List list = comproductService.list(wrapper);
        return new Result(ResultCode.SUCCESS,list);
    }

}

