package com.nopcommerce.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement genderMaleRadioButton;
	
	
	@FindBy(id = "gender-female")
	private WebElement genderFemaleradioButton;
	
	@FindBy(id = "FirstName")
	private WebElement FristNameTextField;
	
	@FindBy(id = "LastName")
	private WebElement LastNameTextField;

	@FindBy(xpath = "//select[@name='DateOfBirthDay']")
	private WebElement DOBofdayDD;
	
	@FindBy(xpath = "//select[@name='DateOfBirthMonth']")
	private WebElement DOBofMonthDD;
	
	@FindBy(xpath = "//select[@name='DateOfBirthYear']")
	private WebElement DOBofYearDD;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement EnterEmailtextField;
	
	@FindBy(id = "Company")
	private WebElement EnterCompanyDetails;
	
	@FindBy(id="Newsletter")
	private WebElement NewsettlerCheckBox;
	
	@FindBy(id = "Password")
	private WebElement enterpassword;
	
	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	private WebElement COnfirmPassworgText;
	
	@FindBy(id = "register-button")
	private WebElement RegisterButton;

	public WebElement getGenderMaleRadioButton() {
		return genderMaleRadioButton;
	}

	public WebElement getGenderFemaleradioButton() {
		return genderFemaleradioButton;
	}

	public WebElement getFristNameTextField() {
		return FristNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getDOBofdayDD() {
		return DOBofdayDD;
	}

	public WebElement getDOBofMonthDD() {
		return DOBofMonthDD;
	}

	public WebElement getDOBofYearDD() {
		return DOBofYearDD;
	}

	public WebElement getEnterEmailtextField() {
		return EnterEmailtextField;
	}

	public WebElement getEnterCompanyDetails() {
		return EnterCompanyDetails;
	}

	public WebElement getNewsettlerCheckBox() {
		return NewsettlerCheckBox;
	}

	public WebElement getEnterpassword() {
		return enterpassword;
	}

	public WebElement getCOnfirmPassworgText() {
		return COnfirmPassworgText;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
	
	
	
	
	
	
	
}
