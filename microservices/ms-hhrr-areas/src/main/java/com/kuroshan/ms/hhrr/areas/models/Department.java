package com.kuroshan.ms.hhrr.areas.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "DEPARTMENTS", schema = "HR", catalog = "")
public class Department {

  @Id
  @Column(name = "DEPARTMENT_ID")
  private long departmentId;

  @Basic
  @Column(name = "DEPARTMENT_NAME")
  private String departmentName;

  /*
  @Basic
  @Column(name = "LOCATION_ID", insertable = false, updatable = false)
  private Long locationId;
   */

  @ManyToOne
  @JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID")
  private Location location;

}
