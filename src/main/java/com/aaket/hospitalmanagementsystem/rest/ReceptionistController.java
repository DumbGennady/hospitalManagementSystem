package com.aaket.hospitalmanagementsystem.rest;

import com.aaket.hospitalmanagementsystem.entity.Receptionist;
import com.aaket.hospitalmanagementsystem.service.ReceptionistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/rest/receptionist")
@CrossOrigin("http://localhost:8080/")
public class ReceptionistController {

    ReceptionistServiceImpl receptionistService;
    @Autowired
    ReceptionistController (ReceptionistServiceImpl receptionistService){
        this.receptionistService = receptionistService;
    }

    @GetMapping("/list")
    List<Receptionist> getReceptionist(){
        return receptionistService.getReceptionist();
    }

    @PostMapping("/insert")
    Integer insertReceptionist(@RequestBody Receptionist receptionist){
        return receptionistService.insertReceptionist(receptionist);
    }
}
