package com.kuroshan.ms.hhrr.users.repositories;

import com.kuroshan.ms.hhrr.users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/users")
public interface UserRepository extends JpaRepository<User, Long> {

  public User findByUsername(String username);

  @Query("select u from User u where u.username = ?")
  public User obtenerPorUsername(String username);

}
