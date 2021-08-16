package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HpLapPageObj extends Base{
	
	public HpLapPageObj() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy (xpath ="//a[@class='see-all']")
	private WebElement clickOnDesktop;

	@FindBy (xpath ="//a[@class=see-all']")
	private WebElement clickOnShowAllDesktop;
	
	@FindBy (xpath = "//i[@class'fa fa-shopping-cart']")
	private WebElement clickAddToCart;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQty;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickOnAddToCartButton;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement SuccessMassageIsDisplayed;
	
	public void ClickOnDesktop() {
		clickOnDesktop.click();
	}
	public void ClickOnShowAll() {
		clickOnShowAllDesktop.click();	
	}
	public void ClickAddToCart() {
		clickAddToCart.click();
	}
	public void SelectQty() {
		selectQty.isSelected();
	}
	public void ClickOnAddToCartButton() {
		clickOnAddToCartButton.click();
	}
	public void SuccessMassageIsDisplayed() {
		SuccessMassageIsDisplayed.isSelected();
	}
}
