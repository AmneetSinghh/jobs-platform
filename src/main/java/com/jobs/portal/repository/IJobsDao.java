package com.jobs.portal.repository;

import com.jobs.portal.entity.Company;
import com.jobs.portal.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// tableName |  primaryKey datatype         | Object relationship model
public interface IJobsDao extends JpaRepository<Jobs, Long> {

}


/*

- in java we are using jpa ( orm ) for interacting with database ( query, get, insert, delte, put)
- JPA is Java Persistence API
 */