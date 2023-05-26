package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");

    public void openBrowser () {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            //open Chrome browser
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox"))
        {
            //open fire fox browser
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge"))
        {
            //open edge browser
            driver = new EdgeDriver();
        }else
        {
            System.out.println("Your browser name is wrong or not implemented :"+browserName);
        }
        //open URL
        driver.get(loadProp.getProperty("url"));
        //Maximize the window
        driver.manage().window().maximize();
        //implicitlyWait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void closeBrowser(){
        //for close browser
        driver.close();
    }
}
