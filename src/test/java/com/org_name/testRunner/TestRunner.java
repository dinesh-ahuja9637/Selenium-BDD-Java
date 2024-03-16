package com.org_name.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      plugin = {"json:target/cucumber.json"},
        features = "src/test/java/com/org_name/features",
        glue = "com.org_name.stepDefinitions",dryRun = false,
        tags = " not @title"

)
public class TestRunner {
}
/*
features = {"//features//TestHomePage.feature"} ,
        dryRun = true,
        monochrome = true,
        glue = {"stepDefinitions"},
 */
