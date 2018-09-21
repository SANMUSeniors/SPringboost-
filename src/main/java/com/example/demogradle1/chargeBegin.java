package com.example.demogradle1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class chargeBegin {

    @RequestMapping("/1234")
    public String sayHello(){
        return "hello world!!!!!!";
    }
}