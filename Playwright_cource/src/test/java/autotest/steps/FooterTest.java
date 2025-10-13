package autotest.steps;

import autotest.config.PlaywrightConfig;
import autotest.locators.Locators;
import autotest.pages.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FooterTest {
    private final PageObject pageObject;
    private final PlaywrightConfig playwrightConfig;

    public FooterTest(PageObject pageObject, PlaywrightConfig playwrightConfig) {
        this.pageObject = pageObject;
        this.playwrightConfig = playwrightConfig;
    }

    @Given("I open the Playwright footer page")
    public void iOpenThePlaywrightTestPage() {
        pageObject.getPage().navigate(playwrightConfig.getTestPageUrl());
    }

    @When("I check for the footer")
    public void iCheckForTheFooter() {
        boolean footerExists = pageObject
                .getPage().locator(Locators.FOOTER_SELECTOR)
                .count() > 0;

        assertTrue(footerExists, "Футер должен присутствовать на странице");

        boolean contactInfoLink = pageObject
                .getPage().locator(Locators.CONTACT_LINK_SELECTOR)
                .count() > 0;

        boolean privatePolicyLink = pageObject
                .getPage().locator(Locators.PRIVACY_POLICY_LINK_SELECTOR)
                .count() > 0;
        assertTrue(contactInfoLink, "Ссылка \"Контактная информация\" должна присутсвовать на странице");
        assertTrue(privatePolicyLink, "Ссылка \"Политика конфиденциальности\" должна присутствовать на странице");
    }

    @Then("I verify the footer is displayed")
    public void iVerifyTheFooterIsDisplayed() {
        boolean footerExists = pageObject
                .getPage().locator(Locators.FOOTER_SELECTOR)
                .isVisible();

        assertTrue(footerExists, "Футер должен быть виден на странице");
    }
}
