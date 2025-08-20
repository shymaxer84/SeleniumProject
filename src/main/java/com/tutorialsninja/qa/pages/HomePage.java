package com.tutorialsninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    //Objects
    @FindBy(xpath="//span[normalize-space()='My Account']")
    private WebElement myAccountDropMenu;

    @FindBy(linkText = "Login")
    private WebElement myLoginDropMenu;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }

    //Actions
    public void clickOnMyAccount(){

        myAccountDropMenu.click();
    }

    public void selectLoginOption(){

        myLoginDropMenu.click();
    }



}
