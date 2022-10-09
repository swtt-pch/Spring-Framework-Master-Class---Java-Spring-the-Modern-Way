package com.student.level1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Level1Application {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {124,6,8,100,200,48,10}, 3);
		System.out.println(result);
		SpringApplication.run(Level1Application.class, args);
	}

}
