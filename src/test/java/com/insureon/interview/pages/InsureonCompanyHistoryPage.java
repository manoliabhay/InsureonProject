package com.insureon.interview.pages;

import org.openqa.selenium.WebDriver;

public class InsureonCompanyHistoryPage {
	
	WebDriver driver;
	
	public InsureonCompanyHistoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
}
