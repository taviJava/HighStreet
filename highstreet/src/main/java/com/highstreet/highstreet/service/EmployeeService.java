package com.highstreet.highstreet.service;

import com.highstreet.highstreet.persistance.dto.EmployeeDto;
import com.highstreet.highstreet.persistance.model.Employee;
import com.highstreet.highstreet.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
     @Autowired
    private EmployeeRepository employeeRepository;

    public void add(EmployeeDto employeeDto){
        employeeRepository.save(getModel(employeeDto));
    }

    public void delete(long id){
        employeeRepository.deleteById(id);
    }

    public List<EmployeeDto> getAll(){
        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        for (Employee employee: employeeList){
            employeeDtos.add(getDto(employee));
        }
        return employeeDtos;
    }

    public EmployeeDto getById(long id){
        EmployeeDto employeeDto = new EmployeeDto();
        Optional<Employee> optionalDistance = employeeRepository.findById(id);
        if (optionalDistance.isPresent()){
            employeeDto = getDto(optionalDistance.get());
        }
        return employeeDto;
    }


    private Employee getModel(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        return employee;
    }

    private EmployeeDto getDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        return employeeDto;
    }
}
