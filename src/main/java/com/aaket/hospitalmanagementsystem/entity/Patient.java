package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: DumbGennady
 * @date: 2022/11/06
 * @description: Patient entity class
 */

@Data
public class Patient {
    Integer id;
    String name;
    String mobile;
    String email;
    java.sql.Date dob;
    String bloodGroup;
    String address;
    String city;
    Date crtDtm;
    Date uptDtm;
    String crtUsr;
    String uptUsr;
}
