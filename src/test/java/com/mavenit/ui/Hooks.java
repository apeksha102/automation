package com.mavenit.ui;

import com.mavenit.ui.Driver.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager = new DriverManager();
    Scenario scenario;
    @Before
    public void setUp(){
        driverManager.openBrowser();
        driverManager.maxBrowser();
        driverManager.navigateToUrl();
        driverManager.acceptCookies();
    }
@After
    public void tearDown(Scenario scenario){
        this.scenario=scenario;
        if(scenario.isFailed()){
            driverManager.takeScreenShot(scenario);
        }

  driverManager.closeBrowser();
    }


    }

