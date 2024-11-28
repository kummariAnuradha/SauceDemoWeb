package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.RemoveFromCartPage;
import com.qa.saucedemo.utils.TestUtils;

public class RemoveFromCart extends BaseClass {
	WebDriver driver;
	RemoveFromCartPage remove;
	
	public RemoveFromCart() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   remove=new RemoveFromCartPage();
	   
	}
	@Test(priority=1)
	public void loginTest() {
		remove.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void Cartclick(){
	     remove.clickAddToCart();
	}
  
	@Test(priority=3)
	public void CartImageClick(){
		remove.clickCartImage();
	}
	@Test(priority=4)
	public void removeClick() throws IOException {
		remove.clickRemove();
		TestUtils.takeScreenshot("RemoveFromCart.png");
		
	}
  
}
