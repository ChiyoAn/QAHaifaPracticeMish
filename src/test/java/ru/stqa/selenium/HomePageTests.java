package ru.stqa.selenium;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import ru.stqa.selenium.pages.HomePageHelper;
import org.testng.annotations.Test;
import org.testng.Assert;

public class HomePageTests extends TestBase{
    HomePageHelper homePage;

    @BeforeMethod(alwaysRun = true)
    public void initPage(){
        homePage = PageFactory
                .initElements(driver, HomePageHelper.class);
    }
    @Test
    public void testIfHomePageisLoaded(){

        Assert.assertEquals("List events", homePage.getListEventsItemText());
    }

    @Test
    public void testTitle(){
        Assert.assertEquals("Mishpahug - Shabbat within the family circle.", homePage.getHomePageTitle());
    }

}
