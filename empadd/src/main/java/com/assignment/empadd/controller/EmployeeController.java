package com.assignment.empadd.controller;

import com.assignment.empadd.Model.Address;
import com.assignment.empadd.Model.Employee;
import com.assignment.empadd.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class EmployeeController {

    @Autowired
    EmpService empService;
//    GET /employees - get all employees
    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return empService.getAllEmps();
    }
//    GET /employees/{id} - get an employee by id
    @GetMapping("employee/id/{empId}")
    public Employee getEmpById(@PathVariable Long empId){
        return empService.getEmpById(empId);
    }


//    POST /employees - create a new employee
    @PostMapping("emmplyee")
    public String addEmployee(Employee employee){
        return empService.addEmployee(employee);
    }
//    PUT /employees/{id} - update an employee by id
@PutMapping("employee/id/{empId}")
public String updateEmpById(@PathVariable Long empId, @RequestBody Address address){
    return empService.updateEmpById(empId,address);
}

//    DELETE /employees/{id} - delete an employee by id
    @DeleteMapping("employee")
    public String deleteEmp(@RequestParam Long empId){
        return empService.deleteEmp(empId);
    }
}
