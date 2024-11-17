package main.java.Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PutBrowser {
	private static WebDriver driver;

    public static WebDriver getDriver(String browserName) {
        if (browserName.equalsIgnoreCase("CHROME")) {
            // Automatically set up the ChromeDriver
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("FIREFOX")) {
            // Automatically set up the GeckoDriver
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("EDGE")) {
            // Automatically set up the EdgeDriver
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }
        return driver;
}
}
