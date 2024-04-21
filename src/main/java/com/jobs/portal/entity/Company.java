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
public class Company {

    @Id
    @Column(name = "company_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "company_seq")
    @SequenceGenerator(name = "company_seq", sequenceName = "company_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "createdat", nullable = true)
    private LocalDateTime createdAt;

    @Column(name = "updatedat", nullable = true)
    private LocalDateTime updatedAt;

    @Column(name = "deletedat")
    private LocalDateTime deletedAt;

//    @OneToMany(mappedBy = "company")
//    private List<Job> jobs;

    // Constructor, getters, and setters
}