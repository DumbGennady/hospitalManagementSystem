package com.aaket.hospitalmanagementsystem.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: DumbGennady
 * @date: 2022/11/06
 * @description: Receptionist entity class
 */

@Data
@EqualsAndHashCode(callSuper=true)
public class Receptionist extends Admin{
    Integer age;  //Change age to dob
    String aadharNo;
}
