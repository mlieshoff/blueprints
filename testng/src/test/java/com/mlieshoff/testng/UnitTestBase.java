package com.mlieshoff.testng;

import org.mockito.MockitoAnnotations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UnitTestBase {

    private AutoCloseable autoCloseable;

    @BeforeMethod
    protected void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterMethod
    protected void tearDown() throws Exception {
        autoCloseable.close();
    }

}
