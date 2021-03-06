package com.ltp.service;

import com.ltp.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {
    @PostMapping(value = "/dept/add")
    boolean add(@RequestBody Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable(value = "id") Long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();
}