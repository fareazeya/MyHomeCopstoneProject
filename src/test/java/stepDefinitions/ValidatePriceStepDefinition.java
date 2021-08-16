package stepDefinitions;
import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.PriceValidateMacProObj;
import utilites.WebDriverUtility;

public class ValidatePriceStepDefinition extends Base {

	PriceValidateMacProObj PriceValidate = new PriceValidateMacProObj();
	
	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
		PriceValidate.MacPro();
		logger.info("User Should click on MacBook pro items");
		WebDriverUtility.wait(3000);
	    WebDriverUtility.screenShot();
	}

	
	@Then("^User should see  ‘\\$(\\d+),(\\d+)\\.(\\d+)’ price tag is present on UI$")
	public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) throws Throwable {
		PriceValidate.PriceTaq();
		logger.info("User Should see the price taq is displayed");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}
	
}