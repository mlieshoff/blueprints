package com.mlieshoff.testng;


import static org.testng.Assert.assertNotNull;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleTest extends UnitTestBase {

    @Test(dataProvider = "names")
    void dataProviderMethod(String name) {

        assertNotNull(name);
    }

    @Test(dataProviderClass = NamesDataProvider.class, dataProvider = "moreNames")
    void dataProviderClass(String name) {

        assertNotNull(name);
    }

    @DataProvider
    Object[][] names() {
        return new Object[][]{
            {"John"},
            {"Doe"}
        };
    }

}
