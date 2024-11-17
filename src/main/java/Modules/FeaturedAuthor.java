package main.java.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FeaturedAuthor {
	private WebDriver driver;

	// Constructor to initialize the PageFactory elements
	public void LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locator for "Featured Authors" link (assuming this is on the initial page)
	@FindBy(linkText = "Featured Authors")
	private WebElement featuredAuthorsLink;

	// Locator for the "Arundhati Roy" author link
	@FindBy(linkText = "Arundhati Roy")
	private WebElement arundhatiRoyLink;

	// Locator for the "Add to Cart" button
	@FindBy(css = "input.btn-red[value='Add to cart']")
	private WebElement addToCartButton;

	// Locator for the "Continue" button (not the featuredAuthorsLink)
	@FindBy(css = "button.continue")
	private WebElement continueButton;

	// Method to click on the "Featured Authors" link
	public void clickFeaturedAuthors() {
		featuredAuthorsLink.click();
	}

	// Method to click on the "Arundhati Roy" link
	public void clickArundhatiRoy() {
		arundhatiRoyLink.click();
	}

	// Method to click the "Add to Cart" button
	public void clickAddToCart() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(this.addToCartButton));
		addToCartButton.click();
	}

	// Method to click the "Continue" button with proper wait mechanism
	public void continueShopping() {
		WebDriverWait wait = new WebDriverWait(driver, 10); // Use WebDriverWait instead of sleep
		this.featuredAuthorsLink.click();
	}
}
