package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Receptionist;

import java.util.List;

public interface ReceptionistService {

    List<Receptionist> getReceptionist();

    Integer insertReceptionist(Receptionist receptionist);
}
