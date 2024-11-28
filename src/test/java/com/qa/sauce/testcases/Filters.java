package com.qa.sauce.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.FiltersPage;
import com.qa.saucedemo.utils.TestUtils;

import junit.framework.Assert;

public class Filters extends BaseClass{
	WebDriver driver;
	FiltersPage fil;
	
	public Filters() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   fil=new FiltersPage();
	}
	@Test(priority=1)
	public void loginTest() {
		fil.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void dropDownDisplay() {
		boolean flag=fil.validateDropdown();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void dropdownclick() throws InterruptedException, IOException {
		fil.clickDropdown();
		TestUtils.takeScreenshot("Filters.png");
	}
}


	
	
