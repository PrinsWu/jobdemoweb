package com.smartbee.jobdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
@Service
public class DemoUserDetailsService implements UserDetailsService {
    private static final Logger log = LoggerFactory.getLogger(DemoUserDetailsService.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("========= loadUserByUsername:{}", username);
        if ("super_user".equals(username)) {
            return User.builder().username(username).password("{noop}password").roles("SUPER_USER").build();
        } else if ("manager".equals(username)) {
            return User.builder().username(username).password("{noop}password").roles("MANAGER").build();
        } else if ("operator".equals(username)) {
            return User.builder().username(username).password("{noop}password").roles("OPERATOR").build();
        }
        log.info("========= loadUserByUsername: not found");
        throw new UsernameNotFoundException(String.format("username[%s] not found", username));
    }
}
