package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.RegistrationOnRetailWebObj;
import utilites.WebDriverUtility;

public class LoginAcountStepDefinition extends Base {
	
	RegistrationOnRetailWebObj LoginToAcount = new RegistrationOnRetailWebObj();
	
	
	
	@Given("^User click  on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		LoginToAcount.ClickOnMyAcount();
		logger.info("User click  on MyAccount"); 
	  WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	

	@When("^User enter username ‘userName’$")
	public void user_enter_username_userName() throws Throwable {
		LoginToAcount.EnterUserName("Ghazal.surab@gmail.com");
		logger.info("User enter username ‘userName’");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	    
	}

	@When("^User enter password 'password’$")
	public void user_enter_password_password() throws Throwable {
		LoginToAcount.EnterPassword("5050");
		logger.info("User should enter his password");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}
	
	@Then("^User should be logged in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_MyAccount_dashboard() throws Throwable {
		LoginToAcount.DashboardView();
		logger.info("User should be logged in to MyAccount dashboard");
	WebDriverUtility.wait(3000);
	WebDriverUtility.screenShot();
	}
}