package com.tk.ccm.dict.annotation.demo2;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Demo2 {
    String value() default "";
}
