package main.java.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewArrivals {

	private WebDriver driver;

	public void LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Use "New Arrivals" as the partial link text
	@FindBy(partialLinkText = "New Arrivals")
	private WebElement NewArrivalsLink;

	@FindBy(xpath = "(//img[@class='card-img-top bklazy'])[1]") // Adjust the XPath if needed
	private WebElement BookImage;

	@FindBy(id = "btnAddtocart")
	private WebElement AddToCartButton;

	@FindBy(xpath = "(//input[@type='submit'])[2]") // Assuming the "Continue" button is the same as in the BestSellers class
	private WebElement ContinueButton;

	// Method to click on "New Arrivals" link (using the relative link path as parameter)
	public void ClickNewArrivals(String newArrivalsLinkPath) {
		this.NewArrivalsLink.click();
	}

	// Method to click on the book image (you can pass the book name as an argument if you want to customize this further)
	public void ClickBookImage() {
		this.BookImage.click();
	}

	// Method to click the "Add to Cart" button
	public void ClickAddToCart()   {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		this.AddToCartButton.click();
	}

	// Method to continue to the cart (click "Continue" button)
	public void Continue()   {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		this.NewArrivalsLink.click();

	}
}
