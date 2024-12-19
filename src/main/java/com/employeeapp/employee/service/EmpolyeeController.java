package com.employeeapp.employee.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpolyeeController {

    @GetMapping("/employees/{id}")
    getEmployeeDetails(@PathVariable("id")int id){

    }
}
