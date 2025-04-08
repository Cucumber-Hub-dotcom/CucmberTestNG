package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/resources/Feature", // Path to feature files
        glue = {"src/test/java/src/stepDef"},               // Package where step definitions are located
        plugin = {
                "pretty","html:target/cucumber.html"
               // "html:target/cucumber-reports/html-report.html",
             //   "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true,                        // Makes console output more readable
        dryRun = true, // if step def is missing
        tags = "@Smoke"                           // Run scenarios tagged with @Smoke (optional)
)
public class TestNgRunnerTest extends AbstractTestNGCucumberTests {
      /*  @BeforeClass
        public void beforeClass()
        {
                System.out.println("Before class");
        }

        @AfterClass
        public void afterclass()
        {
                System.out.println("After class");
        }*/
    // No additional code is needed unless you want to override methods for parallel execution or setup
}
