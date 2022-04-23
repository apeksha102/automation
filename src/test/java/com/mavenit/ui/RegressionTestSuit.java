/*
package com.mavenit.ui;

import com.mavenit.ui.page.DesPage;
import com.mavenit.ui.page.HeaderPage;
import com.mavenit.ui.page.SearchResultPage;
import com.mavenit.ui.page.TrolleyPage;
import com.mavenit.ui.Hooks;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.mavenit.ui.Driver.DriverManager.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class RegressionTestSuit extends Hooks {
    private HeaderPage headerPage = new HeaderPage();
    private SearchResultPage searchPage = new SearchResultPage();
    private DesPage despage = new DesPage();
    private TrolleyPage trolleyPage = new TrolleyPage();

    @Test
    public void SearchTest() {
        headerPage.search("nike");
        String actual = searchPage.getProductTitle();
        assertThat("nike", is(equalTo(actual)));
        String actualUrl = searchPage.getCurrentUrl();
        assertThat(actualUrl, endsWith("nike"));
    }

    @Test

    public void basketTest() {
        headerPage.search("nike");
        searchPage.selectAProduct();
        despage.addToTrolley();
        despage.goToTrolley();
        List<String> actualList = trolleyPage.getProductInTrolley();
        assertThat(actualList, hasItem("nike"));
    }


    @Test
    public void qtyTest() {
        headerPage.search("nike");
        searchPage.selectAProduct();
        despage.addToTrolley();
        despage.goToTrolley();
        double prizeForProduct = trolleyPage.getThePrizeForProduct();
        int quantityChange = 3;
        double expected = prizeForProduct * quantityChange;
        trolleyPage.selectQuantity(quantityChange);
        double actual = trolleyPage.getThePrizeForProduct();
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void reviewTest() {
        headerPage.search("nike");
        searchPage.selectRating("1");
        List<Double> actual = searchPage.getAllProductsRating();
        System.out.println(actual.toString());
        assertThat(actual, everyItem(greaterThanOrEqualTo(1.00)));
    }

    @Test
    public void shopByTest() {
        headerPage.hoverToNavItem("Shop");
        headerPage.hoverToLeftPanelItem("Technology");
        headerPage.hoverToProductItem("Laptops");
    }

    @Test
    public void shopByTestApp() {
        headerPage.hoverNavIt("Shop");
        headerPage.sleep(5000);
        headerPage.hoverToNavItem("Appliances");
        headerPage.sleep(5000);
        headerPage.hoverToNavItem("Television");

    }
@Test
    public void filterBrand() {
        headerPage.hoverToNavItem("Shop");
        headerPage.hoverToLeftPanelItem("Technology");
        headerPage.hoverToProductItem("Laptops");
        driver.findElement(By.cssSelector("label[data-filter-id='apple']")).click();
        List<WebElement> productElements = driver.findElements(By.cssSelector("a[id^='product-title']"));

        for (WebElement productElement : productElements) {
            String expectedAppleLaptop = productElement.getText();
            System.out.println("The Total Apple Laptop is" + expectedAppleLaptop);

        }


    }
}
 */



