package com.loreta.javaconfiguration.Controllers;

import com.loreta.javaconfiguration.entity.Department;
import com.loreta.javaconfiguration.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private  DepartmentService departmentService;
    @PostMapping("/create-departments")
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{id}")
    public Department  fetchDepartmentById(@PathVariable ("id") Long DepartmentId){
        return departmentService.fetchDepartmentById(DepartmentId);
    }
    @DeleteMapping("/delete-department/{id}")
    public String deleteDepartmentById(@PathVariable ("id") Long DepartmentId){
        departmentService.deleteDepartmentById(DepartmentId);
        return "Department delete success!!";
    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable ("id") Long departmentId , @RequestBody Department department ){
        return  departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable ("name") String departmentName){
        return  departmentService.fetchDepartmentByName(departmentName);
    }
}
