package com.smartbee.jobdemo.model;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
@Entity
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;
}
