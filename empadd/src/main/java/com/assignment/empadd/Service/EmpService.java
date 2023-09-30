package com.assignment.empadd.Service;

import com.assignment.empadd.Model.Address;
import com.assignment.empadd.Model.Employee;
import com.assignment.empadd.Repo.IEmpRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpService {
    @Autowired
    IEmpRepo iEmpRepo;

    public List<Employee> getAllEmps() {
        return iEmpRepo.findAll();
    }

    public Employee getEmpById(Long empId) {
        return iEmpRepo.findById(empId).orElse(new Employee());
    }
   @Transactional
    public String updateEmpById(Long empId, Address address) {
        Employee employee = iEmpRepo.findById(empId).orElse(null);
        if(employee!=null){
            employee.setAddress(address);
        iEmpRepo.save(employee);
        return "address updated";
        }else {
            return "Employees not found";
        }
    }

    public String addEmployee(Employee employee) {
        iEmpRepo.save(employee);
        return "Employee Added";
    }

    public String deleteEmp(Long empId) {
        iEmpRepo.deleteById(empId);
        return "deleted Successfully";
    }
}
