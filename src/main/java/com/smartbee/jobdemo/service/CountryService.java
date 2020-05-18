package com.smartbee.jobdemo.service;

import com.smartbee.jobdemo.model.Company;
import com.smartbee.jobdemo.model.Country;
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
public class CountryService {
    private static final Logger log = LoggerFactory.getLogger(CountryService.class);

    @Autowired
    CountryRespository countryRespository;

    public List<Country> getAll() {
        log.info("CountryService getAll...");
        List<Country> result = new ArrayList<>();
        countryRespository.findAll().forEach(country -> result.add(country));
        log.info("result size:", result.size());
        return result;
    }
}
