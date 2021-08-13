package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

//Scenario 1 (@Desktop) This include 2 lines of (Background)
//desktop scenario has one line of object I got(Example of category description text)

	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
	private WebElement DesktopTab;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement ShowAllDesktops;

	@FindBy(xpath = "//p[contains(text(),'Example of category description text')]")
	private WebElement ItemsArePresentOnDeskTops;
	// it should show one item to prove that the user is seeing (All items are
	// present in desktop page)

	public void clickOnDesktopTab() {
		WebDriverUtility.clickOnElement(DesktopTab);
	}
	public void clickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(ShowAllDesktops);
	}
	public void itemsArePresent() {
		WebDriverUtility.clickOnElement(ItemsArePresentOnDeskTops);
	}

//Scenario 2 (@AddHpLP3065)
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement AddToCartHPLP3065;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement QuantityOfHPLP3065;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement CartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	public WebElement SuccessMessageAppeared;
	public void addHPToCart() {
		WebDriverUtility.clickOnElement(AddToCartHPLP3065);
	}
	public void choosehpQuantity() {
		WebDriverUtility.clickOnElement(QuantityOfHPLP3065);
	}
	public void cartButton() {
		WebDriverUtility.clickOnElement(CartButton);
	}
//	public String SuccessMessage() {
//		WebDriverUtility.clickOnElement(SuccessMessageAppeared);
//		return null;
	public String SuccessMessageAppeared() {
		return SuccessMessageAppeared.getText();
	}

//Scenario 3 (@AddCanonEOS5D)
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement AddToCartEOS5D;
	
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement SelectRedColor;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCartButtonEOS5D;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	public WebElement SuccessMessageEOS5D;
	
	public void AddToCartEOS5D() {
		WebDriverUtility.clickOnElement(AddToCartEOS5D);
	}
	public void SelectColorEOS5D() {
		WebDriverUtility.clickOnElement(SelectRedColor);
	}
	public void AddToCartButtonEOS5D() {
		WebDriverUtility.clickOnElement(AddToCartButtonEOS5D);
	}
	public String SuccessMessageEOS5D() {
		return SuccessMessageAppeared.getText();
	}
	
	
//	#scenario 4	(@AddReviewToCanon)
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement ClickOnCartEOS5D;
	
			//	And User click on Canon EOS 5D item
			//	And User click on write a review link
			//	And user fill the review information with below information
			//	#|yourname|yourReview|Rating
			//	#|name|review|Bad or good|
			//	And User click on Continue Button
			//	Then User should see a message with 'Thank you for your review. it has been submitted to the webmaster for approval'.
}
