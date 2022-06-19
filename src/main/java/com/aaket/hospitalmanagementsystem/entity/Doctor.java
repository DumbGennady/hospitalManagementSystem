package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: DumbGennady
 * @date: 2022/11/06
 * @description: Doctor entity class
 */

@Data
@EqualsAndHashCode(callSuper=true)
public class Doctor extends Receptionist{
    Integer expYear;
    String specialisation;
    String qualification;
}
