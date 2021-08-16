package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CanonEos5DObj extends Base {
	public CanonEos5DObj() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//body")
    private WebElement retailWebPage;
	
    @FindBy (xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
    private WebElement clickOnDestop;
    
    @FindBy (xpath = "//a[contains(text(),'Show All Desktops')]")
    private WebElement clickOnShowAll;
   
	@FindBy(xpath = "//body/div[@id='common-home']/div[1]/div[1]/div[2]/div[4]/")
	private WebElement clickAddToCart;
	
	@FindBy(xpath = "//select[@name ='option[226]']")
	private WebElement clickOnSelectRed;
	
	@FindBy(xpath = "//input[@id = 'input-quantity']")
	private WebElement clickOnSelectQuantity;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement UserShouldSeeMassage;
	
	
	public void showretailpage() {
		retailWebPage.click();
	}
	
	public void ClickOnDestop() {
   	clickOnDestop.click();
   }
   
	public void ClicOnShowAll() {
		clickOnShowAll.click();
	}
	public void ClickAddToCart() {
		clickAddToCart.click();
	}
   
	public void SelectRedColor() {
		clickOnSelectRed.click();
	}

   public void SelectQty() {
   	clickOnSelectQuantity.click();
   }

   public void SucessMassage() {
   	UserShouldSeeMassage.isDisplayed();
   }
}
