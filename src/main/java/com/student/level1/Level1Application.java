package com.student.level1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Level1Application {
	// What are the beans? add bean notation to class
	// What are the dependencies of a bean?  @Autowired
	// Where to search for beans? => no need
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext =
				SpringApplication.run(Level1Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {124,6,8,100,200,48,10}, 3);
		System.out.println(result);

	}

}
