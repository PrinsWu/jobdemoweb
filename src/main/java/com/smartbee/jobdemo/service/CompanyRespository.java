package com.smartbee.jobdemo.service;

import com.smartbee.jobdemo.model.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
public interface CompanyRespository extends CrudRepository<Company, Integer> {
}
