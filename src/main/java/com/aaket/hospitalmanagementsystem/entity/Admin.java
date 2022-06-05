package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Admin {
    String username;
    String name;
    String mobile;
    String password;
    String email;
    Date crtDtm;
    Date uptDtm;
    String crtUsr;
    String uptUsr;
}
