package com.nopcommerce.WebDriverUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	WebDriver driver;

	public WebDriver openingTheBrowser(String url, String browser) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {

			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals(null)) {
			driver = new ChromeDriver();

		}
		driver.get(url);
		return driver;

	}

	public void maximizeTheWindow(WebDriver driver) {

		driver.manage().window().maximize();

	}

	public void openUntilPageFound(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void waitForElement(WebDriver driver, WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public void moveToElement(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();

	}

	public void rightClick(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();

	}

	public void dragAndDropAction(WebDriver driver, WebElement ele1, WebElement ele2) {

		Actions act = new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();

	}

	public void selectingDropDownbyIndex(WebDriver driver, WebElement ele, int index) {

		Select s = new Select(ele);
		s.selectByIndex(index);

	}

	public void selectingDropDownbyVisibleText(WebDriver driver, WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public void selectingDropDownbyValue(WebDriver driver, WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);

	}

	public void swtichtoWindowByUrl(WebDriver driver, String url) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			String actlurl = driver.getCurrentUrl();
			if (actlurl.contentEquals(url)) {
				break;

			}
		}
	}

	public void swtichtoWindowByTitle(WebDriver driver, String title) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			String actlurl = driver.getTitle();
			if (actlurl.contentEquals(title)) {
				break;

			}
		}
	}

	public void acceptingAler() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	public void declineAler() {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	public String getAlertText() {
		Alert alt = driver.switchTo().alert();
		return alt.getText();
	}

	public void switchToFrameByIndex(WebDriver driver, int index) {

		driver.switchTo().frame(index);

	}

	public void switchToFrameByname(WebDriver driver, String name) {

		driver.switchTo().frame(name);

	}

	public void switchToFrameByElement(WebDriver driver, WebElement ele) {

		driver.switchTo().frame(ele);

	}

}
