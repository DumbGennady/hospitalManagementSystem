package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@Data
public class Doctor {
    Integer id;
    String name;
    String branch;
    Integer expYear;
}
