package com.mavenit.ui;

import com.mavenit.ui.Driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager = new DriverManager();
    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.maxBrowser();
        driverManager.navigateToUrl();
        driverManager.acceptCookies();
    }
@After
    public void tearDown(){
     //   if(Test is failed){
       // driverManager.takeScreenShot();
   // driverManager.closeBrowser();
    }


    }

