package ru.stqa.selenium.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Inka on 23-Dec-18.
 */
public class LoginPageHelper extends PageBase {
    @FindBy (id = "idsignin")
    WebElement loginIcon;

    @FindBy (id = "logininput")
    WebElement loginField;

    @FindBy (id = "passwordinput")
    WebElement passwordField;

    @FindBy (id = "signinrequest")
    WebElement signInButton;

    @FindBy (id = "closedsignin")
    WebElement cancelButton;



    public LoginPageHelper(WebDriver driver){
        super(driver);
    }

    @Override
    public void waitUntilPageIsLoaded() {
        waitUntilElementIsClickable(driver, signInButton,15);
    }

    public void openLoginPage(){
        loginIcon.click();
        waitUntilPageIsLoaded();
    }

    public void loginToSystem(String login, String password){
        setValueToField(loginField, login);
        setValueToField(passwordField,password);
        signInButton.click();
    }

}
