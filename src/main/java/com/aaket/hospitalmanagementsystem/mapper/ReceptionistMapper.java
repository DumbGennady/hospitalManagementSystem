package com.aaket.hospitalmanagementsystem.mapper;

import com.aaket.hospitalmanagementsystem.entity.Receptionist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReceptionistMapper {

    Integer insertReceptionist(@Param("receptionist") Receptionist receptionist);
    List<Receptionist> getReceptionist();
}
