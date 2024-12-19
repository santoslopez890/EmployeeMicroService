package com.employeeapp.employee.service.Controller;

import com.employeeapp.employee.service.Repo.EmployeeRepo;
import com.employeeapp.employee.service.Service.EmployeeService;
import com.employeeapp.employee.service.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpolyeeController {

@Autowired
EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    Employee getEmployeeDetails(@PathVariable("id")int id){
    //dbcall
        return employeeService.getEmployeeByID(id);


    }
}
