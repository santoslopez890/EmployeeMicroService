package com.employeeapp.employee.service.Service;

import com.employeeapp.employee.service.Repo.EmployeeRepo;
import com.employeeapp.employee.service.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private com.employeeapp.employee.service.Repo.EmployeeRepo EmployeeRepo;


    public Employee getEmployeeByID(int id){

        return EmployeeRepo.findById(id).get();
    }
}
