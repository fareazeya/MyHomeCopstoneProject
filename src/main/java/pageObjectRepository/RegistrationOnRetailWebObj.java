package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class RegistrationOnRetailWebObj extends Base {
	
	public RegistrationOnRetailWebObj () {
		PageFactory.initElements(driver, this);
	}
    
	@FindBy (xpath = "//body")
	  private WebElement RetailWeb;
	
	@FindBy (xpath = "//span[contains(text(),'My Account')]")
	  private WebElement clickMyAccount;
	
	@FindBy (xpath = "//a[contains(text(),'Login')]")
	  private WebElement clickOnLogin;
	
	@FindBy (xpath = "//input[@id='input-email']")
	 private WebElement EnterTheUserName;
	
	@FindBy (xpath = "//input[@id='input-password']")
	 private WebElement enterPassword;
	
	@FindBy (xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	 private WebElement clickOnLoginButton;
	
	@FindBy (xpath = "//body/div[@id='account-account']/ul[1]/li[2]/a[1]")
	 private WebElement dashboardView;
	
	public void RetailWebPage() {
		WebDriverUtility.clickOnElement(RetailWeb);
	}
	
	public void ClickOnMyAcount() {
		WebDriverUtility.clickOnElement(clickMyAccount);
	}
	
	public void ClickOnLogin () {
		WebDriverUtility.clickOnElement(clickOnLogin);
	}
	
	public void EnterUserName (String email) {
		WebDriverUtility.enterValue(EnterTheUserName, "Ghazal.surab@gmail.com");

	}

    public void EnterPassword(String password) {
    	WebDriverUtility.enterValue(enterPassword, "5050");
    				
    	
    }
    
    public void ClickOnLoginButton() {
    	WebDriverUtility.clickOnElement(clickOnLoginButton);
    }
    
    public void DashboardView () {
    	WebDriverUtility.isElementDisplayed(dashboardView);
    }
}