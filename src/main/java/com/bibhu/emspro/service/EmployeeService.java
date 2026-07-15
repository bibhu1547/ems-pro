package com.bibhu.emspro.service;

import com.bibhu.emspro.entity.Employee;
import com.bibhu.emspro.exception.ResourceNotFoundException;
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

    public Employee getEmployeeById(Long id)
    {
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID:"+id));
    }

    public Employee updateEmployee(Long id, Employee employeeDetails)
    {
        Employee employee = employeeRepository.findById(id).orElseThrow
                (() -> new ResourceNotFoundException("Employee not found with ID:"+id));
        employee.setName(employeeDetails.getName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setSalary(employeeDetails.getSalary());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id)
    {
        Employee employee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee Not Found with ID:"+id));
        employeeRepository.delete(employee);
    }
}