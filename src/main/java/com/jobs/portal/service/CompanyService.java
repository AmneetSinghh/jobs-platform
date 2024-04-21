package com.jobs.portal.service;

import com.jobs.portal.entity.Company;
import com.jobs.portal.model.CompanyModel;
import com.jobs.portal.repository.ICompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*

@Bean - object in SpringBoot, that is handles by SpringBoot, its LifeCycle is managed by SpringBoot
  |
@Component inherits
   |
@Service

*/

@Service
public class CompanyService {

    @Autowired
    ICompanyDao companyDao;

    public void add(CompanyModel companyModel){

        /* Make entity object */
        Company com = new Company();
        com.setName(companyModel.getName());
        companyDao.save(com);// it inserts into database.
    }
}
