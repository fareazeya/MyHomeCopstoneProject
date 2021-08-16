package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.ProductComparisonObj;
import utilites.WebDriverUtility;

public class ProductComStepDefination extends Base {
	
		ProductComparisonObj Comparison = new ProductComparisonObj();
	
		@When("^User click on product comparison icon on ‘MacBook’$")
		public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
			Comparison.ClickOnProCompMac();
			logger.info("User Should Clicked On MacBook Comparison");
			WebDriverUtility.wait(3000);
			WebDriverUtility.screenShot();
		}

		@When("^User click on product comparison icon on ‘MacBook Air$")
		public void user_click_on_product_comparison_icon_on_MacBook_Air() throws Throwable {
			Comparison.ClickOnMacAir();
			logger.info("User should Clicked On MacbookAir");
			WebDriverUtility.wait(3000);
			WebDriverUtility.screenShot();
		}

		@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
		public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws Throwable {
			Comparison.SuccessMassage();
			logger.info("User Should see the Massage of MacBook Air added Successfully");
			WebDriverUtility.wait(3000);
			WebDriverUtility.screenShot();
		}

		@Then("^User click on Product comparison link$")
		public void user_click_on_Product_comparison_link() throws Throwable {
			Comparison.ProComDlink();
			logger.info("User should click on Comparison Link");
			WebDriverUtility.wait(3000);
			WebDriverUtility.screenShot();
		}

		@Then("^User should see Product Comparison Chart$")
		public void user_should_see_Product_Comparison_Chart() throws Throwable {
			Comparison.ProComDisplayed();
			logger.info("User should see the Product Comparison charts Displayed");
			WebDriverUtility.wait(3000);
			WebDriverUtility.screenShot();
		}
}
