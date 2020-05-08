package com.kuroshan.ms.hhrr.employees.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class DepartmentDto {

  private long departmentId;
  private String departmentName;
  private LocationDto location;

}
