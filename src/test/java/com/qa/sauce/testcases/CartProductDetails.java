package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.CartProductDetailsPage;
import com.qa.saucedemo.utils.TestUtils;


public class CartProductDetails extends BaseClass {
	WebDriver driver;
	CartProductDetailsPage detail;
	
	public CartProductDetails() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   detail=new CartProductDetailsPage();
	   }
	@Test(priority=1)
	public void loginTest() {
		detail.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void Cartclick(){
		detail.clickAddToCart();
	}
  
	@Test(priority=3)
	public void CartImageClick(){
		detail.clickCartImage();
	}
	@Test(priority=4)
	public void detailDisplay() throws IOException {
		detail.clickCartProductName();
		TestUtils.takeScreenshot("CartProductDetails.png");
		
	}
	
}
