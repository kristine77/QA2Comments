package page.object.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import page.object.BaseFunc;

public class CommentsPage {
    private final By TITLE = By.xpath(".//h1[@class = 'article-title']/a");
    private final By COMMENTS_PAGE_COMMENTS_COUNT = By.xpath(".//span[(@class = 'type-cnt')]");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public CommentsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getTitle() {
        LOGGER.info("Getting title on comments page");

        return baseFunc.getText(TITLE);
    }

    public int getComments(int id) {
        LOGGER.info("Getting comments count on comments page");
        return Integer.parseInt(baseFunc.findElement(COMMENTS_PAGE_COMMENTS_COUNT).getText().trim());
    }
}
