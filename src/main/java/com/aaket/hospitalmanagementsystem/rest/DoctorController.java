package com.aaket.hospitalmanagementsystem.rest;

import com.aaket.hospitalmanagementsystem.entity.Doctor;
import com.aaket.hospitalmanagementsystem.service.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/doctor")
@CrossOrigin("http://localhost:8080/")
public class DoctorController {

    DoctorServiceImpl doctorService;
    @Autowired
    public DoctorController(DoctorServiceImpl doctorService ){
        this.doctorService = doctorService;
    }

    @PostMapping("/insert")
    Integer insertDoctor (@RequestBody  Doctor doctor){
        return doctorService.insertDoctor(doctor);
    }

    @GetMapping("/list")
    List<Doctor>  getDoctor (){
        return doctorService.getDoctor();
    }
}
