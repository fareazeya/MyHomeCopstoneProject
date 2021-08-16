package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.CartCheckingObj;
import utilites.WebDriverUtility;

public class CartCheckStepDefinition extends Base {
	CartCheckingObj CheckCart = new CartCheckingObj();
	
	@When("^User click on shopping cart$")
	public void user_click_on_shopping_cart() throws Throwable {
		CheckCart.ClickOnCart(); 
		logger.info("User click on shopping cart");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@Then("^“Your shopping cart is empty!” message should display$")
	public void your_shopping_cart_is_empty_message_should_display() throws Throwable {
		CheckCart.MassageDisplyed();
		logger.info("Your shopping cart is empty!” message should display");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}
	
	
}
