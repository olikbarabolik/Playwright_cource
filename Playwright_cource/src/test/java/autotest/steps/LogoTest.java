package autotest.steps;

import autotest.config.PlaywrightConfig;
import autotest.locators.Locators;
import autotest.pages.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogoTest {
    private final PageObject pageObject;
    private final PlaywrightConfig playwrightConfig;

    public LogoTest(PageObject pageObject, PlaywrightConfig playwrightConfig) {
        this.pageObject = pageObject;
        this.playwrightConfig = playwrightConfig;
    }

    @Given("I open the Playwright logo page")
    public void iOpenThePlaywrightTestPage() {
        pageObject.getPage().navigate(playwrightConfig.getTestPageUrl());
    }

    @When("I check for the logo")
    public void iCheckForTheLogo() {
        pageObject.getPage().waitForSelector(Locators.LOGO_SELECTOR);
        boolean logoExists =  pageObject.getPage().locator(Locators.LOGO_SELECTOR).count() > 0;
        assertTrue(logoExists, "Логотип должен присутствовать на странице");
    }

    @Then("I verify the logo is displayed")
    public void iVerifyTheLogoIsDisplayed() {
        boolean logoVisible =  pageObject.getPage().locator(Locators.LOGO_SELECTOR).isVisible();
        assertTrue(logoVisible, "Логотип должен быть виден");
    }
}
