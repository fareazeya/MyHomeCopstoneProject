package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilites.WebDriverUtility;

public class DesktopStepDefinitions extends Base {
	
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() throws Throwable {
	  openBrowser();
		logger.info("User should open the retail webpage");
	  WebDriverUtility.screenShot();
	}

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
	    logger.info("User should click on Desktops tab");
	    WebDriverUtility.screenShot();
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
	  logger.info("User should click on Show all desktops");
	  WebDriverUtility.screenShot();		
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
	  logger.info("User should see all items are present");
	  WebDriverUtility.screenShot();
	}
	
	

}
