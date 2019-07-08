package com.tk.ccm.dict.annotation.dict;

import java.lang.reflect.Field;

public class DictTest {

    public static void main(String[] args) throws ClassNotFoundException {


        Class clazz = Class.forName("com.tk.ccm.dict.annotation.dict.DictNameLable");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(DictNameLable.class)){
//                field.getAnnotation(DictNameLable.class);
                String name = field.getName();

                System.err.println(name);
                System.out.println("12345678");
            }
        }
    }
}