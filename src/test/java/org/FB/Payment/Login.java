package org.FB.Payment;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.POJO.LoginPOJO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.LibGeneric.LibGeneric;

public class Login {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		LibGeneric l = new LibGeneric();
		
		WebDriver driver = l.browserLaunch();
		l.urlLaunch("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		LoginPOJO loginPojo = new LoginPOJO();
		
		//WebElement txtEmailAddress = driver.findElement(By.id("email"));
		l.type(loginPojo.getTxtEmail(), "mohan@gmail.com");

		//WebElement txtPassword = driver.findElement(By.name("passwd"));
		l.type(loginPojo.getTxtPassword(), "12345");

		//WebElement btnLogin = driver.findElement(By.id("SubmitLogin"));
		l.btnClick(loginPojo.getBtnLogin());

	}

}
