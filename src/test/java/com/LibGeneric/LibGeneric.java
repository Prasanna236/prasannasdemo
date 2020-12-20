package com.LibGeneric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGeneric {

// Base Class or Lib Generic	
	
	static public WebDriver driver;
	
	//to launch the browser
	public WebDriver browserLaunch() {
		// to configure the drivers
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_Workspace\\Selenium06.00Pm\\drivers\\chromedriver.exe");

		// to launch the browser
		 driver = new ChromeDriver();
		 return driver;
	}
	
	//to launch the url
	public void urlLaunch(String url) {
		driver.get(url);
	}
	
	//to enter the text in text box
	public void type(WebElement e, String val) {
		e.sendKeys(val);
	}
	
	//to click the button
	public void btnClick(WebElement e) {
		e.click();
	}

}
