package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class CanonReviewObj extends Base {

	public CanonReviewObj() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body")
	private WebElement retailWeb;

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement clickOnDesktop;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement clickOnShowAllDesktops;

	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement clickOnCanonEOS5D;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement clickOnWriteReview;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement writeName;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement writeReview;
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]")
	private WebElement clickOnGoodButton;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOnContinue;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement thankYouforreview;

    public void Retails() {
    	WebDriverUtility.clickOnElement(retailWeb);

	}

	public void ClickOnDesktop() {
		WebDriverUtility.clickOnElement(clickOnDesktop);
	}

	public void ShowDesktop() {
		WebDriverUtility.clickOnElement(clickOnShowAllDesktops);
	}

	public void ClickOnCanon() {
		WebDriverUtility.clickOnElement(clickOnCanonEOS5D);

	}

	public void WriteReview() {
		WebDriverUtility.clickOnElement(clickOnWriteReview);
	}

	public void WriteName() {
		WebDriverUtility.enterValue(writeName, "SayedAhmad");
	}

	public void WriteAReview() {
		WebDriverUtility.enterValue(writeReview, "This is the Best Camera quality camera to Use");
	}

	public void ReveiwStatus() {
		WebDriverUtility.clickOnElement(clickOnGoodButton);
	}

	public void theContinueButton() {
		WebDriverUtility.clickOnElement(clickOnContinue);
	}

	public void ObsLastMassage() {
		WebDriverUtility.isElementDisplayed(thankYouforreview);
	}
}