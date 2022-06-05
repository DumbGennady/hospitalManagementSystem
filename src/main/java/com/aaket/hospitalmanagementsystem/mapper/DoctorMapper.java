package com.aaket.hospitalmanagementsystem.mapper;

import com.aaket.hospitalmanagementsystem.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DoctorMapper {
    public Integer insertDoctor(@Param("doctor") Doctor doctor);
}
