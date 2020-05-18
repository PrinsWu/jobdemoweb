package com.smartbee.jobdemo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/18
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private int companyId;
    private String name;
    private String email;
    private String phone;
    private String createdBy;
    private Timestamp createdAt;
    private String updatedBy;
    private Timestamp updatedAt;
}
