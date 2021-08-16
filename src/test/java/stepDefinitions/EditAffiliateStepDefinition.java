package stepDefinitions;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.EditAffiliateObj;
import utilites.WebDriverUtility;

public class EditAffiliateStepDefinition extends Base {
           
	EditAffiliateObj EditAff = new EditAffiliateObj ();
	
	@When("^User click on ‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		EditAff.EditInfo();
		logger.info("User Should click on edit");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		EditAff.BankTrans();
		logger.info("User Should click on Bandtran");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable arg1) throws Throwable {
		EditAff.BankName("BNK");
		EditAff.BranchN("420");
		EditAff.SwiftCode("650");
		EditAff.AccountNam("Checking Account");
		EditAff.AccountNum("1234567890");
		logger.info("User Should fill the information");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	    
	}
	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
		EditAff.Continues();
		logger.info("User click on Continue button");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}
	
	@Then("^User should see a success messag$")
	public void user_should_see_a_success_messag() throws Throwable {
		EditAff.MassageDis();
		logger.info("User should see the massage displayed");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}


}