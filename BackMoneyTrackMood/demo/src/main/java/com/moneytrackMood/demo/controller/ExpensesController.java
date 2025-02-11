package com.moneytrackMood.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExpensesController {
    @RequestMapping("/")
    public String great(){
        return "hello word";
    }
}
