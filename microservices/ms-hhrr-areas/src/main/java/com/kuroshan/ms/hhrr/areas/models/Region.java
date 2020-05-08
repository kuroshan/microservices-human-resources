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
@Table(name = "REGIONS", schema = "HR", catalog = "")
public class Region {

  @Id
  @Column(name = "REGION_ID")
  private long regionId;

  @Basic
  @Column(name = "REGION_NAME")
  private String regionName;

  /*
  @OneToMany(mappedBy = "regionsByRegionId")
  private Collection<Country> countriesByRegionId;
   */

}
