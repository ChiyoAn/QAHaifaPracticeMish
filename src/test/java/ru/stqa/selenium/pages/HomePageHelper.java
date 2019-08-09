package ru.stqa.selenium.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Inka on 23-Dec-18.
 */
public class HomePageHelper extends PageBase {
    @FindBy (id = "idtitletypesearchevents")
    WebElement listEventsItem;

    public HomePageHelper(WebDriver driver){
        super(driver);
    }

    @Override
    public void waitUntilPageIsLoaded() {
        waitUntilElementIsLoaded(
                driver,listEventsItem,30);
    }

    public String getListEventsItemText() {
        return listEventsItem.getText();
    }

    public String getHomePageTitle() {

        return driver.getTitle();
    }



}
