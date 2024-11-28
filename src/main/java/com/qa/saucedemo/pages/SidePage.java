package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class SidePage extends BaseClass {
	public SidePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name") WebElement username;
    @FindBy(id="password") WebElement password;
    @FindBy(id="login-button") WebElement loginBtn;
    @FindBy(xpath="/html/body/div/div[1]/div/div[3]/div/button") WebElement side;
    
    public void login(String un, String pass) {
    	username.sendKeys(un);
    	password.sendKeys(pass);
    	loginBtn.click();
    }
	
	public boolean validateSideBar() {
		return side.isEnabled();
	}
	public void clickSideBar() {
		side.click();
	}

}
