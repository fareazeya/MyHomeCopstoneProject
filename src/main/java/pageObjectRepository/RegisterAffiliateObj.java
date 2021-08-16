package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class RegisterAffiliateObj extends Base {

	public RegisterAffiliateObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //body")
	private WebElement retailWeb;

	@FindBy(xpath = " //span[contains(text(),'My Account')]")
	private WebElement myAccount;

	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private WebElement firstlogin;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement enterEmail;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement enterPassword;

	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement clickOnLogin;

	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement RegisterAffiliate;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement webSite;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxId;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[1]/label[1]")
	private WebElement cheque;
	
	@FindBy (xpath = "//input[@id='input-cheque']")
	private WebElement ChequeName;

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement checkBox;

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement continueButton;

	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement msgDisplayed;

	public void Body() {
		WebDriverUtility.clickOnElement(retailWeb);
	}

	public void MyAccount() {
		WebDriverUtility.clickOnElement(myAccount);

	}

	public void login() {
		WebDriverUtility.clickOnElement(firstlogin);
	}

	public void Email(String EmailAdd) {
		WebDriverUtility.enterValue(enterEmail, "Ghazal.surab@gmail.com");
	}

	public void PassWord(String passWord) {
		WebDriverUtility.enterValue(enterPassword, "5050");
	}

	public void Clicklogin() {
		WebDriverUtility.clickOnElement(clickOnLogin);

	}

	public void Affiliate() {
		WebDriverUtility.clickOnElement(RegisterAffiliate);

	}

	public void Company(String cName) {
		WebDriverUtility.enterValue(company, "BBN");
	}

	public void WebSite(String wName) {
		WebDriverUtility.enterValue(webSite, "WWW.BBN.COM");
	}

	public void TaxId(String TaxId) {
		WebDriverUtility.enterValue(taxId, "1920");
	}

	public void Cheque() {
		WebDriverUtility.clickOnElement(cheque);
	}
	public void ChequeName(String EnterValue) {
		WebDriverUtility.enterValue(ChequeName, "Sayed SADAD");
	}
	public void Checkbox() {
		WebDriverUtility.clickOnElement(checkBox);
	}

	public void continues() {
		WebDriverUtility.clickOnElement(continueButton);

	}

	public void MassageDisplyed() {
		WebDriverUtility.isElementDisplayed(msgDisplayed);

	}

}