package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class AddToCartPage extends BaseClass{
	public AddToCartPage() {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(id="user-name") WebElement username;
	 @FindBy(id="password") WebElement password;
	 @FindBy(id="login-button") WebElement loginBtn;
	 @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button") WebElement img;
	 @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button") WebElement remove;
	
	public void login(String un, String pass) {
    	username.sendKeys(un);
    	password.sendKeys(pass);
    	loginBtn.click();
    }
	
	public boolean validateAddToCart() {
		return img.isDisplayed();
			
	}
	public void clickAddToCart() {
		img.click();
	}
	public void remove() {
		remove.isDisplayed();
		
	}

}
