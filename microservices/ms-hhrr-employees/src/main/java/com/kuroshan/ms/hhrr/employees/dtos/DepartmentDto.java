package com.kuroshan.ms.hhrr.employees.dtos;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class DepartmentDto implements Serializable {

  private long departmentId;
  private String departmentName;
  private LocationDto location;

}
