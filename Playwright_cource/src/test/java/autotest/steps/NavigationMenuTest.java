package autotest.steps;

import autotest.config.PlaywrightConfig;
import autotest.locators.Locators;
import autotest.pages.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NavigationMenuTest {
    private final PageObject pageObject;
    private final PlaywrightConfig playwrightConfig;

    public NavigationMenuTest(PageObject pageObject, PlaywrightConfig playwrightConfig) {
        this.pageObject = pageObject;
        this.playwrightConfig = playwrightConfig;
    }

    @Given("I open the Playwright pagination page")
    public void iOpenThePlaywrightTestPage() {
        pageObject.getPage().navigate(playwrightConfig.getTestPageUrl());
    }

    @When("I check for the pagination number")
    public void iCheckForThePaginationNumber() {
        pageObject.getPage().evaluate("window.scrollTo(0, document.body.scrollHeight)");
        pageObject.getPage().waitForSelector(Locators.PAGINATION_SELECTOR);
        var isVisible = pageObject.getPage().locator(Locators.PAGE_LINK_SELECTOR).nth(1).isVisible();
        System.out.println("Элемент видим: " + isVisible);
    }

    @Then("I verify the pagination is displayed")
    public void iVerifyTheNavigationMenuIsDisplayed() {
        pageObject.getPage().evaluate("window.scrollTo(0, document.body.scrollHeight)");
        pageObject.getPage().waitForSelector(Locators.PAGINATION_SELECTOR);
        boolean menuVisible = pageObject.getPage().locator(Locators.PAGINATION_SELECTOR).isVisible();
        assertTrue(menuVisible, "Меню навигации должно быть видимым");
    }
}
