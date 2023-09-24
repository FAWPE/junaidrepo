package com.assignment.Jobportal.Service;

import com.assignment.Jobportal.Model.Job;
import com.assignment.Jobportal.Repo.IRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    IRepo iRepo;


    public String addJob( Job job) {
        iRepo.save(job);
        return "Job added Successfully...!";
    }


    public List<Job> getJOb() {
       List<Job> op = (List<Job>) iRepo.findAll();
      return op;
    }

    public String updateJob(Long id, String location) {
        Job job = iRepo.findById(id).orElse(null);
        if(job!=null){
            job.setLocation(location);
            iRepo.save(job);
            return "Updated successfully..!";
        }else{
            return "Not valid id";
        }
    }

    public String deleteJob(Long id) {
        iRepo.deleteById(id);
        return "deleted successfully";
    }

    public Job getJobByCompanyName(String companyName) {
        return iRepo.findByCompanyName(companyName);
    }
    @Transactional
    public String updateSalary(Double salary, Double preSalary) {
        iRepo.updateSalary(salary, preSalary);
        return " salary updated successfully...!";
    }
}
