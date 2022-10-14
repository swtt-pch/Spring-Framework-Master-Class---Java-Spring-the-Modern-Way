package com.student.level1;

import com.student.level1.basic.BinarySearchImpl;
import com.student.level1.scope.xml.XmlPersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class XMLContextApplication {
	// What are the beans? add bean notation to class
	// What are the dependencies of a bean?  @Autowired
	// Where to search for beans? => no need
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		try {
			ClassPathXmlApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml");

			XmlPersonDAO xmlPersonDAO =
					applicationContext.getBean(XmlPersonDAO.class);


			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
		} finally {

		}


	}

}
