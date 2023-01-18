package com.mlieshoff.backend.service;


import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import com.mlieshoff.backend.dao.Dao;
import com.mlieshoff.testng.UnitTestBase;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testng.annotations.Test;

public class WithBaseServiceImplTest extends UnitTestBase {

    @InjectMocks
    private ServiceImpl unitUnderTest;

    @Mock
    private Dao dao;

    @Test
    void fooBar_whenCalled_thenReturnValue() {
        String expected = "fooxy";
        when(dao.bar()).thenReturn("xy");

        String actual = unitUnderTest.fooBar();

        assertEquals(actual, expected);
    }

}
