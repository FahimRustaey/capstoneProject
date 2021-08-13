package pageObjectRepository;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
//import utilites.WebDriverUtility;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
//
//	@FindBy(xpath = "//span[contains(text(),'My Account')]")
//	private WebElement myAccount;
//	@FindBy(xpath = "//a[text()='Login']")
//	private WebElement login;
//	@FindBy(id = "input-email")
//	private WebElement emailField;
//	@FindBy(id = "input-password")
//	private WebElement passwordField;
//	@FindBy(xpath = "//input[@value='Login']")
//	private WebElement loginButton;
//
//	public void clickOnMyAccount() {
//		WebDriverUtility.clickOnElement(myAccount);
//	}
//
//	public void clickOnLogin() {
//		WebDriverUtility.clickOnElement(login);
//	}
//
//	public void enterEmail(String email) {
//		WebDriverUtility.enterValue(emailField, email);
//	}
//
//	public void enterPassword(String password) {
//		WebDriverUtility.enterValue(passwordField, password);
//	}
//
//	public void clickOnLoginButton() {
//		WebDriverUtility.clickOnElement(loginButton);
//	}

}
