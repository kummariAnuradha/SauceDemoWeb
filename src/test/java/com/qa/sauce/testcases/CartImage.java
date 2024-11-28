package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.CartImagePage;
import com.qa.saucedemo.utils.TestUtils;

public class CartImage extends BaseClass {
	WebDriver driver;
	CartImagePage image;
	
	public CartImage() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   image=new CartImagePage();
	   
	}
	@Test(priority=1)
	public void loginTest() {
		image.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void CartClick() throws IOException{
		image.clickCartImage();
		TestUtils.takeScreenshot("CartImage.png");
	}
  
}
