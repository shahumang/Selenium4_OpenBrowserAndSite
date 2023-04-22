package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Baseclass {

    //WebDriver is Interface so can't create it's object creating it's reference
    public static WebDriver webDriver;
    @BeforeSuite
    public void openBrowser(){

        //Creating object of ChromeOptions class for using different methods of chrome
        ChromeOptions options = new ChromeOptions();

        //Maximize Chrome driver
        options.addArguments("--start-maximized");

        //Passing chromedriver as reference and default it's creating constructor and passing object of chromedriver
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.google.com/");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

}
