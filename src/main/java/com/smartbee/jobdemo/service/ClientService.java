package com.smartbee.jobdemo.service;

import com.smartbee.jobdemo.model.Client;
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
public class ClientService {
    private static final Logger log = LoggerFactory.getLogger(ClientService.class);

    @Autowired
    ClientRespository clientRespository;

    public List<Client> getAll() {
        log.info("ClientService getAll...");
        List<Client> result = new ArrayList<>();
        clientRespository.findAll().forEach(result::add);
        log.info("result size:{}", result.size());
        return result;
    }

    public Client save(Client client) {
        return clientRespository.save(client);
    }
}
