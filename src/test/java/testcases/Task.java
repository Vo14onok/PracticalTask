package testcases;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.*;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class Task {

    private HomePage homePage = new HomePage();

    @BeforeSuite
    public void setUp() {
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.timeout = 5000;
        Configuration.browserSize = "1920x1080";
    }

    @BeforeMethod
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

    @AfterMethod
    public void tearDown() {
        WebDriverRunner.getWebDriver().close();
    }

}
