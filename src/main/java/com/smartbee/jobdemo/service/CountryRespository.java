package com.smartbee.jobdemo.service;

import com.smartbee.jobdemo.model.Country;
import org.springframework.data.repository.CrudRepository;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
public interface CountryRespository extends CrudRepository<Country, Integer> {
}
