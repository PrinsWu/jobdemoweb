package com.smartbee.jobdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2020/5/21
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseRestResp<T> implements Serializable {
    private int code;
    private String message;
    private T data;
}
