package com.insureon.interview.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.insureon.interview.pages.InsureonHomePage;

public class TestInsureonHomePage {
	
	WebDriver driver;
	InsureonHomePage insurenHomePageObj;
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.insureon.com/");
	}
	
	@Test
	public void test_Home_Page_Appear_Correct(){
	//Create Home Page object
	insurenHomePageObj = new InsureonHomePage(driver);
	//Verify Home page title
	Assert.assertTrue(insurenHomePageObj.getPageUrl().contains("www.insureon.com"));	}

	@AfterTest
	public void browser_close() {
		driver.quit();
	}
	
}
