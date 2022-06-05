package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@Data
public class Doctor {
    String name;
    String username;
    String email;
    String mobile;
    Integer age;
    Integer expYear;
    String specialisation;
    String qualification;
    String aadharNo;
    String password;
    Date crtDtm;
    Date uptDtm;
    String crtUsr;
    String uptUsr;
}
