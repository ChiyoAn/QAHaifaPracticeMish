package ru.stqa.selenium.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Inka on 23-Dec-18.
 */
public class HomePageAuthHelper extends PageBase {
    @FindBy (id = "idtitletypesearchevents")
    WebElement listEventsItem;

    @FindBy (id = "profile")
    WebElement profileIcon;

    @FindBy (id = "ihome")
    WebElement homeIcon;


    public HomePageAuthHelper(WebDriver driver){
        super(driver);
    }

    @Override
    public void waitUntilPageIsLoaded() {
        waitUntilElementIsLoaded(
                driver,listEventsItem,30);
        waitUntilElementIsClickable(driver, profileIcon, 20);
        waitUntilElementIsClickable(driver, homeIcon, 20);
    }


    public boolean isHomaPageAuth() {
        return (listEventsItem.isDisplayed()
                &&profileIcon.isDisplayed());
    }
}
