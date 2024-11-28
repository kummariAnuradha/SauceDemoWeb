package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
    @FindBy(id="user-name") WebElement username;
    @FindBy(id="password") WebElement password;
    @FindBy(id="login-button") WebElement loginBtn;
    @FindBy(className="bot_column") WebElement logo;
    
    public String validateLoginPageTitle() {
    	return driver.getTitle();
    }
    public boolean validateImage() {
    	return logo.isDisplayed();
    }
    public void login(String un, String pass) {
    	username.sendKeys(un);
    	password.sendKeys(pass);
    	loginBtn.click();
    }
}

