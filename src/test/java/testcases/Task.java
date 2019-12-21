package testcases;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Task {

    private HomePage homePage = new HomePage();

    @BeforeSuite
    public void setUp() {
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
    }

    @BeforeTest
    public void precondition() {
        open("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void checkText() {
        homePage
                .clickOnChapterOne()
                .checkTargetText("Assert that this text is on the page")
                .returnToHomePage();
    }

    @AfterSuite
    public void tearDown() {
        WebDriverRunner.getWebDriver().close();
    }

}
