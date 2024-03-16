package com.microservice.dept.controller;

import com.microservice.dept.model.Department;
import com.microservice.dept.repo.DeptRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptRepo deptRepo;

    @GetMapping("/test")
    public String greetMsg(){
        return "Welcome to Department Service!,";
    }

    @PostMapping("addDept")
    public Department addDept(@RequestBody Department department){
        LOGGER.info("Dept added: {}"+ department);
        return deptRepo.addDepartment(department);
    }

    @GetMapping("/getList")
    public List<Department> getDepts(){
        LOGGER.info("Dept list found");
        return deptRepo.findAll();
    }

    @GetMapping("/getById/{dId}")
    public Department getById(@PathVariable Long dId){
        LOGGER.info("Dept found: {}", dId);
        return deptRepo.findById(dId);
    }
}
