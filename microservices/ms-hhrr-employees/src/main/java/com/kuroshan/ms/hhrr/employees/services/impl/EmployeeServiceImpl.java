package com.kuroshan.ms.hhrr.employees.services.impl;

import com.kuroshan.ms.hhrr.employees.config.DepartmentClientRest;
import com.kuroshan.ms.hhrr.employees.dtos.DepartmentDto;
import com.kuroshan.ms.hhrr.employees.dtos.EmployeeDto;
import com.kuroshan.ms.hhrr.employees.models.Employee;
import com.kuroshan.ms.hhrr.employees.repositories.EmployeeRepository;
import com.kuroshan.ms.hhrr.employees.services.EmployeeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DepartmentClientRest departmentClientRest;

    @Autowired
    private ModelMapper modelMapper;

    @Value("${api.support.ms-human-resources-areas.url:http://localhost:8080/ms-hhrr-areas/v1}")
    private String msHumanResourcesAreas;

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @HystrixCommand(fallbackMethod = "temporalGetEmployee")
    @Transactional(readOnly = true)
    public EmployeeDto findById(long id) {

        Optional<Employee> optEmp = employeeRepository.findById(id);

        if (optEmp.isPresent()) {
            EmployeeDto dto = modelMapper.map(optEmp.get(), EmployeeDto.class);
            //Map vars = new HashMap();
            //vars.put("id", optEmp.get().getDepartmentId());
            //DepartmentDto dept = restTemplate.getForObject(msHumanResourcesAreas + "/departments/{id}", DepartmentDto.class, vars);

            DepartmentDto dept = departmentClientRest.getDepartament(optEmp.get().getDepartmentId());

            dto.setDepartment(dept);
            return dto;
        }

        return null;
    }

    private EmployeeDto temporalGetEmployee(long id) {
        log.error("error de invocación");

        Optional<Employee> optEmp = employeeRepository.findById(id);
        EmployeeDto dto = modelMapper.map(optEmp.get(), EmployeeDto.class);
        dto.setDepartment(DepartmentDto.builder().departmentId(optEmp.get().getDepartmentId()).build());

        return dto;
    }
}
