package lib.ui;

import io.appium.java_client.AppiumDriver;

public class WelcomePageObject extends MainPageObject{

    private static final String
        STEP_LEARN_MORE_LINK = "id:Learn more about Wikipedia",
        STEP_NEW_WAY_TO_EXPLORE_LINK = "id:New ways to explore",
        STEP_ADD_OR_EDIT_PREFERRED_LANG = "id:Add or edit preferred languages",
        STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_TEXT = "id:Learn more about data collected",
        NEXT_LINK = "id:Next",
        GET_STARTED_BUTTON = "id:Get started",
        SKIP = "id:Skip";


    public WelcomePageObject (AppiumDriver driver)
    {
        super(driver);
    }

    public void waitForLearnMoreLink()
    {
        this.waitForElementPresent((STEP_LEARN_MORE_LINK), "Cannot find 'Learn more about Wikipedia' link", 10);
    }

    public void waitNewWayToExploreText()
    {
        this.waitForElementPresent((STEP_NEW_WAY_TO_EXPLORE_LINK), "Cannot find 'New way to explore' text", 10);
    }

    public void waitForAddOrEditPreferredLangText()
    {
        this.waitForElementPresent((STEP_ADD_OR_EDIT_PREFERRED_LANG), "Cannot find 'Add or edit preferred languages' text", 10);
    }

    public void waitForLearnMoreAboutDataCollectedText()
    {
        this.waitForElementPresent((STEP_LEARN_MORE_ABOUT_DATA_COLLECTED_TEXT), "Cannot find 'Learn more about data collected' text", 10);
    }

    public void clickNextButton()
    {
        this.waitForElementAndClick((NEXT_LINK), "Cannot find and click 'Next' link", 10);
    }

    public void clickGetStartedButton()
    {
        this.waitForElementAndClick((GET_STARTED_BUTTON), "Cannot find and click 'Get Started' link", 10);
    }

    public void clickSkip()
    {
        this.waitForElementAndClick((SKIP), "Cannot find and click 'Skip' button", 5);
    }

}
