package com.student.level1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
public class MyMathTest {
    @Test
    void test(){
        int[] numbers = {1,2,3};
        MyMath math = new MyMath();
        int sum = math.calculateSum(numbers);
        System.out.println(sum);
        int expectedSum = 6;
        assertEquals(expectedSum, sum);
    }
}
