package com.jobs.portal.controller;

import com.jobs.portal.model.CompanyModel;
import com.jobs.portal.model.JobsModel;
import com.jobs.portal.service.CompanyService;
import com.jobs.portal.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobsController {

    @Autowired
    JobsService jobsService;

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody JobsModel jobsModel) {
        try{
            jobsService.add(jobsModel);
        } catch( Exception e){
            return new ResponseEntity<>("company not found", HttpStatus.BAD_GATEWAY);
        }

        return new ResponseEntity<>("successfully find the company", HttpStatus.OK);
    }

    @GetMapping("/notAppliedJobs")
    public ResponseEntity<Object> notAppliedJobs() {
//        companyService.add(companyModel);
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @PostMapping("/apply")
    public ResponseEntity<Object> apply(@RequestBody CompanyModel companyModel) {
//        companyService.add(companyModel);
        return new ResponseEntity<>("apply job", HttpStatus.OK);
    }

    @PostMapping("/status")
    public ResponseEntity<Object> status(@RequestBody CompanyModel companyModel) {
//        companyService.add(companyModel);
        return new ResponseEntity<>("get status", HttpStatus.OK);
    }


    @GetMapping("/test")
    public ResponseEntity<Object> testing() {
        jobsService.testing();
        return new ResponseEntity<>("", HttpStatus.OK);
    }


}