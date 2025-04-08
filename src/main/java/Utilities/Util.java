package Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driverI.DriverManager;

import java.time.Duration;
import java.util.ArrayList;

public class Util {
    private Util() {}
    static ArrayList<String>win=new ArrayList<>();

    public static WebElement findElement(By byLocator)
    {
        waitUntilElementsVisible(byLocator);
        WebElement element=null;
        element=DriverManager.getDriver().findElement(byLocator);
        return element;

    }
    public static void waitUntilElementVisible(By by)
    {
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(2));
    }
    public static boolean waitForElementDisplayed(By by,int timeOut)
    {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }
        catch (Exception e)
        {
            System.out.println("");
            return false;
        }
    }
    public static boolean waitForElemntDisplayed(By byLocator , int timeOut)
    {
        try{
            WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeOut));
            wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public static boolean verifyElementNotPresent(By byLocator,int timeOut)
    {
        try {
            WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(timeOut));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(byLocator));
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    /**
     * Convert int to String
     *
     **/
    public String convertToString(int i)
    {
        String string=Integer.toString(i);
        return string;
    }

    /**
     * Convert to int
     */
    public int convertToInt(String s)
    {
        int i=Integer.parseInt(s);
        return i;
    }

    public static void switchToWindow(int noOfWindow)
    {
     WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(3));
     try {
         wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindow));
         for (String windowHandle : DriverManager.getDriver().getWindowHandles()) {
             win.add(windowHandle);
             DriverManager.getDriver().switchTo().window(windowHandle);
             DriverManager.getDriver().manage().window().maximize();
         }
     }
     catch (Exception e)
     {
         System.out.println("No of window handle");
     }

     }

     public static void navigateBack()
     {
      try{
          DriverManager.getDriver().navigate().back();
      }
      catch (Exception e)
      {
          System.out.println("Successfully navigating back");
      }
     }
     public  static void waitUntilElementsVisible(By byLocator)
     {
         WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(2));
         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));
     }
     public static void waitUntilElementClickable(By byLocator)
     {
         WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(3));
         wait.until(ExpectedConditions.elementToBeClickable(byLocator));
     }
     public static void moveToElementAndClick(By by1)
     {
         Actions action = new Actions(DriverManager.getDriver());
         action.moveToElement(DriverManager.getDriver().findElement(by1)).click().build().perform();
     }
     public static boolean isPresent()
     {

         return false;
     }
     public static void scrollToTheElement(By element)
     {
         JavascriptExecutor js=(JavascriptExecutor)DriverManager.getDriver();
         js.executeScript("arguments[0].scrollIntoView(true);", DriverManager.getDriver().findElement(element));
         js.executeScript("window.scrollBy(0,-50)", "");
     }
    public static void scrollToTopOfPageWEB() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-250)", "");
    }

    public static void scrollToTopOfPage() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,-250)", "");
    }
    public static void scrollByWEB() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }

    /**
     * Function to scroll bottom of page
     */
    public static void scrollToBottomOfPageWEB() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollToBottomOfPage() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public static void browserTearDown()
    {
        DriverManager.getDriver().quit();
    }
}
