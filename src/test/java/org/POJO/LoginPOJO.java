package org.POJO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LibGeneric.LibGeneric;

public class LoginPOJO extends LibGeneric {

	// Default Constructor
	public LoginPOJO() {
		PageFactory.initElements(driver, this);
	}

	// Private WebElements
	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(name = "passwd")
	private WebElement txtPassword;

	@FindBy(id = "SubmitLogin")
	private WebElement btnLogin;

	// Getters
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
