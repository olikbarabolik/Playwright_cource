package autotest.config;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PlaywrightConfig {

    @Bean
    public Playwright playwright() {
        return Playwright.create();
    }

    @Bean
    @Scope("singleton")
    public Browser browser(Playwright playwright) {
        return playwright.chromium().launch();
    }

    @Bean
    @Scope("prototype")
    public Page page(Browser browser) {
        return browser.newPage();
    }

    public String getTestPageUrl() {
        return "https://algosstile.github.io/vue-app/index.html";
    }
}
