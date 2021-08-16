package pageObjectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class CartCheckingObj  extends Base{
	public CartCheckingObj() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy (xpath = "//span[@id='cart-total']")
	private WebElement clickOnShopingCart;
	
	@FindBy (xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement MassegeIsDisplyed;

	public void ClickOnCart() {
		WebDriverUtility.clickOnElement(clickOnShopingCart);
	}
	 
	public void MassageDisplyed() {
		WebDriverUtility.isElementDisplayed(MassegeIsDisplyed);
	}
    



}
