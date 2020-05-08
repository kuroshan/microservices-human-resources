package com.kuroshan.ms.hhrr.areas.services;

import com.kuroshan.ms.hhrr.areas.models.Department;

import java.util.List;

public interface DepartamentService {

  public List<Department> findAll();

  public Department findById(long id);

}
