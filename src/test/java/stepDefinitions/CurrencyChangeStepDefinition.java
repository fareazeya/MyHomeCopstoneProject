package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.CurrencyChangeObj;
import utilites.WebDriverUtility;

public class CurrencyChangeStepDefinition extends Base {
	CurrencyChangeObj CurrencyChange = new CurrencyChangeObj();
	
	
	
	@When("^User click on Currency$")
	public void user_click_on_Currency() throws Throwable {
		CurrencyChange.ClickOnCurChange();
		logger.info("User click on Currency");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@When("^User Chose Euro from dropdown$")
	public void user_Chose_Euro_from_dropdown() throws Throwable {
		CurrencyChange.SelectEuro();
		logger.info("User Chose Euro from dropdown");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	   	}

	@Then("^currency value should change to Euro$")
	public void currency_value_should_change_to_Euro() throws Throwable {
		CurrencyChange.DollarChangeToEuro();
		logger.info("currency value should change to Euro");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}
	
	
}
