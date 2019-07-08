package com.tk.ccm.dict.dao;

import com.tk.ccm.dict.bo.DictItemBo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DictItemDao {

    List<DictItemBo> selectDcitItem();

    DictItemBo selectDictItemOne(int itemId);

}

