package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class RemoveFromCartPage extends BaseClass {
	public RemoveFromCartPage() {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(id="user-name") WebElement username;
	 @FindBy(id="password") WebElement password;
	 @FindBy(id="login-button") WebElement loginBtn;
	 @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button") WebElement img;
	 @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") WebElement cart;
	 @FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button") WebElement remove;
	
	 public void login(String un, String pass) {
	    	username.sendKeys(un);
	    	password.sendKeys(pass);
	    	loginBtn.click();
	    }
	 public void clickAddToCart() {
			img.click();
		}
	 public void clickCartImage() {
			cart.click();
	 }
	 
	public void clickRemove() {
		remove.click();
	}

}
