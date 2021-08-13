//package stepDefinitions;

//import core.Base;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pageObjectRepository.LoginPageObject;
//import pageObjectRepository.RetailPageObject;
//import utilites.WebDriverUtility;

//public class RetailPageStepDef extends Base {

	//LoginPageObject login = new LoginPageObject();
//	RetailPageObject retail = new RetailPageObject();



//	@When("^User click on MyAccount$")
//	public void User_click_on_MyAccount() {
//		retail.clickOnMyAccount();
//		logger.info("User clicked on MyAccount");
//	}
//
//	@And("^User click on Login$")
//	public void user_click_on_Login() {
//		retail.clickOnLogin();
//		logger.info("User Clicked on Login");
//
//	}
//
//	@And("^User enter userName '(.+)' and password '(.+)'$")
//	public void user_enter_userName_and_password(String userName, String password) {
//		retail.enterEmail(userName);
//		logger.info("user entered email");
//		retail.enterPassword(password);
//		logger.info("user entered password");
//		// WebDriverUtility.screenShot();
//	}
//
//	@And("^User click on Login button$")
//	public void user_click_on_Login_button() {
//		retail.clickOnLoginButton();
//		logger.info("user clicked on login button");
//	}
//
//	@Then("^User should be logged in to myAccount Dashboard$")
//	public void User_should_be_logged_in_to_myAccount_Dashboard() {
//		WebDriverUtility.wait(5000);
//		// WebDriverUtility.screenShot();
//		logger.info("user logged to myAccount Dashboard");
//	}

//}
