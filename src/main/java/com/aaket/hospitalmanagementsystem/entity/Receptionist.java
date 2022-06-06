package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=true)
public class Receptionist extends Admin{
    Integer age;  //Change age to dob
    String aadharNo;
}
