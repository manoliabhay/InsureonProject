package com.insureon.interview.PageFactory;

import org.openqa.selenium.WebDriver;

public class PF_InsureonCompanyHistoryPage {

	WebDriver driver;

	public PF_InsureonCompanyHistoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
}
