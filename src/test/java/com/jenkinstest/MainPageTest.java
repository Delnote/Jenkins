package com.jenkinstest;

import org.testng.annotations.Test;

import static com.jenkinstest.ExampleApi.login;
import static com.jenkinstest.site.MainPage.testMainPage;

public class MainPageTest {

    @Test
    public void testMethod() {
        testMainPage();
    }

    @Test
    public void apiTest() {
        login();
    }

}
