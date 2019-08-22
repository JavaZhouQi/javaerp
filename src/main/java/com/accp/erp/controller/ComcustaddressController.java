package com.accp.erp.controller;


import com.accp.erp.service.IComcustaddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zq
 * @since 2019-08-21
 */
@RestController
@RequestMapping("/comcustaddress")
public class ComcustaddressController {

    @Autowired
    IComcustaddressService comcustaddressService;

}

