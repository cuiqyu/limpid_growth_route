package com.limpid.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户信息对象
 *
 * @auther cuiqiongyu
 * @create 2020/1/10 15:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -5225710034155015831L;

    private Integer id;
    private String userName;

}
