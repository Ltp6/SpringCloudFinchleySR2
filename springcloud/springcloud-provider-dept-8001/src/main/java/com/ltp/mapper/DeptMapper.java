package com.ltp.mapper;

import com.ltp.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept findDeptById(Long id);

    List<Dept> findAllDept();
}
