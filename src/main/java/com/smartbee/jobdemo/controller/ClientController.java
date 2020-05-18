package com.smartbee.jobdemo.controller;

import com.smartbee.jobdemo.model.Client;
import com.smartbee.jobdemo.model.Company;
import com.smartbee.jobdemo.service.ClientService;
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
public class ClientController {
    private static final Logger log = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getAll() {
        log.info("ClientController getAll...");
        return clientService.getAll();
    }

    @PostMapping(value = "/clients", produces = MediaType.APPLICATION_JSON_VALUE)
    public Client createCompany(@RequestBody Client client) {
        log.info("createCompany client:{}", client);

        return clientService.save(client);
    }

}
