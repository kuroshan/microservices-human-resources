package com.kuroshan.ms.hhrr.areas.services.impl;

import com.kuroshan.ms.hhrr.areas.models.Department;
import com.kuroshan.ms.hhrr.areas.repositories.DepartamentRepository;
import com.kuroshan.ms.hhrr.areas.services.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentServiceImpl implements DepartamentService {

  @Autowired
  private DepartamentRepository departamentRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Department> findAll() {
    return departamentRepository.findAll();
  }

  @Override
  public Department findById(long id) {
    try {
      Thread.sleep(2000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return departamentRepository.findById(id).orElse(null);
  }

}
