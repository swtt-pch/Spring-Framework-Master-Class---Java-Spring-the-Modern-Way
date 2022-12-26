package com.swttpch.mockito.demo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
    @Mock
    private DataService dataService;
    @InjectMocks
    private SomeBusinessImpl someBusiness;
    @Test
    void findTheGreatestFromAllData_basicScenario() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {1,2,3});
        assertEquals(3, someBusiness.findTheGreatestFromAllData());
    }
    @Test
    void findTheGreatestFromAllData_withOneValue() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {1});
        assertEquals(1, someBusiness.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_emptyArray() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, someBusiness.findTheGreatestFromAllData());
    }
}