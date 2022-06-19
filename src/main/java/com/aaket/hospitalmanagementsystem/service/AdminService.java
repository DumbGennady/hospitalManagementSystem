package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Admin;
import com.aaket.hospitalmanagementsystem.entity.Login;

import java.util.List;

public interface AdminService {
    Integer insertAdmin(Admin admin);

    List<Admin> getAdmin();

    Integer isValid(Login login);
}
