package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties properties=new Properties();
    public static FileReader file;

    @BeforeTest
    public void setUp() throws IOException {
      if(driver==null)
      {
          FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\src\\configFiles\\config.properties");
          properties.load(file);
      }
      if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
      {
          WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
           driver.get(properties.getProperty("testurl"));
      }
      else if (properties.getProperty("browser").equalsIgnoreCase("Firefox")) {
          WebDriverManager.chromedriver().setup();
           driver=new FirefoxDriver();
           driver.get(properties.getProperty("testurl"));
      }
    }

    @AfterTest
    public void tearDown()
    {
     driver.close();
    }
}
