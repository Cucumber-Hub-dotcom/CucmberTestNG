package driverI;

import org.openqa.selenium.WebDriver;

public  class DriverManager {
     public DriverManager() {
     }

     private static final ThreadLocal<WebDriver> threadSafeDriver = new ThreadLocal<>();

     public static WebDriver getDriver() {
         return threadSafeDriver.get();
     }

     public static void setDriver(WebDriver driver)
     {
         threadSafeDriver.set(driver);
     }

     public static ExecutionNodeDTO getExecutionNodeDTO()
     {
         //  return threadSafeDriver.get();
         return null;
     }

     public static void setExecutionNodeDTO(ExecutionNodeDTO executionNodeDTO) {
         // threadSafeDriver.set(executionNodeDTO);
         return;
     }

     public static void unload() {
         getDriver().quit();
         threadSafeDriver.remove();
     }

}














 /*public static WebDriver driver;

   public static void initializeDriver()
    {
      driver=new ChromeDriver();
    }
    public static WebDriver getDriver()
    {
        if(driver==null)
        {
            initializeDriver();
        }
        return driver;
    }*/