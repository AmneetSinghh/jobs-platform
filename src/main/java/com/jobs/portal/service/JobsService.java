package com.jobs.portal.service;


import com.jobs.portal.entity.Company;
import com.jobs.portal.entity.Jobs;
import com.jobs.portal.model.DummyModel;
import com.jobs.portal.model.JobsModel;
import com.jobs.portal.repository.IJobsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsService {

    @Autowired
    IJobsDao jobsDao;

    @Autowired
    CompanyService companyService;

    @Autowired
    private DummyModel dummyModel;

    /*
     * If object is @autowired, then on top of object we have to write  either @service | @component | @repository | @bean
     */

    public void add(JobsModel jobsModel) throws Exception {
        Company company = companyService.getCompanyByName(jobsModel.getCompanyName());
        if(company == null){
            throw new Exception("Company not found");
        }
        Jobs jobs = new Jobs();
        jobs.setJobRole(jobsModel.getJobRole());
        jobs.setCompany(company);
        jobs.setJobDescription(jobsModel.getJobDescription());
        jobs.setBaseSalary(jobsModel.getBaseSalary());
        jobs.setMaxEarnings(jobsModel.getMaxEarnings());
        jobsDao.save(jobs);
    }

    public void testing(){
       DummyModel dummyModel1 = this.dummyModel;

       DummyModel dummyModel2 = new DummyModel();
        dummyModel2.setName("Akanshu ");
        dummyModel2.setName("alansju");


       testing2();

        System.out.println(dummyModel1);
    }

    public void testing2(){
        DummyModel dummyModel = this.dummyModel;
        System.out.println(dummyModel);
    }
}
