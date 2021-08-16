package stepDefinitions;
import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.EditUserAccountObj;
import utilites.WebDriverUtility;

public class EditAccountStepDefinition extends Base {
	
	EditUserAccountObj AccountEdit = new EditUserAccountObj ();
	
	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		AccountEdit.UserAccountEdit();
		logger.info("User should click on edit account");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}
	
	@When("^User modify below information$")
	public void user_modify_below_information(DataTable ModifyInfo) throws Throwable {
		List<Map<String, String>>  dataValues = ModifyInfo.asMaps(String.class, String.class);
		AccountEdit.AddFName("khan");
		AccountEdit.AddLName("Atif");
		AccountEdit.AddEmailAddress("Email");
		AccountEdit.AddPhoneNUm("phoneNume");
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	  

//	@When("^User modify below information |firstname|lastName|email|telephone|$")
//	public void user_modify_below_information_firstname_lastName_email_telephone() throws Throwable {
//		AccountEdit.AddFName("Abdul");
//		AccountEdit.AddLName("Wahab");
//		AccountEdit.AddEmailAddress("sameer_zeya@yahoo.com");
//		AccountEdit.AddPhoneNUm("5712525555");
//		logger.info("User should type all the information to edit the account");
//		WebDriverUtility.wait(2000);
//		WebDriverUtility.screenShot();
	}
//	@When("^User click on continue button$")
//	public void user_click_on_continue_button() throws Throwable {
//		AccountEdit.ClickOnContinue();
//		logger.info("User should click on on continue button");
//		WebDriverUtility.wait(3000);
////		WebDriverUtility.screenShot();
//		
//	}	

	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
		AccountEdit.massegeDisplayed();
		logger.info("User should see the success massage displayed");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}



}
