package com.insureon.interview.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_InsureonHomePage {

	
	WebDriver driver;
	@FindBy(xpath="//*[@id='dnn_ctr1280_HtmlModule_lblContent']/footer/div[1]/div[3]/ul/li[2]/a")
	WebElement companyHistoryLink;

	public PF_InsureonHomePage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}

	// Click on login button
	public void clickCompanyHistoryLink() {
		companyHistoryLink.click();
	}
	

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

}
