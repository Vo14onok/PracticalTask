package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.$$;

public class SeleniumTypeDropdown {

    private Logger logger = Logger.getLogger(this.getClass());

    private final ElementsCollection options = $$("option");

    public ChapterOnePage selectSeleniumIDE() {
        logger.info("Select Selenium IDE");
        options.find(Condition.value("Selenium IDE")).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage selectSeleniumCode() {
        logger.info("Select Selenium Code");
        options.find(Condition.value("Selenium Code")).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage selectSeleniumRC() {
        logger.info("Select Selenium RC");
        options.find(Condition.value("Selenium RC")).click();
        return new ChapterOnePage();
    }

    public ChapterOnePage selectSeleniumGRID() {
        logger.info("Select Selenium Grid");
        options.find(Condition.value("Selenium Grid")).click();
        return new ChapterOnePage();
    }

}
