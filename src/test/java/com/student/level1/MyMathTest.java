package com.student.level1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
public class MyMathTest {
    private MyMath math = new MyMath();
    @Test
    void calculateSum_ThreeMemberArray(){
        assertEquals(6, math.calculateSum(new int[] {1,2,3}));
    }

    @Test
    void calculateSum_ZeroLengthArray(){
        assertEquals(0, math.calculateSum(new int[] {}));
    }
}
