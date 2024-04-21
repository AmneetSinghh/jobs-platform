package com.jobs.portal.model;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class CompanyModel {
    private String name;
}

/*
It just a normal data transfer objects

- getting data from frontend
- pass to service layer
- get data from other external sources ex : adharCard info, other info - business logic
- set into this object
- their lifecycle over, because now object created, now convert to entity and save to database
 */