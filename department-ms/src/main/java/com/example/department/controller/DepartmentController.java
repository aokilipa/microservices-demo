package com.example.department.controller;

import com.example.department.model.Department;
import com.example.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping(value = "/", consumes = "application/json")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment DepartmentController");
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long id) {
        log.info("Inside findDepartmentById of DepartmentController");
        return service.findDepartmentById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.info("Inside delete of DepartmentController");
        service.deleteDepartment(id);
    }
}
