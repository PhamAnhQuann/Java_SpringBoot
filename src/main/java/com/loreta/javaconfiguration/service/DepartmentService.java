package com.loreta.javaconfiguration.service;

import com.loreta.javaconfiguration.entity.Department;

import java.util.List;

public interface DepartmentService {
    public  List<Department> fetchDepartmentList();

    public Department saveDepartment(Department department);

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
