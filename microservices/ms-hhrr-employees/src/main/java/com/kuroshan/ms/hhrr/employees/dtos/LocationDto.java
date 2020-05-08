package com.kuroshan.ms.hhrr.employees.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class LocationDto {

  private long locationId;
  private String streetAddress;
  private String postalCode;
  private String city;
  private String stateProvince;
  private CountryDto country;

}
