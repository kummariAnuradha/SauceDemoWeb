package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.saucedemo.base.BaseClass;

public class CrossMarkPage extends BaseClass{
	public CrossMarkPage() {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(id="user-name") WebElement username;
	 @FindBy(id="password") WebElement password;
	 @FindBy(id="login-button") WebElement loginBtn;
	 @FindBy(xpath="/html/body/div/div[1]/div/div[3]/div/button") WebElement side;
	 @FindBy(xpath="//*[@id=\"menu_button_container\"]/div/div[2]/div[2]/div/button") WebElement cross;
	
	public boolean validateSideBar() {
		return cross.isEnabled();
	}
	public void clickSide() {
		side.click();
	}

	public void clickCrossBar() {
		cross.click();
	}

}


