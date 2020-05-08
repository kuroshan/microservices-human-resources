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
@Table(name = "COUNTRIES", schema = "HR", catalog = "")
public class Country {

  @Id
  @Column(name = "COUNTRY_ID")
  private String countryId;

  @Basic
  @Column(name = "COUNTRY_NAME")
  private String countryName;

  /*@Basic
  @Column(name = "REGION_ID", insertable = false, updatable = false)
  private Long regionId;
   */

  @ManyToOne
  @JoinColumn(name = "REGION_ID", referencedColumnName = "REGION_ID")
  private Region region;

  /*
  @OneToMany(mappedBy = "countriesByCountryId")
  private Collection<Location> locationsByCountryId;
   */

}
