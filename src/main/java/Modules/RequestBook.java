package main.java.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RequestBook {

	private WebDriver driver;

	public void LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Request a Book") // Updated locator
	private WebElement RequestaBook;

	@FindBy(name = "ctl00$phBody$RequestBook$txtISBN")
	private WebElement ISBN;

	@FindBy(id = "ctl00_phBody_RequestBook_txtTitle")
	private WebElement BookTitle;

	@FindBy(name = "ctl00$phBody$RequestBook$txtAuthor")
	private WebElement Authorname2;

	@FindBy(name = "ctl00$phBody$RequestBook$txtEmailReq")
	private WebElement MailId;

	@FindBy(name = "ctl00$phBody$RequestBook$txtPhone")
	private WebElement MobileNumber;

	@FindBy(id = "ctl00_lblTotalCartItems")
	private WebElement GoTOCart;
	@FindBy(partialLinkText = "New Arrivals")
	private WebElement NewArrivalsLink;

	public void RequestBooks(String RequestaBook) {
		WebDriverWait wait = new WebDriverWait(driver, 500);
		System.out.println("Inside request book 44");
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(RequestaBook)));
		System.out.println("Inside request book 46");
		WebDriverWait wait1 = new WebDriverWait(driver, 500);
		this.RequestaBook.click();
	}

	public void ISBN(String ISBN) {
		this.ISBN.sendKeys("152969695X");
	}

	public void BoobTitle2(String BookTitle) {
		this.BookTitle.sendKeys("Early Years Foundation Stage");
	}

	public void Publishers(String Publishers) {
		this.BookTitle.sendKeys("Sage Publications");
	}

	public void MailId(String MailId) {
		this.MailId.sendKeys("shivanisingh535350@gmail.com");
	}

	public void MobileNumber(String MobileNumber) {
		this.MobileNumber.sendKeys("8305695953");
	}

	public void GoToCart(String GoToCart) {
		this.GoTOCart.click();
	}

	public void Authorname2(String glennMuller) {
		this.Authorname2.sendKeys(glennMuller);
	}
	public void ClickNewArrivals(String newArrivalsLinkPath) {
		this.NewArrivalsLink.click();
	}
}
