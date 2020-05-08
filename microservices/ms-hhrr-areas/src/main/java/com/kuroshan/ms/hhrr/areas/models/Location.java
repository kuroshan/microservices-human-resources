package com.kuroshan.ms.hhrr.areas.models;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "LOCATIONS", schema = "HR", catalog = "")
public class Location {

  @Id
  @Column(name = "LOCATION_ID")
  private long locationId;

  @Basic
  @Column(name = "STREET_ADDRESS")
  private String streetAddress;

  @Basic
  @Column(name = "POSTAL_CODE")
  private String postalCode;

  @Basic
  @Column(name = "CITY")
  private String city;

  @Basic
  @Column(name = "STATE_PROVINCE")
  private String stateProvince;

  /*
  @Basic
  @Column(name = "COUNTRY_ID", insertable = false, updatable = false)
  private String countryId;
   */

  @ManyToOne
  @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
  private Country country;

  /*
  @OneToMany(mappedBy = "locationsByLocationId", fetch = FetchType.LAZY)
  private Collection<Department> departmentsByLocationId;
   */

}
