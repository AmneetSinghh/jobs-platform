package com.jobs.portal.controller;

import com.jobs.portal.model.CompanyModel;
import com.jobs.portal.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// https:jobs.platform.com/company/add

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;// by default null value.

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody CompanyModel companyModel) {
        companyService.add(companyModel);
        return new ResponseEntity<>("Company added successfully", HttpStatus.OK);
    }
}