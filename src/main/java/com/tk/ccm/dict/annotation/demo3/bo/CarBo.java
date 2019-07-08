package com.tk.ccm.dict.annotation.demo3.bo;

import com.tk.ccm.dict.annotation.demo3.myannotation.Demo3;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarBo{
    @Demo3
    private String color = "1";
    private String status;
}
