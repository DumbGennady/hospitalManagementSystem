package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Admin;

import java.util.List;

public interface AdminService {
    Integer insertAdmin(Admin admin);

    List<Admin> getAdmin();
}
