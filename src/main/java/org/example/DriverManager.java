package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{

    public void openBrowser () {
        //for open browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    public void closeBrowser(){
        //for close browser
        driver.close();
    }
}
