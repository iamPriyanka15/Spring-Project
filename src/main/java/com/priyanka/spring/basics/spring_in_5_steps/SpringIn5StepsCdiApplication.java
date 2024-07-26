package com.priyanka.spring.basics.spring_in_5_steps;

import com.priyanka.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import com.priyanka.spring.basics.spring_in_5_steps.cdi.SomeCdiBusiness;
import com.priyanka.spring.basics.spring_in_5_steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
//@SpringBootApplication
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);


		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);


		LOGGER.info("{}-dao-{}",business, business.getSomeCdiDao());





	}

}
