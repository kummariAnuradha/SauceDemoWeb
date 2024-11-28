package com.qa.sauce.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.ClickProductNamePage;
import com.qa.saucedemo.utils.TestUtils;

public class ClickOnProductName extends BaseClass{
	
	WebDriver driver;
	ClickProductNamePage title;
	
	public ClickOnProductName() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   title=new ClickProductNamePage();
	   
	}
	@Test(priority=1)
	public void loginTest() {
		title.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void proName() {
		boolean flag=title.validateProductTitle();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void Nameclick() throws IOException{
		title.clickProductTitle();
		TestUtils.takeScreenshot("ClickOnProductName.png");
		
	}
}
