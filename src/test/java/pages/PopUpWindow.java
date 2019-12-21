package pages;

import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class PopUpWindow {

    private Logger logger = Logger.getLogger(this.getClass());

    public ChapterOnePage closeWindow() {
        logger.info("Close popup window.");
        $("#closepopup").click();
        switchTo().window(0);
        logger.info("Switch to main window.");
        return new ChapterOnePage();
    }

}
