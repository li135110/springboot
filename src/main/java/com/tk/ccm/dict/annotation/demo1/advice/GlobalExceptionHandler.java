package com.tk.ccm.dict.annotation.demo1.advice;

import com.tk.ccm.dict.annotation.demo1.aop.BusinessException;
import com.tk.ccm.dict.annotation.demo1.base.BusinessCode;
import com.tk.ccm.dict.annotation.demo1.base.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局异常捕获
 *
 * @author: zetting
 * @date: 2018/12/20 22:41
 */
//@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger log = LoggerFactory.getLogger(this.getClass());


    /**
     * 入参非法异常捕获
     *
     * @param e
     * @return
     */
    @ExceptionHandler({BusinessException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response handleServiceException(BusinessException e) {
        log.error("系统异常,{}", e);
        BusinessCode code = new BusinessCode(e.getCode(), e.getMsg());
        return Response.fail(code, e.getMsg());
    }


    /**
     * 系统异常捕获
     *
     * @param e
     * @return
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response handleOtherException(Exception e) {
        log.error("系统异常,{}", e);
        return Response.fail(BusinessCode.EXCEPTION, "系统异常");
    }


}