package com.microservice.dept.repo;

import com.microservice.dept.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DeptRepo {

    private List<Department> departments = new ArrayList<>();

    public Department addDepartment(Department department){
        departments.add(department);
        return department;
    }

    public Department findById(Long dId){
        return departments.stream()
                .filter(department -> department.getdId() == dId)
                .findFirst()
                .orElseThrow();
    }

    public List<Department> findAll(){
        return departments;
    }


}
