package com.student.level1;


import com.student.level1.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDIApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(CDIApplication.class);
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(CDIApplication.class);

		SomeCDIBusiness personDAO1 =
				applicationContext.getBean(SomeCDIBusiness.class);


		LOGGER.info("{}", personDAO1);

	}

}
