package stepDefinitions;


import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LaptopNoteBooksObj;
import utilites.WebDriverUtility;

public class LapNoteBookStepDefination extends Base {
	
	LaptopNoteBooksObj LapNoteBooks = new LaptopNoteBooksObj ();
	
	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
		LapNoteBooks.LapTopNoteBook();
		logger.info("User Should Click on Mac laptob NoteBook");
		utilites.WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	    
	}

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
		LapNoteBooks.ShowAllDesktop();
		logger.info("User should click on all laptop and notebook options");
		WebDriverUtility.wait(200);
		WebDriverUtility.screenShot();
		
	    
	}

	@When("^User click on MacBook  item$")
	public void user_click_on_MacBook_item() throws Throwable {
		LapNoteBooks.MacBook();
		logger.info("User should click on Mac Book Item");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	    
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
		LapNoteBooks.SuccessMassage();
		logger.info("User Should See A success Massage for add items in the card");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	    
	}

	@Then("^User should see ‘(\\d+) tem\\(s\\)-(\\d+)\\.(\\d+)’ showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(int arg1, int arg2, int arg3) throws Throwable {
		LapNoteBooks.OneItem();
		logger.info("User should see Items in the card");
		WebDriverUtility.wait(3000);
	}  

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		LapNoteBooks.CardOption();
		logger.info("User Should click on cart Option");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	    
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
		LapNoteBooks.CardOption();
		logger.info("User should click on red X button");
		WebDriverUtility.screenShot();
	    
	}

	@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cart_should_show_item_s(int arg1) throws Throwable {
		LapNoteBooks.ZeroItem();
		logger.info("User See Zero Items on the card");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	    
	}


}




