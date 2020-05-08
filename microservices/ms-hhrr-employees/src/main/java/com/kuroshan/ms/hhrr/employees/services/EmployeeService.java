package com.kuroshan.ms.hhrr.employees.services;

import com.kuroshan.ms.hhrr.employees.dtos.EmployeeDto;
import com.kuroshan.ms.hhrr.employees.models.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public EmployeeDto findById(long id);

}
