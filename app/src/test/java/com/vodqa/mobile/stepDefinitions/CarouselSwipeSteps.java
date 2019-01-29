package com.vodqa.mobile.stepDefinitions;

import com.vodqa.mobile.appium.helpers.TestContext;
import com.vodqa.mobile.pageObjects.CarouselSwipePage;
import com.vodqa.mobile.pageObjects.LoginPage;
import com.vodqa.mobile.pageObjects.SamplesListPage;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarouselSwipeSteps {

    private TestContext _testContext;

    private LoginPage _loginPage;
    private SamplesListPage _samplesListPage;
    private CarouselSwipePage _carouselSwipePage;

    public CarouselSwipeSteps(TestContext testContext) {
        _testContext = testContext;
        _loginPage = _testContext.getPageObjectManager().getLoginPage();
        _samplesListPage = _testContext.getPageObjectManager().getSamplesListPage();
        _carouselSwipePage = _testContext.getPageObjectManager().getCarouselSwipePage();
    }

    /*@Given("^user goes to Ebay Home page$")
    public void user_goes_to_Ebay_home_page() {
        _homePage.navigateTo_HomePage();
    }

    @When("^user searches for \"([^\"]*)\"$")
    public void searches_for(String searchCriteria) throws InterruptedException {
        _loginPage.perform_Search_By_Criteria(searchCriteria);
    }

    @Then("^search results are shown$")
    public void search_results_are_loaded() throws InterruptedException {
        Assert.assertTrue(_searchResultsPage.isShown_ResultsCount(), "Error showing search results count");
    }*/
}
