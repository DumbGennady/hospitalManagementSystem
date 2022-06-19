package com.aaket.hospitalmanagementsystem.mapper;

import com.aaket.hospitalmanagementsystem.entity.Appointment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

@Mapper
public interface AppointmentMapper {

    Integer insertAppointment(@Param("appointment") Appointment appointment);

    List<Appointment> getAppointment(@Param("patientId") Integer patientId, @Param("doctorId") Integer doctorId, @Param("appointmentId") Integer appointmentId, @Param("date") Date date);
}
