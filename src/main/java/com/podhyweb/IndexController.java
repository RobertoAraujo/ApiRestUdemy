package com.podhyweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IndexController {
    private static final String template = "HELLO WORLD";
    private final AtomicLong counter =new AtomicLong();

    @GetMapping("/saudacao")
    public Saudacao methodoInicial(@RequestParam(value = "name", defaultValue = "World") String name){
        return  new Saudacao(counter.incrementAndGet(),String.format(template,name));
    }
}
