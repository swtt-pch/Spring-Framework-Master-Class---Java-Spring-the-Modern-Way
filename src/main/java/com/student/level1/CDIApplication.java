package com.student.level1;


import com.student.level1.cdi.SomeCDIBusiness;
import com.student.level1.cdi.SomeCDIDAO;
import componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CDIApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(CDIApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(CDIApplication.class, args);

		SomeCDIBusiness personDAO1 =
				applicationContext.getBean(SomeCDIBusiness.class);


		LOGGER.info("{}", personDAO1);

	}

}
