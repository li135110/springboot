package com.tk.ccm.dict.annotation.demo1.modules.controller;

import com.tk.ccm.dict.annotation.demo1.base.Response;
import com.tk.ccm.dict.annotation.demo1.modules.dto.ValidateRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 枚举校验
 *
 * @author: zetting
 * @date: 2018/12/20 22:41
 */
@RestController
public class MyController {

    @GetMapping(value = "/validate")
    public Response validate(ValidateRequest request) {
        return Response.success();
    }
}
