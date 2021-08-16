package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class PriceValidateMacProObj extends Base {
	
	public PriceValidateMacProObj () {
		PageFactory.initElements(driver, this);
	}
   
	
	@FindBy (xpath = "//body")
	  private WebElement RetailWeb;
	
	@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	  private WebElement LaptopNotebook;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	  private WebElement ShawAllNoteBooks;
	
	@FindBy (xpath = " //span[@id='cart-total']")
	  private WebElement clickOnMacPro;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/ul[1]")
	  private WebElement priceTaqisdisplayed;
	
	public void RetailWebPage() {
		WebDriverUtility.clickOnElement(RetailWeb);
	}
	
	public void Laptopbook() {
		WebDriverUtility.clickOnElement(LaptopNotebook);
	}
	
	public void ShowallMacPro() {
		WebDriverUtility.clickOnElement(ShawAllNoteBooks);
	}
	
	public void MacPro() {
		WebDriverUtility.clickOnElement(clickOnMacPro);
	}
	
	public void PriceTaq() {
		WebDriverUtility.isElementDisplayed(priceTaqisdisplayed);
	}
	
}
