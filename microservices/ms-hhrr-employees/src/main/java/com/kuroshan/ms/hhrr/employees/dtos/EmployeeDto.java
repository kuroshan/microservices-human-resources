package com.kuroshan.ms.hhrr.employees.dtos;

import lombok.*;

import java.sql.Time;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class EmployeeDto {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Time hireDate;
    private Long salary;
    private Long commissionPct;
    private DepartmentDto department;

}
