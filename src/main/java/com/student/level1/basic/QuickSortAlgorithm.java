package com.student.level1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers){
        // logic for bubble sort
        return  numbers;
    }
}
