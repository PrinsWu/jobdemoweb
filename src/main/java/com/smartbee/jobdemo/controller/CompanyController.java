package com.smartbee.jobdemo.controller;

import com.smartbee.jobdemo.model.Company;
import com.smartbee.jobdemo.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
@RestController
public class CompanyController {
    private static final Logger log = LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> getAll() {
        log.info("CompanyController getAll...");
        return companyService.getAll();
    }

    @PostMapping(value = "/companies", produces = MediaType.APPLICATION_JSON_VALUE)
    public Company createCompany(@RequestBody Company company) {
        log.info("createCompany company:{}", company);

        return companyService.save(company);
    }

}
