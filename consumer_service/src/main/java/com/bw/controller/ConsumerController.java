package com.bw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @RequestMapping("/list")
    public List<String> show(){
        return Arrays.asList("张三","李四","王五");
    }
}
