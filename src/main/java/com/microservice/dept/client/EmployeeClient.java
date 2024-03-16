package com.microservice.dept.client;

import com.microservice.dept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {

    @GetExchange("employee/dept/{dId}")
    public List<Employee> findByDept(@PathVariable Long dId);
}
