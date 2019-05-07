package com.ltp.service.impl;

import com.ltp.entities.Dept;
import com.ltp.mapper.DeptMapper;
import com.ltp.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findDeptById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAllDept();
    }
}
