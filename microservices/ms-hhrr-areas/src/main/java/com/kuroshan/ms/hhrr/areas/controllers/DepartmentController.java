package com.kuroshan.ms.hhrr.areas.controllers;

import com.kuroshan.ms.hhrr.areas.models.Department;
import com.kuroshan.ms.hhrr.areas.services.DepartamentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope //solo para configuraciones custom
@Slf4j
@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

  @Autowired
  private DepartamentService departamentService;

  @GetMapping(value = "")
  public List<Department> listDepartaments() {
    return departamentService.findAll();
  }

  @GetMapping(value = "/{id}")
  public Department getDepartament(@PathVariable long id) {
    return departamentService.findById(id);
  }

}
