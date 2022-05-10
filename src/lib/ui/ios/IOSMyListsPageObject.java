package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.MyListsPageObject;

public class IOSMyListsPageObject extends MyListsPageObject
{
        static {
        ARTICLE_BY_TITLE_TPL = "xpath://XCUIElementTypeStaticText[contains(@name,'{TITLE}')]";
        SYNC_SAVED_ARTICLES_POP_UP_CLOSE = "id:Close";
    }

    public IOSMyListsPageObject(AppiumDriver driver)
        {
            super(driver);
        }
}
