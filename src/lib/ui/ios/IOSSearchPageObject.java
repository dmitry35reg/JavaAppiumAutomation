package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;

public class IOSSearchPageObject extends SearchPageObject {
        static {
        SEARCH_INIT_ELEMENT = "xpath://XCUIElementTypeSearchField[@name='Search Wikipedia']";
        SEARCH_INPUT = "xpath://XCUIElementTypeSearchField[@name='Search Wikipedia']";
        SEARCH_CANCEL_BUTTON = "id:Cancel";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://XCUIElementTypeStaticText[contains(@name,'{SUBSTRING}')]";
        //SEARCH_RESULT_BY_TITLE_AND_DESCRIPTION_TPL = "//android.widget.TextView[@resource-id='org.wikipedia:id/page_list_item_title'][@text='{TITLE}']/following-sibling::android.widget.TextView[@resource-id='org.wikipedia:id/page_list_item_description'][@text='{DESCRIPTION}']";
        SEARCH_EMPTY_RESULT_ELEMENT = "xpath://XCUIElementTypeStaticText[@name='No results found']";
        SEARCH_RESULT_ELEMENT = "xpath://XCUIElementTypeCollectionView/XCUIElementTypeCell";
    }

    public IOSSearchPageObject(AppiumDriver driver)
        {
            super(driver);
        }
}
