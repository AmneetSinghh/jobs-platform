package com.jobs.portal.entity;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;



@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Jobs{

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "jobs_seq")
    @SequenceGenerator(name = "jobs_seq", sequenceName = "jobs_seq", allocationSize = 1)
    private Long id;

    @Column(name = "jobrole")
    private String jobRole;

    @Column(name = "jobdescription")
    private String jobDescription;

    @Column(name = "basesalary", nullable = false)
    private String baseSalary;

    @Column(name = "maxearnings", nullable = false)
    private String maxEarnings;

    @Column(name = "joiningbonus")
    private String joiningBonus;

    @Column(name = "referralbonus")
    private String referralBonus;

    @Column(name = "isparttimeavailable")
    private String isPartTimeAvailable;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")// jobs table mi name
    private Company company;

    @Column(name = "joblink")
    private String jobLink;

    @Column(name = "jobtype")
    private String jobType;

    @Column(name = "joblocation")
    private String jobLocation;

    @Column(name = "contactpersonname")
    private String contactPersonName;

    @Column(name = "contactpersonphonenumber")
    private String contactPersonPhoneNumber;

    @Column(name = "createdat")
    private LocalDateTime createdAt;

    @Column(name = "updatedat")
    private LocalDateTime updatedAt;

    @Column(name = "deletedat")
    private LocalDateTime deletedAt;


    private Boolean active;
}