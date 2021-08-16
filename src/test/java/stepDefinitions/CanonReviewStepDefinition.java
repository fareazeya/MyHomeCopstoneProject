package stepDefinitions;


import java.util.List;
import java.util.Map;

import core.Base;
 import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.CanonReviewObj;
import utilites.WebDriverUtility;


public class CanonReviewStepDefinition extends Base {
	
	CanonReviewObj CanonReview = new CanonReviewObj();
	
	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
		CanonReview.ClickOnCanon();
		logger.info("clickOnCanonEOS5D");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		CanonReview.WriteReview();
	   logger.info("User should click on review button");
	   WebDriverUtility.wait(4000);
	   WebDriverUtility.screenShot();
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable ReviewInformation) throws Throwable {
		List<Map<String, String>>  dataValues = ReviewInformation.asMaps(String.class, String.class);
		CanonReview.WriteName();
		CanonReview.WriteAReview();
		CanonReview.ReveiwStatus();
	    logger.info("sayed ahmad");
	    logger.info("This is the Best Camera quality camera to Use");
	   WebDriverUtility.wait(3000);
	   WebDriverUtility.screenShot();
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		CanonReview.theContinueButton();
	    logger.info("User Should clike on continue");
	    WebDriverUtility.wait(4000);
	    WebDriverUtility.screenShot();
	   
	}

	@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval\\.”$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() throws Throwable {
		CanonReview.ObsLastMassage();
	    logger.info("User Should see the final Massage is displayed");
	    WebDriverUtility.wait(3000);
	    WebDriverUtility.screenShot();
	    
	}


}
