package autotest.steps;

import autotest.config.PlaywrightConfig;
import autotest.locators.Locators;
import autotest.pages.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class H1Test {
    private final PageObject pageObject;
    private final PlaywrightConfig playwrightConfig;

    public H1Test(PageObject pageObject, PlaywrightConfig playwrightConfig) {
        this.pageObject = pageObject;
        this.playwrightConfig = playwrightConfig;
    }

    @Given("I open the Playwright H1 header page")
    public void iOpenThePlaywrightWelcomePage() {
        pageObject.getPage().navigate(playwrightConfig.getTestPageUrl());
    }

    @When("I check for the H1 header")
    public void iCheckForTheWelcomeHeader() {
        assertTrue(pageObject.getHeaderText().contains("Каталог"));
    }

    @Then("I close the browser after checking tests")
    public void iCloseTheBrowserAfterCheckingTests() {
        pageObject.getPage().context().browser().close();
    }
}
