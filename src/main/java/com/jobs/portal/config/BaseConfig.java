package com.jobs.portal.config;


import com.jobs.portal.model.DummyModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    /*
     * @Service , @RestController , @Repository everytime @Component -> then @Component inherits @Bean
     * Example :
     *
     *     @Bean
     *       |
     *    @Component
     *       |
     *    @Service
     *
     */
    @Bean
    public DummyModel GetDummyModel(){
        DummyModel dummyModel = new DummyModel();
        dummyModel.setAge("12");
        dummyModel.setNumber("1314");
        dummyModel.setName("Amneet Singh");
        return dummyModel;
    }

}
