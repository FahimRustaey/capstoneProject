package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DesktopsPageObject;
import utilites.WebDriverUtility;

public class DesktopPageStepDef extends Base {

	DesktopsPageObject desktops = new DesktopsPageObject();

//Scenario 1 (@Desktop) it runs after (Background)

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() {
		desktops.clickOnDesktopTab();
		logger.info("User clicked on Desktob Tab");
	}

	@And("^User click on Show all desktop page$")
	public void user_click_on_Show_all_desktop_page() {
		desktops.clickOnShowAllDesktops();
		logger.info("User clicked on Show All Desktobs");
	}

	@Then("^user should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		WebDriverUtility.wait(5000);
		logger.info("User see all items are present");
	}

//Scenario 2 (@AddHpLP3065)

	@And("^User click on ADD TO CART option on \"HP LP3065\" item$")
	public void user_click_on_ADD_TO_CART_option_on_HP_LP_item() {
		desktops.addHPToCart();
		logger.info("User clicked on ADD TO CART");
	}

	@And("^User select quantity \"1\"$")
	public void user_select_quantity() {
		desktops.choosehpQuantity();
		logger.info("Choose HP Quantity");
	}

	@And("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() {
		desktops.cartButton();
		logger.info("User clicked on cart button");
	}

	@Then("^User should see a message$")
	public void User_should_see_message (String SuccessMes) {
		desktops.SuccessMessageAppeared();
		WebDriverUtility.screenShot();
		String actualMessage = desktops.SuccessMessageAppeared();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, SuccessMes);
	}
	
	
//Scenario 3  (@AddCanonEOS5D)

//	@And("^User click ADD TO CART option on 'Canon EOS 5D' item$")
//	public void User_click_ADD_TO CART_option_on_Canon_EOS_5D_item() {
//		desktops.AddToCartEOS5D();
//		logger.info("User clicked on ADD TO CART EOS5D");
//	}

	@And("^User select color from dropdown 'Red'$")
	public void User_select_color_from_dropdown_Red_() {
		desktops.SelectColorEOS5D();
		logger.info("Choose HP Quantity");
	}

	@And("^User click add to Cart button$")
	public void User_click_add_to_Cart_button() {
		desktops.AddToCartButtonEOS5D();
		logger.info("User clicked on cart button EOS5D");
	}

//	@Then("^User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'$")
//	public void User_should_see_message (String SuccessMes) {
//		desktops.SuccessMessageAppeared();
//		WebDriverUtility.screenShot();
//		String actualMessage = desktops.SuccessMessageAppeared();
//		System.out.println(actualMessage);
//		Assert.assertEquals(actualMessage, SuccessMes);
//	}
	
}
