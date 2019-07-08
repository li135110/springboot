package com.tk.ccm.dict.annotation.demo1.modules.dto;

import com.tk.ccm.dict.annotation.demo1.aop.Request;
import com.tk.ccm.dict.annotation.demo1.base.EnumValidator;
import com.tk.ccm.dict.annotation.demo1.modules.enums.SexEnums;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 入参校验请求
 *
 * @author: zetting
 * @date: 2018/12/19 22:16
 */
public class ValidateRequest extends Request {
    /**
     * 用户名
     */
    @NotBlank
    private String userName;

    /**
     * 性别
     */
    @EnumValidator(value = SexEnums.class)
    private Integer sex;

    /**
     * 地址
     */
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
