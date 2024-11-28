package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.CrossMarkPage;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.pages.SidePage;
import com.qa.saucedemo.utils.TestUtils;

public class CrossMark extends BaseClass {
	WebDriver driver;
	LoginPage page;
	SidePage menu;
	CrossMarkPage cross;
	
	public CrossMark() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   page=new LoginPage();
	   menu=new SidePage();
	   cross=new CrossMarkPage();
	   
	}
	@Test(priority=1)
	public void loginTest() {
		page.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void SideBarclick(){
		menu.clickSideBar();
	}
	@Test(priority=3)
	public void crossEnabled() {
		boolean flag=cross.validateSideBar();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=4)
	public void Crossclick() throws IOException{
		cross.clickCrossBar();
		TestUtils.takeScreenshot("CrossMark.png");
	}
	
}

