package com.insureon.interview.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsureonHomePage {

	WebDriver driver;
	By companyHistoryLink = By.xpath("//*[@id='dnn_ctr1280_HtmlModule_lblContent']/footer/div[1]/div[3]/ul/li[2]/a");
	

	public InsureonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Click on login button
	public void clickCompanyHistoryLink() {
		driver.findElement(companyHistoryLink).click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

}
