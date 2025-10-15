package autotest.steps;

import autotest.config.PlaywrightConfig;
import autotest.pages.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static autotest.locators.Locators.VIEW_ALL_BUTTON_SELECTOR;
import static org.junit.Assert.assertTrue;

public class ViewAllButtonTest {
    private final PageObject pageObject;
    private final PlaywrightConfig playwrightConfig;

    public ViewAllButtonTest(PageObject pageObject, PlaywrightConfig playwrightConfig) {
        this.pageObject = pageObject;
        this.playwrightConfig = playwrightConfig;
    }

    @Given("I open the Playwright all button page")
    public void iOpenThePlaywrightTestPage() {
        pageObject.getPage().navigate(playwrightConfig.getTestPageUrl());
    }

    @When("I check the View all button")
    public void iCheckTheViewAllButton() {
        pageObject.getPage().click(VIEW_ALL_BUTTON_SELECTOR);
    }

    @Then("I verify the View all button redirects")
    public void iVerifyTheViewAllButtonRedirects() {
        String currentUrl = pageObject.getPage().url();
        assertTrue(currentUrl.contains("/vue-app/index.html#/"));
    }
}
