package com.student.level1;

import com.student.level1.basic.BinarySearchImpl;
import com.student.level1.scope.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		try {
			ClassPathXmlApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml");

			XmlPersonDAO xmlPersonDAO =
					applicationContext.getBean(XmlPersonDAO.class);


			LOGGER.info("Beans loaded ->  {}",(Object)applicationContext.getBeanDefinitionNames());
//			System.out.println(xmlPersonDAO);
//			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
		} finally {

		}


	}

}
