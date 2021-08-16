package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class CurrencyChangeObj extends Base {
	public CurrencyChangeObj () {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//span[contains(text(),'Currency')]")
	private WebElement clikeOnCurrency;
	
	@FindBy (xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement clickOnEuro;
	
	@FindBy (xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement showValue;
	
	public void ClickOnCurChange() {
		WebDriverUtility.clickOnElement(clikeOnCurrency);
	}
	
	public void SelectEuro() {
		WebDriverUtility.clickOnElement(clickOnEuro);
	}
	public void DollarChangeToEuro() {
		WebDriverUtility.clickOnElement(showValue);
	}
	
	
}
