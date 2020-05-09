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
public class RegionDto implements Serializable {

  private long regionId;
  private String regionName;

}
