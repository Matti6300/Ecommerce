package com.nopcommerce.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement LOginButton;



	public WebElement getRegisterButton() {
		return registerButton;
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerButton;

	public WebElement getLOginButton() {
		return LOginButton;
	}
	
	@FindBy(className = "email")
	private WebElement EnterEmailTextField;
	
	
	@FindBy(className = "password")
	private WebElement EnterPasswordTextField;
	
	@FindBy(id = "RememberMe")
	private WebElement Rememberheckox;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement LogInButton;

	public WebElement getEnterEmailTextField() {
		return EnterEmailTextField;
	}

	public WebElement getEnterPasswordTextField() {
		return EnterPasswordTextField;
	}

	public WebElement getRememberheckox() {
		return Rememberheckox;
	}

	public WebElement getLogInButton() {
		return LogInButton;
	}

}
