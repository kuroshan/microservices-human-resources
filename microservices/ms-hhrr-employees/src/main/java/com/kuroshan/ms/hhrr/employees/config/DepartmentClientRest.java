package com.kuroshan.ms.hhrr.employees.config;

import com.kuroshan.ms.hhrr.employees.dtos.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "ms-human-resources-areas", url = "localhost:8082", path = "/ms-humanresources-areas/v1")
//@FeignClient(name = "ms-human-resources-areas", path = "/ms-humanresources-areas/v1")
@FeignClient(name = "ms-hhrr-areas", path = "/v1")
public interface DepartmentClientRest {

  @GetMapping(value = "/departments/{id}")
  public DepartmentDto getDepartament(@PathVariable long id);

}
