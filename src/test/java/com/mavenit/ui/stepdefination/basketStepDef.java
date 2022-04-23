package com.mavenit.ui.stepdefination;

import com.mavenit.ui.page.DesPage;
import com.mavenit.ui.page.HeaderPage;
import com.mavenit.ui.page.SearchResultPage;
import com.mavenit.ui.page.TrolleyPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.startsWith;

public class basketStepDef {

    private SearchResultPage searchResultPage = new SearchResultPage();
    private DesPage desPage = new DesPage();
    private TrolleyPage trolleyPage = new TrolleyPage();
    private HeaderPage headerpage = new HeaderPage();
        @When("^I click on my selective item from list$")
        public void i_click_on_my_selective_item_from_list() {
            searchResultPage.selectAProduct();
            searchResultPage.sleep(5000);
        }

        @When("^I click on adding to trolley option$")
        public void i_click_on_adding_to_trolley_option() {
            desPage.addToTrolley();
            searchResultPage.sleep(2000);
        }

        @When("^I click on go to trolley option$")
        public void i_click_on_go_to_trolley_option() {
            desPage.goToTrolley();
            searchResultPage.sleep(3000);
        }

        @Then("^I Should see my clicked item its matching with my basket item$")
        public void i_Should_see_my_clicked_item_its_matching_with_my_basket_item(){
            List<String> actualList = trolleyPage.getProductInTrolley();
            assertThat(actualList, hasItem(startsWith("Puma")));
        }
}


