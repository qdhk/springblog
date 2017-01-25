package com.nr.controller;

import com.nr.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by nr on 2017/01/25 0025.
 */
@RestController
public class GreetingController {
    private static final String template="Hello,%s!"; // content 模板
    private final AtomicLong counter=new AtomicLong(); // 自动生成 id
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name){
        return  new Greeting(
                counter.incrementAndGet(),
                String.format(template,name)
        );
    }
}
