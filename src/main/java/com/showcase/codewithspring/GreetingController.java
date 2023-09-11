package com.showcase.codewithspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/app1")
public class GreetingController {

    @GetMapping
    public List<String> hello() {
        List<String> list = new ArrayList<>();
        for (int i=0; i < 1; i++) {
            list.add("Spring is here!");
        }
        return list;
    }
}
