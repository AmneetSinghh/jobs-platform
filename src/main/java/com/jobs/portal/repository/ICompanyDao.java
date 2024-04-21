package com.jobs.portal.repository;


import com.jobs.portal.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                         // tableName |  primaryKey datatype         | Object relationship model
public interface ICompanyDao extends JpaRepository<Company, Long> {
    public Company findByName(String name);// internally it runs  -> select * from company where name = [:name] ( this name is taken from function parameter ]
}
/*
- companyDao will only interact with CompanyService.
- if other class wants data from company table, they will interact with CompanyService, data will get populated by ICompanyDao to company service.
 */