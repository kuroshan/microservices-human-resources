package com.kuroshan.ms.hhrr.employees.controllers;

import com.kuroshan.ms.hhrr.employees.dtos.EmployeeDto;
import com.kuroshan.ms.hhrr.employees.models.Employee;
import com.kuroshan.ms.hhrr.employees.services.EmployeeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "")
    public List<Employee> listEmployees() {
        return employeeService.findAll();
    }

    //@HystrixCommand(fallbackMethod = "temporalGetEmployee")
    @GetMapping(value = "/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable long id) {
        return new ResponseEntity<EmployeeDto>(employeeService.findById(id), HttpStatus.OK);
    }

    public  ResponseEntity<EmployeeDto> temporalGetEmployee(long id) {
        return new ResponseEntity<EmployeeDto>(EmployeeDto.builder().employeeId(id).firstName("-").lastName("-").build(), HttpStatus.NOT_FOUND);
    }

}
