package com.student.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "Devops");
    @Test
    void test(){
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("saskj");
        assertEquals(true,test);
        assertTrue(test, "Something went wrong");
        assertFalse(test2, "Something went wrong");
        //assertNull, assertNotNull
        assertEquals(3, todos.size());
        assertArrayEquals(new int[] {1,2}, new int[] {1,2});
    }
}
