package com.swttpch.mockito.demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataService DataServiceStub = new DataServiceStub();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(DataServiceStub);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(3, result);
    }

    void findTheGreatestFromAllData_withOneValue() {
        DataService DataServiceStub2 = new DataServiceStub2();
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(DataServiceStub2);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(1, result);
    }
}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[] {1,2,3};
    }
}

class DataServiceStub2 implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[] {1};
    }
}