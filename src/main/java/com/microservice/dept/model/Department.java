package com.microservice.dept.model;

import java.util.*;

public class Department {

    private Long dId;
    private String dName;
    private List<Employee> employees = new ArrayList();

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Department(){

    }

    public Department(Long dId, String dName, List<Employee> employees) {
        this.dId = dId;
        this.dName = dName;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
