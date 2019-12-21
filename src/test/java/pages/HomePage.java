package pages;

import com.codeborne.selenide.Condition;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private Logger logger = Logger.getLogger(this.getClass());

    public ChapterOnePage clickOnChapterOne() {
        logger.info("Click on Chapter1.");
        $("li a").shouldHave(Condition.text("Chapter1")).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage clickOnChapterTwo() {
        logger.info("Click on Chapter2.");
        $("li a").shouldHave(Condition.text("Chapter2")).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage clickOnChapterThree() {
        logger.info("Click on Chapter3.");
        $("li a").shouldHave(Condition.text("Chapter3")).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage clickOnChapterFour() {
        logger.info("Click on Chapter4.");
        $("li a").shouldHave(Condition.text("Chapter4")).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage clickOnChapterEight() {
        logger.info("Click on Chapter8.");
        $("li a").shouldHave(Condition.text("Chapter8")).click();
        return new ChapterOnePage();
    }

    public HomePage textInput(String text) {
        logger.info("Type text to input field. Text: " + text);
        $("#q").setValue(text);
        return this;
    }

}
