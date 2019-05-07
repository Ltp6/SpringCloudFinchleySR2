package com.ltp.service;

import com.ltp.entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
