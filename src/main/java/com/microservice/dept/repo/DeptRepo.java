package com.microservice.dept.repo;

import com.microservice.dept.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DeptRepo {

    private List<Department> depts = new ArrayList<>();

    public Department addDepartment(Department department){
        depts.add(department);
        return department;
    }

    public Department findById(Long dId){
        return depts.stream()
                .filter(department -> department.getdId() == dId)
                .findFirst()
                .orElseThrow();
    }

    public List<Department> findAll(){
        return depts;
    }


}
