package com.nopecommerce.BaseClass;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.nopcommerce.ObjectRepo.HomePage;
import com.nopcommerce.ObjectRepo.LoginPage;
import com.nopcommerce.WebDriverUtility.WebDriverUtility;
import com.nopecommerce.DataBaseUtility.DataBaseUtility;
import com.nopecommerce.FileUtility.PropertyFileUtility;

public class BaseClassTest {
	public WebDriver driver = null;
	public static WebDriver sdriver = null;

	public DataBaseUtility dutil = new DataBaseUtility();
	public WebDriverUtility wutil = new WebDriverUtility();
	public PropertyFileUtility putil = new PropertyFileUtility();

	public LoginPage lp;
	public HomePage hp;

	@BeforeSuite
	public void ConnetingTodataBase() throws SQLException {
		dutil.cinnectingToTheDatabase("jdbc:mysql://localhost:3306/sakila", "root", "Bharath@123");
	ResultSet set=  dutil.excutingTheSelectQurey("select * from actor");
	
	while(set.next()) {
	
	System.out.println(set.getString(1));
	}
		System.out.println("cpnnceted to the databse successfully");
	}

	@BeforeClass
	public void openingbrowser() throws IOException {
		driver = wutil.openingTheBrowser(putil.getTheDataFromPropertyFile("url"),
				putil.getTheDataFromPropertyFile("browser"));
		sdriver = driver;

		wutil.openUntilPageFound(driver);
		wutil.maximizeTheWindow(driver);
		hp = new HomePage(driver);
	}

	@BeforeMethod
	public void loggingIntoApplication() throws IOException {
		lp = new LoginPage(driver);
		lp.getLOginButton().click();

		lp.getEnterEmailTextField().sendKeys(putil.getTheDataFromPropertyFile("email"));
		lp.getEnterPasswordTextField().sendKeys(putil.getTheDataFromPropertyFile("password"));
		lp.getLogInButton().click();
	}

	@AfterMethod
	public void LoggingOutFromApp() {

		hp.getLogout().click();

	}

	@AfterClass
	public void closingThebrowser() {
		driver.quit();
	}

	@AfterSuite
	public void closingTheDataBaseConnections() throws SQLException {
		dutil.closingTheDataBaseConnection();
		System.out.println("conection closed successfully");
	}

}
