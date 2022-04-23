package com.mavenit.ui.stepdefination;

import com.mavenit.ui.page.HeaderPage;
import com.mavenit.ui.page.SearchResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchStepDefi {
    private HeaderPage headerPage = new HeaderPage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private String searchTerm;

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() {
       String actual= headerPage.getCurrentUrl();
        assertThat(actual,endsWith("co.uk/"));
    }


    @Then("^I should be able to see my respective products$")
    public void i_should_be_able_to_see_my_respective_products() {
        String actual = searchResultPage.getProductTitle();
        assertThat(searchTerm , is(equalTo(actual)));

    }

    @When("^I search product \"([^\"]*)\"$")
    public void iSearchProduct(String searchItem) {
        this.searchTerm=searchItem;
        headerPage.search(searchItem);
    }
}
