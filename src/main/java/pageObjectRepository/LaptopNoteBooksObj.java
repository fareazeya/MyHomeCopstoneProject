package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;


public class LaptopNoteBooksObj extends Base {
	public LaptopNoteBooksObj () {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = " //body")
	private WebElement retailWeb;
	
	@FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement clicklaptobsNoteBooks;
	
	@FindBy (xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement clickshowAlllaptops;
	
	@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement clickMacBookItem;
	
	@FindBy (xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement clickAddtocard;
	
	@FindBy (xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMassage;
	
	@FindBy (xpath = "//span[@id='cart-total']")
	private WebElement OneItem;
	
	@FindBy (xpath ="//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement clickOnThecartOption;
	
	@FindBy (xpath = "//tbody/tr[1]/td[5]/button[1]")
	private WebElement clickOnRedButton;
	
	@FindBy (xpath = "//span[@id='cart-total']")
	private WebElement zeroItem;
	
	public void RatailWeb() {
		WebDriverUtility.clickOnElement(retailWeb);
	}
    public void LapTopNoteBook () {
    	WebDriverUtility.clickOnElement(clicklaptobsNoteBooks);
    }
	public void ShowAllDesktop () {
		WebDriverUtility.clickOnElement(clickshowAlllaptops);
	}
	
	public void MacBook() {
		WebDriverUtility.clickOnElement(clickMacBookItem);
	}
	public void AddToCard() {
		WebDriverUtility.clickOnElement(clickAddtocard);
	}
	public void SuccessMassage() {
		WebDriverUtility.isElementDisplayed(successMassage);
	}
	
	public void OneItem () {
		WebDriverUtility.isElementDisplayed(OneItem);}
	
	public void CardOption() {
		WebDriverUtility.clickOnElement(clickOnThecartOption);
	}
    public void RedButton() {
    	WebDriverUtility.clickOnElement(clickOnRedButton);
    }
    public void ZeroItem() {
    	WebDriverUtility.isElementDisplayed(zeroItem);
    }











}