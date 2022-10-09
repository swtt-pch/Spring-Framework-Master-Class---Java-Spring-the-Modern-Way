package com.student.level1;

import com.student.level1.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication {
	// What are the beans? add bean notation to class
	// What are the dependencies of a bean?  @Autowired
	// Where to search for beans? => no need
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext =
				SpringApplication.run(BasicApplication.class, args);

		BinarySearchImpl binarySearch1 =
				applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch2 =
				applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch1);
		System.out.println(binarySearch2);

		int result = binarySearch1.binarySearch(new int[] {124,6,8,100,200,48,10}, 3);
		System.out.println(result);

	}

}
