package com.insureon.interview.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.insureon.interview.PageFactory.PF_InsureonCompanyHistoryPage;
import com.insureon.interview.PageFactory.PF_InsureonHomePage;
import com.insureon.interview.pages.InsureonCompanyHistoryPage;
import com.insureon.interview.pages.InsureonHomePage;


public class PF_TestInsureonCompanyHistory {
	
	WebDriver driver;
	PF_InsureonHomePage insurenHomePageObj;
	PF_InsureonCompanyHistoryPage insurenCompanyHitsoryObj;
	
	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.insureon.com/");
		insurenHomePageObj = new PF_InsureonHomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		insurenHomePageObj.clickCompanyHistoryLink();
		insurenCompanyHitsoryObj = new PF_InsureonCompanyHistoryPage(driver);
	}
	

	@Test
	public void test_Navigation() {
		// Create Home Page object
		Assert.assertTrue(insurenCompanyHitsoryObj.getPageUrl().contains("about-us/history"));
		driver.navigate().back();
		Assert.assertTrue(insurenHomePageObj.getPageUrl().equals("http://www.insureon.com/"));
        
	}

	@AfterTest
	public void browser_close() {
		driver.quit();
	}

}
