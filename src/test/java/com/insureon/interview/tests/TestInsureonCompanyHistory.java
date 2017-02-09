package com.insureon.interview.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.insureon.interview.pages.InsureonCompanyHistoryPage;
import com.insureon.interview.pages.InsureonHomePage;

public class TestInsureonCompanyHistory {

	WebDriver driver;
	InsureonHomePage insurenHomePageObj;
	InsureonCompanyHistoryPage insurenCompanyHitsoryObj;

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.insureon.com/");
		insurenHomePageObj = new InsureonHomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		insurenHomePageObj.clickCompanyHistoryLink();	
		insurenCompanyHitsoryObj = new InsureonCompanyHistoryPage(driver);
	}

	@Test
	public void test_Navigation_url() {

		Assert.assertTrue(insurenCompanyHitsoryObj.getPageUrl().contains("about-us/history"));
	}
	
	@Test
	public void test_navigation_title() {
		Assert.assertEquals(insurenCompanyHitsoryObj.getPageTitle(), "Our History | About Us | Insureon");
	}
	

	 @AfterTest
	 public void tearDown() throws Exception {
	 driver.quit();
	 }
}
