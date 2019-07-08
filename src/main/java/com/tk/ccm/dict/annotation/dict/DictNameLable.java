package com.tk.ccm.dict.annotation.dict;


import java.lang.annotation.*;

/**
 * 字典转码注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DictNameLable {
    //默认值
    String value() default "";

    //转码字段
    String filed() default "";
}
