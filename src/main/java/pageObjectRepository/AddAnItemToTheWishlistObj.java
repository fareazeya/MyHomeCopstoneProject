package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class AddAnItemToTheWishlistObj extends Base {
	
	public AddAnItemToTheWishlistObj () {
		PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath = "//body")
		private WebElement RetailWeb;
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	    private WebElement NoteBoDesktop;
	
	@FindBy (xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	    private WebElement ShowAll;
	 
	@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
	    private WebElement WishList;
	
	@FindBy ( xpath = "//body/div[@id='product-category']/div[1]")
	    private WebElement RegisterMassage;
	
	
	public void RetailWeb () {
		WebDriverUtility.clickOnElement(RetailWeb);
	}
	
	public void NoteBookDesktop () {
		WebDriverUtility.clickOnElement(NoteBoDesktop);
	}
	
	public void ShowAllLaptop() {
		WebDriverUtility.clickOnElement(ShowAll);
	}
	
	public void AddWishlist() {
		WebDriverUtility.clickOnElement(WishList);
	}
	
	public void RegisterRequirement() {
		WebDriverUtility.isElementDisplayed(RegisterMassage);
	}
	
	
	
	
}