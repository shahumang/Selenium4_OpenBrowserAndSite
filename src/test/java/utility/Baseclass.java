package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Baseclass {
    //WebDriver is Interface so can't create it's object creating it's variable reference or instance
    public static WebDriver webDriver;
    @BeforeSuite
    public void openBrowser(){

        //Creating object of ChromeOptions class for using different methods of chrome
        ChromeOptions options = new ChromeOptions();
        //Maximize Chrome driver
        options.addArguments("--start-maximized");
        //Open Browser in incognito more
        options.addArguments("--incognito");

        //Passing webDrive instance or reference variable for implementing chromedriver class and using runtime polymorephism
        webDriver = new ChromeDriver(options);
        //implementing methods of WebDrive interface for opening browser
        webDriver.get("https://www.google.com/");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

}
