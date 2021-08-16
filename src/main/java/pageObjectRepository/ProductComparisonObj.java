package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class ProductComparisonObj extends Base{
	 public ProductComparisonObj() {
			PageFactory.initElements(driver, this);
		}

	 @FindBy (xpath = "//body")
			 private WebElement RetailWebPage;
	 
	 @FindBy (xpath ="//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	         private WebElement clickOnLapAndNoteBooks;
	 
	 @FindBy (xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	         private WebElement clickOnShopAll;
	 
	 @FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
	         private WebElement clickOndProCompMac;
	 
	 @FindBy (xpath = "/html/body/div[2]/div/div/div[4]/div[3]/div/div[2]/div[2]/button[3]/i")
	         private WebElement clickOnProCompMacAir;
	 
	 @FindBy (xpath = "//body/div[@id='product-category']/div[1]" )
	         private WebElement successIsdisplayed;
	 
	 @FindBy (xpath = "//a[contains(text(),'product comparison')]")
	         private WebElement clickOnProCompLink;
	 
	 @FindBy (xpath = "//div[@id='content']" )
	         private WebElement ProCompIsdisplayed;
	 
	 public void OpenRetailWebPage () {
		 WebDriverUtility.clickOnElement(RetailWebPage);
		 
	 }
	 
	public void ClickOnLaptopAndNoteBook() {
		WebDriverUtility.clickOnElement(clickOnLapAndNoteBooks);
	}
	 
	public void ClickOnShopAll() {
		WebDriverUtility.clickOnElement(clickOnShopAll);
	}

	public void ClickOnProCompMac() {
		WebDriverUtility.clickOnElement(clickOndProCompMac);
	}
	
	public void ClickOnMacAir() {
		WebDriverUtility.clickOnElement(clickOnProCompMacAir);
	}
	
	public void SuccessMassage() {
		WebDriverUtility.isElementDisplayed(successIsdisplayed);
	}
	 
	public void ProComDlink() {
		WebDriverUtility.clickOnElement(clickOnProCompLink);
	}
	 
	public void ProComDisplayed () {
		WebDriverUtility.isElementEnabled(ProCompIsdisplayed);
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
