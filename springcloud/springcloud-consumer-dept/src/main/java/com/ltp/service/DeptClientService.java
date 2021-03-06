package com.ltp.service;

import com.ltp.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "DEPT")
public interface DeptClientService {
    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable(value = "id") Long id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();
}