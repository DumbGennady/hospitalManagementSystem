package com.aaket.hospitalmanagementsystem.rest;

import com.aaket.hospitalmanagementsystem.entity.Appointment;
import com.aaket.hospitalmanagementsystem.service.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/rest/appointment")
@CrossOrigin("http://localhost:8080/")
public class AppointmentController {

    AppointmentServiceImpl appointmentService;
    @Autowired
    AppointmentController(AppointmentServiceImpl appointmentService){
        this.appointmentService = appointmentService;
    }

    @PostMapping("/insert")
    Integer insertAppointment(@RequestBody Appointment appointment){
        return appointmentService.insertAppointment(appointment);
    }

    @GetMapping("/list")
    List<Appointment> getAppointment(@RequestParam(value="patientId", required = false) Integer patientId, @RequestParam(value="doctorId", required = false) Integer doctorId, @RequestParam(value="appointmentId", required = false) Integer appointmentId, @RequestParam(value="date", required = false)Date date){
        return appointmentService.getAppointment(patientId, doctorId, appointmentId, date);
    }

}
