package com.mavenit.ui.Driver;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DriverManager {
    public static WebDriver driver;
    String URL="www.argos.co.uk";

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void maxBrowser() {
        driver.manage().window().maximize();
    }

    public void navigateToUrl() {
        driver.get(URL);
    }

    public void acceptCookies() {
        driver.findElement(By.id("consent_prompt_submit")).click();
    }

    public void takeScreenShot(Scenario scenario) {
        byte[] screenshot =
                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot , "image/png");
    }

    public void waitForElement() {

    }

    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void closeBrowser(){
        driver.quit();

    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();

    }


}
