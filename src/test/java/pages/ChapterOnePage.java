package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ChapterOnePage {

    private Logger logger = Logger.getLogger(this.getClass());

    public ChapterOnePage checkTargetText(String text) {
        logger.info("Check text: " + text);
        $("body").shouldHave(text(text));
        logger.info("Text on page.");
        return this;
    }

    public HomePage returnToHomePage() {
        logger.info("Click on 'Home page' button.");
        $(".mainbody a").click();
        return new HomePage();
    }

    // --- "описать первую (home) и вторую (chapter1) страницы как Page Object" ? ---

    public ChapterOnePage setCheckboxRadioButton() {
        logger.info("Seе checkbox on radio button.");
        $("#radiobutton").click();
        return this;
    }

    public SeleniumTypeDropdown selectSeleniumType() {
        logger.info("Open dropdown to select Selenium type.");
        $("#selecttype").click();
        return new SeleniumTypeDropdown();
    }

    public ChapterOnePage clickOnSeleniumTypeCheckbox() {
        logger.info("Set Selenium type checkbox.");
        $("[name='selected(1234)']").click();
        return this;
    }

    public ChapterOnePage clickOnVerifyButton() {
        logger.info("Click on verify button.");
        $("#verifybutton").click();
        return this;
    }

    public PopUpWindow clickOnFirstMultipleWindow() {
        logger.info("CLick on first multiple window button.");
        $(".multiplewindow").click();
        switchTo().window(1);
        logger.info("Switch to popup window.");
        return new PopUpWindow();
    }

    public PopUpWindow clickOnSecondMultipleWindow() {
        logger.info("CLick on second multiple window button.");
        $(".multiplewindow2").click();
        switchTo().window(1);
        logger.info("Switch to popup window.");
        return new PopUpWindow();
    }

    public ChapterOnePage clickToLoadPageWithAJAX() {
        logger.info("Click on load page with AJAX button.");
        $("#loadajax").click();
        return this;
    }

    public ChapterOnePage inputText(String text) {
        logger.info("Input '" + text + "' to input field");
        $("#storeinput").setValue(text);
        return this;
    }

    public ChapterOnePage checkAJAXText() {
        logger.info("Check AJAX text.");
        SelenideElement ajaxTextElement = $("#ajaxdiv p");
        ajaxTextElement.shouldBe(exist);
        logger.info("AJAX loaded text: " + ajaxTextElement.getText());
        return this;
    }

}
