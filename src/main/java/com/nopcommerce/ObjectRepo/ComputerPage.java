package com.nopcommerce.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	
	
	public ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' Desktops ']")
	private WebElement DesKtopModule;

	@FindBy(xpath = "//a[text()=' Notebooks ']")
	private WebElement NoteBookModule;

	@FindBy(xpath = "//a[text()=' Software ']")
	private WebElement SoftwareModule;

	@FindBy(xpath = "//li[@class='active last']//a[text()='Desktops ']")
	private WebElement DesktopSideModule;

	@FindBy(xpath = "//li[@class='active last']//a[text()='Notebooks ']")
	private WebElement NoteBookSideModule;

	@FindBy(xpath = "//li[@class='active last']//a[text()='Software ']")
	private WebElement SoftwareSideModule;

	@FindBy(xpath = "//a[text()='Apple']")
	private WebElement AppleInManufacturerList;

	@FindBy(xpath = "//a[text()='HP']")
	private WebElement HpInManufacturerelist;
	
	@FindBy(xpath ="//div[@class='block block-manufacturer-navigation']//a[text()='View all']" )
	private WebElement VIewAllButttonInManufacturers;
	
	
	@FindBy(xpath = "//a[text()='apparel']")
	private WebElement ApparelInPopularTags;
	
	@FindBy(xpath = "//a[text()='shoes']")
	private WebElement ShoeInPopularTags;
	
	@FindBy(xpath = "//a[text()='awesome']")
	private WebElement AwesomInPopularTags;
	
	@FindBy(xpath = "//a[text()='book']")
	private WebElement BooklInPopularTags;
	
	@FindBy(xpath = "//a[text()='camera']")
	private WebElement cameraInPopularTags;
	
	@FindBy(xpath = "//a[text()='cell']")
	private WebElement CellInPopularTags;
	
	@FindBy(xpath = "//a[text()='compact']")
	private WebElement CompactInPopularTags;
	
	@FindBy(xpath = "//a[text()='computer']")
	private WebElement ComputerInPopularTags;
	
	@FindBy(xpath = "//a[text()='cool']")
	private WebElement coolInPopularTags;
	
	@FindBy(xpath = "//a[text()='digitals']")
	private WebElement DigitalsInPopularTags;
	
	@FindBy(xpath = "//a[text()='game']")
	private WebElement gameInPopularTags;
	
	
	@FindBy(xpath = "//a[text()='jeans']")
	private WebElement jeansInPopularTags;
	
	@FindBy(xpath = "//a[text()='jewelry']")
	private WebElement JewelryInPopularTags;
	
	
	@FindBy(xpath = "//a[text()='nice']")
	private WebElement NiceInPopularTags;
	
	
	@FindBy(xpath = "//a[text()='shirt']")
	private WebElement ShirtInPopularTags;
	
	@FindBy(xpath = "//div[@class='f']//a[text()='View all']")
	private WebElement ViewAllInPopularTags;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement SerachTextFieldInComputerPage;
	
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement srechButtonInomputerPage;
	
	
	@FindBy(xpath = "//img[@src='https://demo.nopcommerce.com/images/thumbs/0000002_desktops_450.jpg']")
	private WebElement DesktopImageIncomputerPager;
	
	@FindBy(xpath = "//img[@src='https://demo.nopcommerce.com/images/thumbs/0000003_notebooks_450.jpg']")
	private WebElement NoteBookImageIncomputerPager;
	
	@FindBy(xpath = "//img[@src='https://demo.nopcommerce.com/images/thumbs/0000004_software_450.jpg']")
	private WebElement SoftwareImageIncomputerPager;

	public WebElement getDesKtopModule() {
		return DesKtopModule;
	}

	public WebElement getNoteBookModule() {
		return NoteBookModule;
	}

	public WebElement getSoftwareModule() {
		return SoftwareModule;
	}

	public WebElement getDesktopSideModule() {
		return DesktopSideModule;
	}

	public WebElement getNoteBookSideModule() {
		return NoteBookSideModule;
	}

	public WebElement getSoftwareSideModule() {
		return SoftwareSideModule;
	}

	public WebElement getAppleInManufacturerList() {
		return AppleInManufacturerList;
	}

	public WebElement getHpInManufacturerelist() {
		return HpInManufacturerelist;
	}

	public WebElement getVIewAllButttonInManufacturers() {
		return VIewAllButttonInManufacturers;
	}

	public WebElement getApparelInPopularTags() {
		return ApparelInPopularTags;
	}

	public WebElement getShoeInPopularTags() {
		return ShoeInPopularTags;
	}

	public WebElement getAwesomInPopularTags() {
		return AwesomInPopularTags;
	}

	public WebElement getBooklInPopularTags() {
		return BooklInPopularTags;
	}

	public WebElement getCameraInPopularTags() {
		return cameraInPopularTags;
	}

	public WebElement getCellInPopularTags() {
		return CellInPopularTags;
	}

	public WebElement getCompactInPopularTags() {
		return CompactInPopularTags;
	}

	public WebElement getComputerInPopularTags() {
		return ComputerInPopularTags;
	}

	public WebElement getCoolInPopularTags() {
		return coolInPopularTags;
	}

	public WebElement getDigitalsInPopularTags() {
		return DigitalsInPopularTags;
	}

	public WebElement getGameInPopularTags() {
		return gameInPopularTags;
	}

	public WebElement getJeansInPopularTags() {
		return jeansInPopularTags;
	}

	public WebElement getJewelryInPopularTags() {
		return JewelryInPopularTags;
	}

	public WebElement getNiceInPopularTags() {
		return NiceInPopularTags;
	}

	public WebElement getShirtInPopularTags() {
		return ShirtInPopularTags;
	}

	public WebElement getViewAllInPopularTags() {
		return ViewAllInPopularTags;
	}

	public WebElement getSerachTextFieldInComputerPage() {
		return SerachTextFieldInComputerPage;
	}

	public WebElement getSrechButtonInomputerPage() {
		return srechButtonInomputerPage;
	}

	public WebElement getDesktopImageIncomputerPager() {
		return DesktopImageIncomputerPager;
	}

	public WebElement getNoteBookImageIncomputerPager() {
		return NoteBookImageIncomputerPager;
	}

	public WebElement getSoftwareImageIncomputerPager() {
		return SoftwareImageIncomputerPager;
	}

}
