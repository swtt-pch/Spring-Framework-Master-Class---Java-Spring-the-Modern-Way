package com.student.level1;


import componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("componentscan")
public class ComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(ComponentScanApplication.class, args);

		ComponentDAO personDAO1 =
				applicationContext.getBean(ComponentDAO.class);


		LOGGER.info("{}", personDAO1);

	}

}
