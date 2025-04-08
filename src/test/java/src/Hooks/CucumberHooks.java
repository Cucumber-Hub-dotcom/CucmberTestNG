package src.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import src.Factory.DriverFactory;

public class CucumberHooks {
    private WebDriver driver;
    @Before
    public  void before()

    {
       driver= DriverFactory.initializeDriver();
        System.out.println("Before class");

    }

    @After
    public  void after()
    {
        driver.quit();
        System.out.println("Before class");
    }
}
