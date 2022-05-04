package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class ArticlePageObject extends MainPageObject{

    private static final String
            TITLE = "id:org.wikipedia:id/view_page_title_text",
            FOOTER_ELEMENT = "xpath://*[@text='View page in browser']",
            OPTIONS_BUTTON = "xpath://android.widget.ImageView[@content-desc='More options']",
            OPTIONS_ADD_TO_MY_LIST_BUTTON = "xpath://android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[@text='Add to reading list']",
            CREATED_FOLDER_ELEMENT_TPL = "xpath://*[@text='{FOLDER_NAME}']",
            ADD_TO_MY_LIST_OVERLAY = "id:org.wikipedia:id/onboarding_button",
            MY_LIST_NAME_INPUT = "id:org.wikipedia:id/text_input",
            MY_LIST_OK_BUTTON = "xpath://*[@text='OK']",
            ARTICLE_CLOSE_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";

    public ArticlePageObject (AppiumDriver driver)
    {
        super (driver);
    }

    /*TEMPLATES METHODS*/
    private static String getCreatedFolderByName(String name_of_folder)
    {
        return CREATED_FOLDER_ELEMENT_TPL.replace("{FOLDER_NAME}", name_of_folder);
    }
    /*TEMPLATES METHODS*/

    public WebElement waitForTitleElement()
    {
        return this.waitForElementAndClick((TITLE), "Cannot find article title on page!", 15);
    }

    public String getArticleTitle()
    {
        WebElement title_element = waitForTitleElement();
        return title_element.getAttribute("text");
    }

    public void swipeToFooter()
    {
        this.swipUpToFindElement(
                FOOTER_ELEMENT,
                "Cannot find the end of article",
                20
        );
    }

    public void clickCreatedFolderByName(String name_of_folder) {
        String created_folder_xpath = getCreatedFolderByName(name_of_folder);
        this.waitForElementAndClick((created_folder_xpath), "Cannot find and click created folder by name " + name_of_folder, 10);
    }

    public void assertTitlePresent()
    {
        this.assertElementPresent((TITLE), "Cannot find article title on page!");
    }

    public void addArticleToMyList(String name_of_folder)
    {
        this.waitForElementAndClick(
                OPTIONS_BUTTON,
                "Cannot find button to open article options",
                5
        );

        this.waitForElementAndClick(
                OPTIONS_ADD_TO_MY_LIST_BUTTON,
                "Cannot find option to add article to reading list",
                5
        );

        this.waitForElementAndClick(
                ADD_TO_MY_LIST_OVERLAY,
                "Cannot find 'Got it' tip overlay",
                5
        );

        this.waitForElementAndClear(
                MY_LIST_NAME_INPUT,
                "Cannot find input to set name of articles folder",
                5
        );

        this.waitForElementAndSendKeys(
                MY_LIST_NAME_INPUT,
                name_of_folder,
                "Cannot put text into articles folder input",
                5
        );

        this.waitForElementAndClick(
                MY_LIST_OK_BUTTON,
                "Cannot press OK button",
                5
        );
    }

    public void addArticleToCreatedFolderByName(String name_of_folder)
    {
        this.waitForElementAndClick(
                OPTIONS_BUTTON,
                "Cannot find button to open article options",
                5
        );

        this.waitForElementAndClick(
                OPTIONS_ADD_TO_MY_LIST_BUTTON,
                "Cannot find option to add article to reading list",
                5
        );

        this.clickCreatedFolderByName(name_of_folder);
    }

    public void closeArticle()
    {
        this.waitForElementAndClick(
                ARTICLE_CLOSE_BUTTON,
                "Cannot close article, cannot find X link",
                5
        );
    }


}
