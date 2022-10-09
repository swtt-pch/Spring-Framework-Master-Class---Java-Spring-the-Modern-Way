package com.student.level1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers){
        // logic for bubble sort
        return  numbers;
    }
}
