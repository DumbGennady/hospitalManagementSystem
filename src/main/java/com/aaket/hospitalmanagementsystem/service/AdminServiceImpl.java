package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Admin;
import com.aaket.hospitalmanagementsystem.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    AdminMapper adminMapper;
    @Autowired
    AdminServiceImpl(AdminMapper adminMapper){
        this.adminMapper = adminMapper;
    }

    @Override
    public Integer insertAdmin(Admin admin){
        return adminMapper.insertAdmin(admin);
    }

    @Override
    public List<Admin> getAdmin(){
        return adminMapper.getAdmin();
    }
}
