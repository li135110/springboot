package com.tk.ccm.dict.annotation.dict;

import com.tk.ccm.dict.bo.DictItemBo;
import com.tk.ccm.dict.sercice.DictItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.List;

public class DictionaryUtil {
    private static DictionaryUtil dictionaryUtil;

    @Autowired
    private DictItemService dictItemService;

    public static void getDictionary(Class<?> clazz) {
        List<DictItemBo> dictItemBos = dictionaryUtil.dictItemService.selectDcitItem();
        System.out.println(dictItemBos);

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(DictNameLable.class)) {
                DictNameLable dictNameLable = (DictNameLable) field.getAnnotation(DictNameLable.class);





            }


        }


    }
}