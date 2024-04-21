package com.jobs.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JobsPortalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JobsPortalApplication.class, args);

		System.out.println(" All objects in spring boot application - akansha");
		// Get all bean names
		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName);
//		}
		}
	}
}


/*

all these objects, are saved into IOC container, ( inversion of control )

*/
