package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

/**
 * @author: DumbGennady
 * @date: 2022/12/06
 * @description: Appointment entity class
 */

@Data
public class Appointment {
    Integer id;
    Integer patientId;
    Integer doctorId;
    Date date;
    Time startTime;
    Time endTime;
    String description;
    java.util.Date crtDtm;
    java.util.Date uptDtm;
    String crtUsr;
    String uptUsr;
}
