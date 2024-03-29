package ru.stqa.selenium;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.selenium.pages.HomePageAuthHelper;
import ru.stqa.selenium.pages.HomePageHelper;
import ru.stqa.selenium.pages.LoginPageHelper;
import ru.stqa.selenium.util.DataProviders;

public class LoginPageTests extends TestBase{


    HomePageHelper homePage;
    LoginPageHelper loginPage;
    HomePageAuthHelper homePageAuth;

    @BeforeMethod(alwaysRun = true)
    public void initPage(){
        homePage = PageFactory
                .initElements(driver, HomePageHelper.class);
        loginPage = PageFactory
                .initElements(driver, LoginPageHelper.class);
        homePageAuth = PageFactory
                .initElements(driver, HomePageAuthHelper.class);
        homePage.waitUntilPageIsLoaded();
        loginPage.openLoginPage();
    }
    @Test(dataProviderClass = DataProviders.class, dataProvider = "randomUsers")
    public void loginPositive(String login, String password){
        loginPage.loginToSystem(login,password);
        homePageAuth.waitUntilPageIsLoaded();
        Assert.assertTrue(homePageAuth.isHomaPageAuth());


    }



}
