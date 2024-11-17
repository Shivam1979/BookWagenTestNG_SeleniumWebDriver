package test.java.runner;

import main.java.Modules.BestSellers;
import main.java.Modules.FeaturedAuthor;
import main.java.Modules.NewArrivals;
import main.java.Modules.RequestBook;
import org.openqa.selenium.WebDriver;


import Browser.PutBrowser;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunner {

    private WebDriver driver;
    private NewArrivals newArrivalsPage;
    private BestSellers bestSellersPage;
    private FeaturedAuthor featuredAuthorPage;
    private RequestBook requestBookPage;

    @BeforeTest
    public void setup() {
        // Initialize the WebDriver using the All_browser class
        driver = PutBrowser.getDriver("CHROME");
        driver.manage().window().maximize();

        // Launch the application
        driver.get("https://www.bookswagon.com/");

        // Initialize Page Object Model (POM) classes
        newArrivalsPage = new NewArrivals();

        newArrivalsPage.LoginPOM(driver);

        bestSellersPage = new BestSellers();
        bestSellersPage.LoginPOM(driver);

        featuredAuthorPage = new FeaturedAuthor();
        featuredAuthorPage.LoginPOM(driver);

        requestBookPage = new RequestBook();
        requestBookPage.LoginPOM(driver);

    }

    @Test(priority = 1)
    public void testNewArrivals() {
        // Pass the relative link for "New Arrivals"
        newArrivalsPage.ClickNewArrivals("/promo-best-seller/new-arrivals/");

        newArrivalsPage.ClickBookImage();

        newArrivalsPage.ClickAddToCart();

        newArrivalsPage.Continue();

    }

    @Test(priority = 2)
    public void testBestSellers() throws InterruptedException {

        bestSellersPage.ClickBestSeller("/promo-best-seller/best-seller");

        bestSellersPage.ClickBookName("BookName");
        bestSellersPage.ClickAddToCart();

        bestSellersPage.Continue();

    }

    @Test(priority = 3)
    public void testFeaturedAuthors() throws InterruptedException {
        featuredAuthorPage.clickFeaturedAuthors();
        featuredAuthorPage.clickArundhatiRoy();

        featuredAuthorPage.clickAddToCart();

        featuredAuthorPage.clickFeaturedAuthors();

        featuredAuthorPage.continueShopping();

    }

    @Test(priority = 4)
    public void testRequestABook() {
        System.out.println("line 83 runnning");
        requestBookPage.RequestBooks("requestbook");
        requestBookPage.ISBN("1777267331");
        requestBookPage.BoobTitle2("Ruggage");
        requestBookPage.Authorname2("Glenn Muller");
        requestBookPage.MailId("susantmishra2110@gmail.com");
        requestBookPage.MobileNumber("8240196250");
        requestBookPage.GoToCart("GoToCart");

        requestBookPage.ClickNewArrivals("/promo-best-seller/new-arrivals/");
    }


    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
