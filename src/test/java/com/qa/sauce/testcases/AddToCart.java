package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.AddToCartPage;
import com.qa.saucedemo.utils.TestUtils;

public class AddToCart extends BaseClass {
	WebDriver driver;
	AddToCartPage add;
	
	public AddToCart() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   add=new AddToCartPage();
	   
	}
	@Test(priority=1)
	public void loginTest() {
		add.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void CartDisplay() {
		boolean flag=add.validateAddToCart();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void Cartclick(){
		add.clickAddToCart();
		
	}
	@Test(priority=4)
	public void removeDisplay() throws IOException {
		add.remove();
		TestUtils.takeScreenshot("AddToCart.png");
		
	}
  
	

}

