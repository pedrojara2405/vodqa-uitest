package com.vodqa.mobile.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , glue = {"com/vodqa/mobile/stepDefinitions"}
        , tags = {"@Ignored,@e2e"}
        , plugin = {"pretty", "html:build/cucumber-reports",
        "json:build/cucumber-reports/cucumber.json",
        "junit:build/cucumber-reports/cucumber.xml"}

        /*,plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
        "json:build/cucumber-reports/cucumber.json",
        "junit:build/cucumber-reports/cucumber.xml"}*/
        ,monochrome = true
)
public class TestRunner {
}
