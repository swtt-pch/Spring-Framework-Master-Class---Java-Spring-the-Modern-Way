package com.student.level1;


import componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("componentscan")
public class ComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(ComponentScanApplication.class);

		ComponentDAO personDAO1 =
				applicationContext.getBean(ComponentDAO.class);


		LOGGER.info("{}", personDAO1);

	}

}
