package com.smartbee.jobdemo.controller;

import com.smartbee.jobdemo.model.Country;
import com.smartbee.jobdemo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
@RestController
public class DemoController {

    @Autowired
    CountryService countryService;

    @GetMapping("/")
    public String home(Principal principal) {
        return String.format("Authenticated user[%s]!", principal.getName());
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAll();
    }
}
