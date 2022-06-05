package com.aaket.hospitalmanagementsystem.mapper;

import com.aaket.hospitalmanagementsystem.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
    Integer insertAdmin(@Param("admin") Admin admin);
    List<Admin> getAdmin();
//    public deleteAdmin(@Param("userName")String userName);
}
