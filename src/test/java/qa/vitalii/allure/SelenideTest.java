package qa.vitalii.allure;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

    @Test
    public void testGithub() {
        open("https://github.com");

        $("[data-test-selector=nav-search-input]").click();
        $("[data-test-selector=nav-search-input]").sendKeys("eroshenkoam/allure-example");
        $("[data-test-selector=nav-search-input]").submit();

        $(linkText("eroshenkoam/allure-example")).click();
        $(partialLinkText("Issues")).click();
        $(withText("#68")).should(Condition.visible);
    }
}
