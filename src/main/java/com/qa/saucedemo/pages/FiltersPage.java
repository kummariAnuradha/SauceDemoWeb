package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class FiltersPage extends BaseClass{
	public FiltersPage() {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(id="user-name") WebElement username;
	 @FindBy(id="password") WebElement password;
	 @FindBy(id="login-button") WebElement loginBtn;
	 @FindBy(xpath="//*[@id=\"inventory_filter_container\"]/select") WebElement filter;
	 
	 public void login(String un, String pass) {
	    	username.sendKeys(un);
	    	password.sendKeys(pass);
	    	loginBtn.click();
	    }
	
	public boolean validateDropdown() {
		return filter.isDisplayed();
	}
	public void clickDropdown() throws InterruptedException {
		filter.click();
	}
}
