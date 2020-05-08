package com.kuroshan.ms.hhrr.employees.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class RegionDto {

  private long regionId;
  private String regionName;

}
