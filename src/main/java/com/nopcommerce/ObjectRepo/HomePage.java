package com.nopcommerce.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//a[text()='Log out']")
private WebElement logout;

@FindBy(xpath = "//a[text()='Computers ']")
private WebElement ComputerModule;

@FindBy(xpath = "Electronics ")
private WebElement ElectronicModule;


  @FindBy(xpath = "//a[text()='Apparel ']")
  private WebElement ApparelModule;
  

  @FindBy(xpath = "//a[text()='Digital downloads  ']")
  private WebElement DigitalModule;

  @FindBy(xpath = "//a[text()='Jewelry ']")
  private WebElement JewelryModule;

  @FindBy(xpath = "//a[text()='Books ']")
  private WebElement BooksModule;

  @FindBy(xpath = "//a[text()='Gift Cards ']")
  private WebElement GiftCardsModule;
  
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Desktops ']")
  private WebElement DesktopInComputers;
  
  
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Notebooks ']")
  private WebElement NoteBookInComputers;
   
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Software ']")
  private WebElement SoftwareInCompiuters;
  
  
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Camera & photo ']")
  private WebElement CameraAndPhotoInElectronics;
  
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Cell phones ']")
  private WebElement CellPhonesInElectronics;
  
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Others ']")
  private WebElement OthersInElectronics;
  
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Shoes ']")
  private WebElement ShoesInApparels;
  
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Clothing ']")
  private WebElement ClothingInApparels;
  
  @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Accessories ']")
  private WebElement accessoriesInApparels;
  
public WebElement getLogout() {
		return logout;
	}

public WebElement getComputerModule() {
	return ComputerModule;
}

public WebElement getElectronicModule() {
	return ElectronicModule;
}

public WebElement getApparelModule() {
	return ApparelModule;
}

public WebElement getDigitalModule() {
	return DigitalModule;
}

public WebElement getJewelryModule() {
	return JewelryModule;
}

public WebElement getBooksModule() {
	return BooksModule;
}

public WebElement getGiftCardsModule() {
	return GiftCardsModule;
}

public WebElement getDesktopInComputers() {
	return DesktopInComputers;
}

public WebElement getNoteBookInComputers() {
	return NoteBookInComputers;
}

public WebElement getSoftwareInCompiuters() {
	return SoftwareInCompiuters;
}

public WebElement getCameraAndPhotoInElectronics() {
	return CameraAndPhotoInElectronics;
}

public WebElement getCellPhonesInElectronics() {
	return CellPhonesInElectronics;
}

public WebElement getOthersInElectronics() {
	return OthersInElectronics;
}

public WebElement getShoesInApparels() {
	return ShoesInApparels;
}

public WebElement getClothingInApparels() {
	return ClothingInApparels;
}

public WebElement getAccessoriesInApparels() {
	return accessoriesInApparels;
}


}
