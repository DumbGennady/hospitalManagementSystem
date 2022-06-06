package com.aaket.hospitalmanagementsystem.rest;

import com.aaket.hospitalmanagementsystem.entity.Admin;
import com.aaket.hospitalmanagementsystem.service.AdminService;
import com.aaket.hospitalmanagementsystem.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/admin")
@CrossOrigin("http://localhost:8080/")
public class AdminController {

    AdminServiceImpl adminService;
    @Autowired
    AdminController(AdminServiceImpl adminService){
        this.adminService = adminService;
    }

    @PostMapping("/insert")
    Integer insertAdmin(@RequestBody Admin admin){
        return adminService.insertAdmin(admin);
    }

    @GetMapping("/list")
    List<Admin> getAdmin(){
        return adminService.getAdmin();
    }
}
