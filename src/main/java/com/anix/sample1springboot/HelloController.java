package com.anix.sample1springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        String returnVal = "";
        returnVal = "{'hello':'world'}";

        return returnVal;
    }
}
