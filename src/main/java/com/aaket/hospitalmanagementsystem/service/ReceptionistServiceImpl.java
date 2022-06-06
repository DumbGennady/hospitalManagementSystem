package com.aaket.hospitalmanagementsystem.service;

import com.aaket.hospitalmanagementsystem.entity.Receptionist;
import com.aaket.hospitalmanagementsystem.mapper.ReceptionistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionistServiceImpl {

    ReceptionistMapper receptionistMapper;
    @Autowired
    ReceptionistServiceImpl (ReceptionistMapper receptionistMapper){
        this.receptionistMapper = receptionistMapper;
    }

    public List<Receptionist> getReceptionist(){
        return receptionistMapper.getReceptionist();
    }

    public Integer insertReceptionist(Receptionist receptionist){
        return receptionistMapper.insertReceptionist(receptionist);
    }
}
