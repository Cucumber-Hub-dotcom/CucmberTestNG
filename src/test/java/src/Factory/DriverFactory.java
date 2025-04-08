package src.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver initializeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Karishma\\DriverChrome\\chromedriver-win64");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/store/");
        return driver;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
