package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    private Logger logger = Logger.getLogger(this.getClass());

    private final ElementsCollection chapters = $$("li a");

    public ChapterOnePage clickOnChapterOne() {
        logger.info("Click on Chapter1.");
        chapters.get(0).click();
        return new ChapterOnePage();
    }

    // --- "описать первую (home) и вторую (chapter1) страницы как Page Object" ? ---

    public ChapterOnePage clickOnChapterTwo() {
        logger.info("Click on Chapter2.");
        chapters.get(1).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage clickOnChapterThree() {
        logger.info("Click on Chapter3.");
        chapters.get(2).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage clickOnChapterFour() {
        logger.info("Click on Chapter4.");
        chapters.get(3).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage clickOnChapterEight() {
        logger.info("Click on Chapter8.");
        chapters.get(4).click();
        return new ChapterOnePage();
    }

    public HomePage textInput(String text) {
        logger.info("Type text to input field. Text: " + text);
        $("#q").setValue(text);
        return this;
    }

}
