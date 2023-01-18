package com.mlieshoff.testng;


import org.testng.annotations.DataProvider;

public class NamesDataProvider {

    @DataProvider
    Object[][] moreNames() {
        return new Object[][]{
            {"Al"},
            {"Bundy"}
        };
    }

}
