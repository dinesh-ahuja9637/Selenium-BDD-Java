package com.org_name.stepDefinitions;

import com.org_name.hooks.Hooks;
import com.org_name.pages.BasePage;
import com.org_name.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageStepDefinition {

    @Before public void beforeAnnotation()
    {
        System.out.println("@Before");
    }

    WebDriver webDriver;
    HomePage homePage;

    @Given("when user navigate to website {string}")
    public void when_user_navigate_to_website(String url) {
        System.out.println("Backgroud step1");
        homePage = new HomePage();
        System.setProperty("webdriver.driver.chrome",System.getProperty("user.dir")+"\\src\\test\\java\\com\\org_name\\target\\drivers\\chromedriver.exe");
        webDriver= new ChromeDriver();
        webDriver.get(url);
    }
    @And("user inputs the text as {string}")
    public void user_inputs_the_text_as(String name) {
        // Write code here that turns the phrase above into concrete actions
        homePage.setUpWebDriver(webDriver);
        homePage.setEnterText(name);


    }

    @When("user closes the application")
    public void user_closes_the_application() {
        // Write code here that turns the phrase above into concrete actions
        //webDriver.close();
    }

    @Then("user verifies the title of the page and if it matches then perform next step")
    public void userVerifiesTheTitleOfThePageAndIfItMatchesThenPerformNextStep() {
//String title = homePage.
        String title = homePage.getAppTitle();
        Assert.assertTrue("title is not matching", title.contains("Dinesh"));
    }

    @After
    public void afterAnnotation()
    {
        System.out.println("@After");
    }
}
