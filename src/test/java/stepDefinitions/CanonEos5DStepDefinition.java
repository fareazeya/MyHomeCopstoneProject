package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilites.WebDriverUtility;

public class CanonEos5DStepDefinition  extends Base{

	@When("^User click  ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
	   logger .info("User should add Conon to the cart");
	   WebDriverUtility.screenShot();
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
	   logger.info("User should select the red color");
	   WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
	    logger.info("User should be able to see the succsses Massage");
	    WebDriverUtility.screenShot();
	}

	
	
	
	
}
