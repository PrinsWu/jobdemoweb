package com.smartbee.jobdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public String home(Principal principal) {
        return String.format("Authenticated user[%s]!", principal.getName());
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
