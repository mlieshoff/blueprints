package com.mlieshoff.backend.service;


import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import com.mlieshoff.backend.dao.Dao;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StandardServiceImplTest {

    private AutoCloseable autoCloseable;

    @InjectMocks
    private ServiceImpl unitUnderTest;

    @Mock
    private Dao dao;

    @BeforeMethod
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterMethod
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void fooBar_whenCalled_thenReturnValue() {
        String expected = "fooxy";
        when(dao.bar()).thenReturn("xy");

        String actual = unitUnderTest.fooBar();

        assertEquals(actual, expected);
    }

}
