package com.smartbee.jobdemo.service;

import com.smartbee.jobdemo.model.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
@Service
public class CompanyService {
    private static final Logger log = LoggerFactory.getLogger(CompanyService.class);

    @Autowired
    CompanyRespository companyRespository;

    public List<Company> getAll() {
        log.info("CompanyService getAll...");
        List<Company> result = new ArrayList<>();
        companyRespository.findAll().forEach(company -> result.add(company));
        log.info("result size:", result.size());
        return result;
    }
}
