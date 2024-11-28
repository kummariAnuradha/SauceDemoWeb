package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath="//td[contains,'products']")
	WebElement products;
	@FindBy(className="bm-burger-button")
	WebElement menuBtn;
	@FindBy(id="shopping_cart_container")
	WebElement add_cart_icon;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public boolean addCartBtnIsDisplayed() {
		return add_cart_icon.isDisplayed();
	}
	public boolean openMenuIsdisplayed() {
		return menuBtn.isDisplayed();
		
	}

}
