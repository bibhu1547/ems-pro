package com.bibhu.emspro.service;

import com.bibhu.emspro.entity.Employee;
import com.bibhu.emspro.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }
}