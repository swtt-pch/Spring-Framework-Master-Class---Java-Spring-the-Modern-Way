package com.student.level1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    // 1- Sorting an array
    public int binarySearch(int[] numbers, int numberToSearchFor){
        // 1.1 - Implement Sorting Logic, so you had to choose
        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // 2 - Search the array
        // 3 - Return the result
        return 3;
    }




}
