package com.priyanka.spring.basics.spring_in_5_steps;

import com.priyanka.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import com.priyanka.spring.basics.spring_in_5_steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIn5StepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		LOGGER.info("Bean Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);


		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getXmlJdbcConnection());


	}

}
