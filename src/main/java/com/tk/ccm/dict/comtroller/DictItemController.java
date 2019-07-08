package com.tk.ccm.dict.comtroller;

import com.tk.ccm.dict.sercice.DictItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dictItem")
public class DictItemController {
    @Autowired
    DictItemService dictItemService;

    @PostMapping("/dict")
   public String getDictItem(){


        dictItemService.selectDcitItem();
       return "success";
   }

}
