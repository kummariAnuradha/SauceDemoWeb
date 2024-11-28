package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.SidePage;
import com.qa.saucedemo.utils.TestUtils;

public class SidemenuBar extends BaseClass{
	WebDriver driver;
	SidePage menu;
	
	public SidemenuBar() throws IOException {
		super();
	}
	
	@BeforeClass
	public void setup(){
	    initialization();
	   menu=new SidePage();
	}
	@Test(priority=1)
	public void loginTest() {
		menu.login(props.getProperty("username"),props.getProperty("password"));
		
	}
	@Test(priority=2)
	public void SideEnabled() {
		boolean flag=menu.validateSideBar();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void SideBarclick() throws IOException{
		menu.clickSideBar();
		TestUtils.takeScreenshot("sidemenubar.png");
	}
}



	
	
