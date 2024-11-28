package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class CartImagePage extends BaseClass{
	public CartImagePage() {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(id="user-name") WebElement username;
	 @FindBy(id="password") WebElement password;
	 @FindBy(id="login-button") WebElement loginBtn;
	 @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") WebElement cart;
	 
	 public void login(String un, String pass) {
	    	username.sendKeys(un);
	    	password.sendKeys(pass);
	    	loginBtn.click();
	    }
		
	public void clickCartImage() {
		cart.click();
	}


}
