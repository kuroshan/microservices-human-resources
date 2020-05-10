package com.kuroshan.ms.hhrr.users.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "USERS")
public class User implements Serializable {

  @Id
  @Column(name = "USER_ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(unique = true, length = 20)
  private String username;

  @Column(length = 20)
  private String password;

  @Column(unique = true, length = 100)
  private String email;

  private Boolean enabled;

  @ManyToMany(fetch = FetchType.LAZY)
  private List<Role> roles;

}
