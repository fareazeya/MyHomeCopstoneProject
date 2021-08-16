package pageObjectRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class EditAffiliateObj extends Base {

	public EditAffiliateObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffiliate;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]")
	private WebElement bankTranasfer;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement branchNum;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement acctName;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement acctNumber;

	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement Continue;

	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement msDisplayed;

	public void EditInfo() {
		WebDriverUtility.clickOnElement(editAffiliate);
	}
	public void BankTrans () {
			WebDriverUtility.clickOnElement(bankTranasfer);
		}
	public void BankName(String BnkName) {
				WebDriverUtility.enterValue(bankName, "BNK");
	}
	public void BranchN (String BrNum) {
					WebDriverUtility.enterValue(branchNum, "420");
	}
	public void SwiftCode (String Swift) {
						WebDriverUtility.enterValue(swiftCode, "650");
	}
	public void AccountNam (String AcName) {
			WebDriverUtility.enterValue(acctName, "Checking Account");
	}					 
	public void AccountNum (String AcNum) {
		WebDriverUtility.enterValue(acctNumber, "1234567890");
	}
    public void Continues () {
    	WebDriverUtility.clickOnElement(Continue);
    }
    public void MassageDis () {
    	WebDriverUtility.isElementDisplayed(msDisplayed);
    }
}
