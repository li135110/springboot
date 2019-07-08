package com.tk.ccm.dict.annotation.demo3.myannotation;


import com.tk.ccm.dict.annotation.demo1.base.EnumValidatorClass;
import com.tk.ccm.dict.annotation.demo3.myannotation.annotationimpl.Demo3AnnotationImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Demo3 {
    String value() default "";

    String key() default "";

    String something() default "";
    Class<? extends Payload>[] payload() default {};

}
