package com.bibhu.emspro.service;

import com.bibhu.emspro.dto.EmployeeRequestDto;
import com.bibhu.emspro.dto.EmployeeResponseDto;
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

    public EmployeeResponseDto saveEmployee(EmployeeRequestDto requestDto) {
        //DTO -> Entity
        Employee employee = new Employee();
        employee.setName(requestDto.getName());
        employee.setEmail(requestDto.getEmail());
        employee.setSalary(requestDto.getSalary());

        //Save to database
        Employee savedEmployee = employeeRepository.save(employee);

        //Entity -> DTO
        EmployeeResponseDto responseDto = new EmployeeResponseDto();
        responseDto.setName(savedEmployee.getName());
        responseDto.setEmail(savedEmployee.getEmail());
        responseDto.setId(savedEmployee.getId());

        return responseDto;
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