package com.tk.ccm.dict.sercice.impl;

import com.tk.ccm.dict.bo.DictItemBo;
import com.tk.ccm.dict.dao.DictItemDao;
import com.tk.ccm.dict.sercice.DictItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class selectDcitItemImpl implements DictItemService {

    @Autowired(required = true)
    private DictItemDao dictItemDao;

    @Override
    public List<DictItemBo> selectDcitItem() {
        List<DictItemBo> dictItemBos = dictItemDao.selectDcitItem();
        if (dictItemBos.isEmpty()){
            System.err.println("没有返回值");
            return null;
        }
        System.out.println(dictItemBos);

        return dictItemBos;
    }
}
