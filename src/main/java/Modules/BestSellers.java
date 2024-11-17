package main.java.Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class BestSellers {

	private WebDriver driver;

	public void LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Use "Best sellers" as the partial link text
	@FindBy(partialLinkText = "Best sellers")
	private WebElement BestSellers;


	@FindBy(xpath = "(//img[@class='card-img-top bklazy'])[2]")
	private WebElement Bookname2;

	@FindBy(xpath = "//a[@id='btnAddtocart']")
	private WebElement AddToCart2;

	@FindBy(xpath ="(//input[@type='submit'])[2]")
	private WebElement ContinueBtn2;

	public void ClickBestSeller(String s) {
		this.BestSellers.click();
	}

	public void ClickBookName(String bookName) {
		this.Bookname2.click();
	}

	public void ClickAddToCart() throws InterruptedException {
		this.AddToCart2.click();
	}

	public void Continue() {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		this.BestSellers.click();
	}
}
