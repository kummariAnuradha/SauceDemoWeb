package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.ClickOnImagePage;
import com.qa.saucedemo.utils.TestUtils;

public class ClickOnProductImage extends BaseClass {
	WebDriver driver;
	ClickOnImagePage image;
	
	public ClickOnProductImage() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	    image=new ClickOnImagePage();
	   
	}
	@Test(priority=1)
	public void loginTest() {
		image.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void ImageDisplay() {
		boolean flag=image.validateProductImage();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void Imageclick() throws IOException{
		image.clickProductImage();
		TestUtils.takeScreenshot("ClickOnProductImage.png");
	}
  
}
