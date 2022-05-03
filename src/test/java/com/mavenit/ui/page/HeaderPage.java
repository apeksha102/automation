package com.mavenit.ui.page;

import com.mavenit.ui.Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HeaderPage extends DriverManager {
    public void  search(String product) {
        driver.findElement(By.className("_1Rz0y//////////")).sendKeys(product);
        driver.findElement(By.cssSelector("._1gqeQ")).click();

    }
    public WebElement selectNavItem(String item, String elementValue){
        List<WebElement> elements=  driver.findElements(By.cssSelector(elementValue));
        boolean isElementFound= false;
        WebElement foundElement = null;
        for(WebElement navItemElement : elements){
            if (navItemElement.getText().equalsIgnoreCase(item)){
                Actions action = new Actions(driver);
                action.moveToElement(navItemElement).build().perform();
                isElementFound = true;
                foundElement=navItemElement;
                break;
            }
        }
        if(!isElementFound){
            throw new RuntimeException("Element is not found"+item);
        }
        sleep(5000);
        return foundElement;
    }
    public void hoverToNavItem(String item){
        selectNavItem(item,"._3rkgc");
    }
    public void hoverToLeftPanelItem(String item){
        selectNavItem(item,"._1Ce4i");
    }
    public void hoverToProductItem(String item){
        selectNavItem(item,"._39ydj").click();
    }
    public WebElement hoverNavIt(String item){
        WebElement navElement = driver.findElement(By.linkText(item));
        Actions action = new Actions(driver);
        action.moveToElement(navElement).build().perform();
        sleep(10000);
        return navElement;

    }


}



