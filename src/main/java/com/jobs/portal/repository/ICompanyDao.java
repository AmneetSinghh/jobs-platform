package com.jobs.portal.repository;


import com.jobs.portal.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                         // tableName |  primaryKey datatype         | Object relationship model
public interface ICompanyDao extends JpaRepository<Company, Long> {

}
