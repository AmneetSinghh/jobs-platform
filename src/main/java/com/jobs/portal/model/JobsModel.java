package com.jobs.portal.model;


import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class JobsModel {
    private String jobRole;
    private String jobDescription;
    private String baseSalary;
    private String maxEarnings;
    private String companyName;

}
