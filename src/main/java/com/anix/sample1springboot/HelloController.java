package com.anix.sample1springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Map<String, Object> getHello(){
        Map returnMap = new HashMap();
        returnMap.put("hello", "world");
        return returnMap;
    }
}
