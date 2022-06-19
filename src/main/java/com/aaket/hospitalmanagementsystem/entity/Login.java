package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;

/**
 * @author: DumbGennady
 * @date: 2022/11/06
 * @description: Login Information entity class
 */

@Data
public class Login {
    String username;
    String password;
    String userType;
}
