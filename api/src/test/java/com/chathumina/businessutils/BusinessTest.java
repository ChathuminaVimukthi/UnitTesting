package com.chathumina.businessutils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BusinessTest {

    @Mock
    DataService dataService;

    @InjectMocks
    Business business;

    @Test
    public void findTheGreatestFromAllData() throws FooException {
        when(dataService.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
        assertEquals(24, business.findTheGreatestFromAllData());
    }


    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() throws FooException {
        when(dataService.retrieveAllData()).thenReturn(new int[] { 15 });
        assertEquals(15, business.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_NoValues() throws FooException {
        when(dataService.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(0, business.findTheGreatestFromAllData());
    }
}