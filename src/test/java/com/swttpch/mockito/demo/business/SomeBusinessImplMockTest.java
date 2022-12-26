package com.swttpch.mockito.demo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataService dataService = mock(DataService.class);
//        dataService.retrieveAllData() => new int[] {1,2,3};
        when(dataService.retrieveAllData()).thenReturn(new int[] {1,2,3});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        assertEquals(3, someBusiness.findTheGreatestFromAllData());
    }
    @Test
    void findTheGreatestFromAllData_withOneValue() {
        DataService dataService = mock(DataService.class);
//        dataService.retrieveAllData() => new int[] {1,2,3};
        when(dataService.retrieveAllData()).thenReturn(new int[] {1});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(1, result);
    }
}