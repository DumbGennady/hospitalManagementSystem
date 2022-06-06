package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Doctor extends Receptionist{
    Integer expYear;
    String specialisation;
    String qualification;
}
