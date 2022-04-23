package com.mavenit.ui.page;

import com.mavenit.ui.Driver.DriverManager;
import org.openqa.selenium.By;

public class DesPage extends DriverManager {
    public void addToTrolley() {
        driver.findElement(By.cssSelector("button[data-test='add-to-trolley-button-button']")).click();
        sleep(4000);
    }
    public void goToTrolley() {
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
        sleep(400);
    }
public void SelectQuantity(){}
}
