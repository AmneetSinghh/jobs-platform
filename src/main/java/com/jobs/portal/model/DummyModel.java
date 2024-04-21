package com.jobs.portal.model;


import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
//@Component               // component inherits bean
public class DummyModel {
    String name;
    String number;
    String age;
}


/*
 * If object is @autowired, then on top of object we have to write  either @service | @component | @repository | @bean
 *
 */