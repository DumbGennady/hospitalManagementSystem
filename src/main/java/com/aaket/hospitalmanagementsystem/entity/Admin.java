package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;
import java.util.Date;

/**
 * @author: DumbGennady
 * @date: 2022/11/06
 * @description: Admin entity class
 */

@Data
public class Admin {
    String id;
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
