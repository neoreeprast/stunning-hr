package com.manirapt.hr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arieprastowo on 9/5/17.
 */
@RestController
public class HomeRestController {
    @GetMapping("/")
    public String home() {
        return "Hello Stunning HR";
    }
}
