package com.kuroshan.ms.hhrr.employees.repositories;

import com.kuroshan.ms.hhrr.employees.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
