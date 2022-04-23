package com.mavenit.ui.page;

import com.mavenit.ui.Driver.DriverManager;
import com.mavenit.ui.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends DriverManager {

    public String getProductTitle() {
        return driver.findElement(By.cssSelector(".styles__SearchTerm-sc-1haccah-1")).getText();
    }
    public void selectAProduct() {
        List<WebElement> productWebElement = driver.findElements(By.cssSelector("a[id^='product-title']"));
        // System.out.println("The Total list of an item  "+productWebElement.size());
        int elementsSize = productWebElement.size();
        int randomIndex = new Helpers().randomNumber(elementsSize);
        WebElement selectedWebElement = productWebElement.get(randomIndex);
        String expected = selectedWebElement.getText();
        selectedWebElement.click();
        sleep(5000);
    }
    public void selectRating(String choice) {
        List<WebElement> ratingWebElement = driver.findElements(By.cssSelector("#content-container>label"));
        for (WebElement ratingElement : ratingWebElement) {
            String labelTxt = ratingElement.getText();
            if (labelTxt.startsWith(choice)) {
                ratingElement.click();
                break;
            }
        }
        sleep(5000);
    }

    public List<Double> getAllProductsRating() {
        List<Double> list = new ArrayList<>();
        List<WebElement> ratingElements=driver.findElements(By.cssSelector("div[data-test='component-ratings']"));
        for(WebElement ratingElement:ratingElements){
            String ratingInString=  ratingElement.getAttribute("data-star-rating");
            double ratingInDouble=Double.parseDouble(ratingInString);
            list.add(ratingInDouble);
        }
        return list;
    }
}
