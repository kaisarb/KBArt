package com.kb.KBArt.service;

import com.kb.KBArt.entity.Department;

import java.util.List;

public interface DepartmentService {


    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);
}
