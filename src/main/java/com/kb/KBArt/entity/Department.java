package com.kb.KBArt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long DepartmentId;
    private String DepartmentName;
    private String DepartmentAddress;
    private String DepartmentCode;

    public Long getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Long departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
        DepartmentId = departmentId;
        DepartmentName = departmentName;
        DepartmentAddress = departmentAddress;
        DepartmentCode = departmentCode;
    }

    public Department() {

    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentId=" + DepartmentId +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", DepartmentAddress='" + DepartmentAddress + '\'' +
                ", DepartmentCode='" + DepartmentCode + '\'' +
                '}';
    }
}
