package com.highstreet.highstreet.controller;

import com.highstreet.highstreet.persistance.dto.EmployeeDto;
import com.highstreet.highstreet.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public void add(@RequestBody EmployeeDto employeeDto){
        employeeService.add(employeeDto);
    }
    @DeleteMapping("/employee/{id}")
    public void delete(@PathVariable(name = "id") long id){
        employeeService.delete(id);
    }
    @GetMapping("/employee")
    public List<EmployeeDto> getAll(){
        return employeeService.getAll();
    }
    @GetMapping("/employee/{id}")
    public EmployeeDto getOne(@PathVariable(name = "id") long id){
        return employeeService.getById(id);
    }
}
