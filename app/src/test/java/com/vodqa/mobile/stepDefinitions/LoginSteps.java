package com.vodqa.mobile.stepDefinitions;

import com.vodqa.mobile.appium.helpers.TestContext;
import com.vodqa.mobile.pageObjects.CarouselSwipePage;
import com.vodqa.mobile.pageObjects.LoginPage;
import com.vodqa.mobile.pageObjects.SamplesListPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    private TestContext _testContext;

    private LoginPage _loginPage;

    public LoginSteps(TestContext testContext) {
        _testContext = testContext;
        _loginPage = _testContext.getPageObjectManager().getLoginPage();
    }

    @Given("^VodQA app is running on android device$")
    public void vodqa_app_is_running_on_android_device() {
        _loginPage.isDisplayed();
    }

    @When("^I clear user name$")
    public void i_clear_user_name() {
        _loginPage.clearUserName();
    }

    @When("^I clear password$")
    public void i_clear_password() {
        _loginPage.clearPassword();
    }

    @When("^I type user name for \"([^\"]*)\"$")
    public void i_type_user_name(String userName) {
        _loginPage.typeUserName(userName);
    }

    @When("^I type password for \"([^\"]*)\"$")
    public void i_type_password(String password) {
        _loginPage.typePassword(password);
    }

    @When("^I tap on log in button$")
    public void i_tap_on_log_in_button() {
        _loginPage.tapOnLogin();
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
