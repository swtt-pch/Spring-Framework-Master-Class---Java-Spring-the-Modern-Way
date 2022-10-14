package com.student.level1;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeALL");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }
    @Test
    void test1(){
        System.out.println("test 1");
    }
    @Test
    void test2(){
        System.out.println("test 2");
    }
    @Test
    void test3(){
        System.out.println("test 3");
    }
    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll");
    }
}
