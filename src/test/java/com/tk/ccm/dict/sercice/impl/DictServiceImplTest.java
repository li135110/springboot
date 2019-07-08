package com.tk.ccm.dict.sercice.impl;

import com.tk.ccm.dict.DictApplication;
import com.tk.ccm.dict.bo.DictItemBo;
import com.tk.ccm.dict.dao.DictItemDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = DictApplication.class)
@RunWith(SpringRunner.class)
public class DictServiceImplTest {

    @Autowired
    private DictItemDao dictItemDao;


    @Test
    public void selectDcitItem() {
        List<DictItemBo> dictItemBos = dictItemDao.selectDcitItem();
        if (dictItemBos.isEmpty()){
            System.err.println("没有查到");
        }
        for (DictItemBo dictItemBo:dictItemBos){
            System.out.println(dictItemBo);
        }

    }
}