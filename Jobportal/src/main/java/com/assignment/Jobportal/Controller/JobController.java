package com.assignment.Jobportal.Controller;

import com.assignment.Jobportal.Model.Job;
import com.assignment.Jobportal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping("job")
    public  String addJob( @RequestBody Job job){
        return jobService.addJob(job);
    }

    @GetMapping("job")
    public List<Job> getJob(){
        return jobService.getJOb();
    }

    @PutMapping("job/id/{id}/location/")
    public String updateJob(@PathVariable Long id, @RequestParam String location){
        return jobService.updateJob(id,location);
    }

    @DeleteMapping("delete/id")
    public String deleteJob(@RequestParam Long id){
        return jobService.deleteJob(id);
    }

    @GetMapping("job/companyName")
    public Job getJobByCompanyName(@RequestParam String companyName){
        return jobService.getJobByCompanyName(companyName);
    }

    @PutMapping("update/salary/{salary}")
    public String updateSalary(@PathVariable Double salary, @RequestParam  Double preSalary){
        return jobService.updateSalary(salary, preSalary);
    }
}
