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
public class CountryDto implements Serializable {

  private String countryId;
  private String countryName;
  private RegionDto region;

}
