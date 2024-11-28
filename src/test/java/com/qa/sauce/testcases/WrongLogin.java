package com.qa.sauce.testcases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.utils.TestUtils;

public class WrongLogin extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	
	public WrongLogin() throws IOException {
		super();
	}
	@BeforeClass
	public void setup(){
	    initialization();
	   lp=new LoginPage();
	}
	@Test(priority=1)
	public void validateTitleTest() {
		String title = lp.validateLoginPageTitle();
        Assert.assertEquals(title,"Swag Labs");
	}

	@Test(priority=2)
	public void validateImageTest() {
		boolean flag= lp.validateImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void WrongUserId() throws InterruptedException, IOException {
		lp.login(props.getProperty("wronguserid"), props.getProperty("password"));
		TestUtils.takeScreenshot("WrongLogin.png");
	}
    
}




