package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilites.WebDriverUtility;

public class HpLapStepDefinition extends Base{

	@When("^User click  ADD TO CART option on ‘HP LP(\\d+)’ item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
	    logger.info("User should Add hp to card");
	    WebDriverUtility.screenShot();
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
	    logger.info("User should select one laptop");
	    WebDriverUtility.screenShot();
	    		
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
	  logger.info("Then User should click to add the lap to the cart");
	  WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1) throws Throwable {
	    logger.info("User should see the success Massage");
	    WebDriverUtility.screenShot();
	}
	
	
}
