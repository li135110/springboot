package com.tk.ccm.dict.annotation.demo1.aop;


import com.tk.ccm.dict.annotation.demo1.base.BusinessCode;

/**
 * 基础业务异常类
 *
 * @author: zetting
 * @date: 2018/8/20 22:06
 */
public class BusinessException extends RuntimeException {
    private String code;
    private String msg;
    private Throwable cause;

    public BusinessException() {

    }

    public BusinessException(String msg) {
        super(msg);
        this.setCode(BusinessCode.FAILD.getCode());
        this.setMsg(msg);
    }

    public BusinessException(BusinessCode businessCode) {
        super(businessCode.getMsg());
        this.setCode(businessCode.getCode());
        this.setMsg(businessCode.getMsg());
    }

    public BusinessException(String msg, Throwable e) {
        super(msg);
        this.setCode(BusinessCode.FAILD.getCode());
        this.setMsg(msg);
        this.cause = e;
    }

    public BusinessException(BusinessCode businessCode, String msg) {
        super(msg);
        this.setCode(businessCode.getCode());
        this.setMsg(msg);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }
}
