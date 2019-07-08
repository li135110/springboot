package com.tk.ccm.dict.annotation.demo3.myannotation.annotationimpl;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tk.ccm.dict.annotation.demo1.base.EnumValidator;
import com.tk.ccm.dict.annotation.demo3.bo.CarBo;
import com.tk.ccm.dict.annotation.demo3.myannotation.Demo3;
import com.tk.ccm.dict.bo.DictItemBo;
import com.tk.ccm.dict.sercice.DictItemService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@Aspect
@Component
public class Demo3AnnotationImpl{
    /**
     * 定义切点位置
     */
    @Pointcut("@annotation(com.tk.ccm.dict.annotation.demo3.myannotation.Demo3)")
    private void cut() {}

    @Autowired
    private DictItemService dictItemService;




    @Before("cut()")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Demo3 demo3 = method.getAnnotation(Demo3.class);
        Object[] args = joinPoint.getArgs();
//        System.err.println("第N次尝试之Demo3注解之获取属性值--"+args[0]);
        List<DictItemBo> dictItemBos = dictItemService.selectDcitItem();
        System.out.println(dictItemBos);

        System.err.println("第N次尝试之Demo3的注解--"+demo3.key());

    }

    @Before("cut()")
    public void before1(JoinPoint joinPoint) {
        Field[] fields = Demo3.class.getDeclaredFields();
        Class clazz=CarBo.class;
        clazz.getDeclaredFields();
        System.out.println(fields.toString());

    }


}
