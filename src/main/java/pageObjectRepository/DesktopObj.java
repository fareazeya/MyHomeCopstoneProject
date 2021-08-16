package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class DesktopObj extends Base { 
	
	public DesktopObj() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body")
	private WebElement retailWebPage;
	
	@FindBy(xpath ="//a[@class = 'dropdown-toggle']")
	private WebElement clickOnDesktopTab;
	
	@FindBy(xpath = "//a[@class='see-all']")
	private WebElement clickOnShowAllDesktop;
	
	@FindBy(xpath = "//*[@id=\"content\"]")
	private WebElement SeeAllItemsInDesktopPage;

	
	public void showretailpage() {
		WebDriverUtility.clickOnElement(retailWebPage);
	}
	
	public void Desktoptab() {
		WebDriverUtility.clickOnElement(clickOnDesktopTab);
	}
	
	public void showAllDesktops() {
		WebDriverUtility.clickOnElement(clickOnShowAllDesktop);
	}
	
	public void desktopTabDisplay() {
		WebDriverUtility.isElementDisplayed(SeeAllItemsInDesktopPage);
	
	
		
		
		
		
		
		
		
	}
}
