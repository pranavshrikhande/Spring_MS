package controller;

import entity.Department;
import service.DepartmentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
     public Department saveDepartment(@RequestBody Department department)
     {
         log.info("Inside saveDepartment, Controller ");
         return departmentService.saveDepartment(department);
     }

     @GetMapping("/hello")
     public String printHello()
     {
         log.info("its hitting here");
         return "Hello its me";
     }

     @GetMapping("/{id}")
     public Department findDepartmentById(@PathVariable("id") Long departmentId)
     {
         log.info("Inside findDepartment, Controller ");
         return departmentService.findDepartmentById(departmentId);
     }

}
