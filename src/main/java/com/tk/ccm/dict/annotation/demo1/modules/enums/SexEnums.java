package com.tk.ccm.dict.annotation.demo1.modules.enums;


/**
 * 性别枚举
 *
 * @author: zetting
 * @date: 2018/12/20 22:41
 */
public enum SexEnums {
    /**
     * 未知
     */
    UNKNOWN(0),

    /**
     * 男
     */
    MALE(1),

    /**
     * 女
     */
    FEMALE(2);

    private int value;

    SexEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }}
