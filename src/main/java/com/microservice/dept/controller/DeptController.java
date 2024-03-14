package com.microservice.dept.controller;

import com.microservice.dept.model.Department;
import com.microservice.dept.repo.DeptRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/dept")
public class DeptController {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptRepo deptRepo;

    @GetMapping("/test")
    public String greetMsg(){
        return "Welcome!,";
    }

    @PostMapping("addDept")
    public Department addDept(@RequestBody Department department){
            return deptRepo.addDepartment(department);
    }

    @GetMapping("/getList")
    public List<Department> getDepts(){
        return deptRepo.findAll();
    }

    @GetMapping("/getById/{dId}")
    public Department getById(@PathVariable Long dId){
        return deptRepo.findById(dId);
    }
}
