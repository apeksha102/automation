package com.mavenit.ui.page;

import com.mavenit.ui.Driver.DriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class TrolleyPage extends DriverManager {
    public List<String> getProductInTrolley() {
        List<WebElement> trolleyElement = driver.findElements(By.cssSelector("a[data-e2e='product-name']"));//2
        List<String> actualList = new ArrayList<>();
        for (WebElement element : trolleyElement) {
            String productNameInTrolley = element.getText();
            // System.out.println("product in trolley: "+productNameInTrolley);
            if (!productNameInTrolley.isEmpty()) {
                actualList.add(productNameInTrolley);
            }
        }
        return actualList;
    }
    public void selectQuantity(int choice) {
        WebElement selectElement = driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"));
        Select select = new Select(selectElement);
        select.selectByVisibleText(String.valueOf(choice));
        sleep(5000);
    }
    public double getThePrizeForProduct() {
        String prizeInString = driver.findElement(By.cssSelector("span[data-e2e='product-line-price']"))
                .getText().replace("£", "");
        return Double.parseDouble(prizeInString);

    }
    public void clickOnPicture(){
        driver.findElement(By.cssSelector("img[data-test='component-image']")).click();


    }
public void clickOnTrolleyTab(){
        driver.findElement(By.cssSelector("a[data-test='trolley']")).click();

}
public void removeOptionClick(){
        driver.findElement(By.cssSelector("button[data-test='basket-removeproduct']")).click();
}
}
