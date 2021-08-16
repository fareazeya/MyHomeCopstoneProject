package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.AddAnItemToTheWishlistObj;
import utilites.WebDriverUtility;

public class AddAnItemToWishlistStepDefinition extends Base {
	
	AddAnItemToTheWishlistObj SonyVaioLaptop = new AddAnItemToTheWishlistObj();
	
	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
		
		SonyVaioLaptop.AddWishlist();
		logger.info("User should click on Sony VAIO wishlist ");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	  
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() throws Throwable {
		SonyVaioLaptop.RegisterRequirement();
		logger.info("User Should See The Ragister Requirment Massage");
	    WebDriverUtility.wait(3000);
	    WebDriverUtility.screenShot();
	}

	
	
}