package com.kb.KBArt.Controller;

import com.kb.KBArt.entity.Department;
import com.kb.KBArt.service.DepartmentService;
import com.kb.KBArt.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

}
