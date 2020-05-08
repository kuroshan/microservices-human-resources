package com.kuroshan.ms.hhrr.employees.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class CountryDto {

  private String countryId;
  private String countryName;
  private RegionDto region;

}
