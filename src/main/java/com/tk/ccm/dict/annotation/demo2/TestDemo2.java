package com.tk.ccm.dict.annotation.demo2;

import com.tk.ccm.dict.annotation.demo3.myannotation.Demo3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo2")
public class TestDemo2 {

    @PostMapping("/a")
//    @Demo2("注解")
    @Demo3(key = "demo3注解")
    public  void test(){
        System.out.println("自定义注解的测试");
    }

}
