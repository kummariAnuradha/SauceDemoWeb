package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class ClickOnImagePage extends BaseClass{
	public ClickOnImagePage() {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(id="user-name") WebElement username;
	 @FindBy(id="password") WebElement password;
	 @FindBy(id="login-button") WebElement loginBtn;
	 @FindBy(className="inventory_item_img") WebElement img;
	 
	 public void login(String un, String pass) {
	    	username.sendKeys(un);
	    	password.sendKeys(pass);
	    	loginBtn.click();
	    }
		
	
	public boolean validateProductImage() {
		return img.isDisplayed();
	}
	public void clickProductImage() {
		img.click();
	}

}
