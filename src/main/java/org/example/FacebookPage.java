package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class FacebookPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _allowCookies = By.xpath("(//div[contains(@aria-label,'Allow all cookies')])[2]");
    private By _close = By.xpath("//div[@aria-label='Close']");
    private By _emailFacebook = By.xpath("//input[@placeholder='Email or phone']");
    private By _passwordFacebook = By.xpath("//input[@placeholder='Password']");
    private By _loginFacebook = By.xpath("//div[@aria-label='Accessible login button']");
    public void handleFaceBookPage() {
        //store the window handle of the main window
        String mainWindowHandle = driver.getWindowHandle();
        // Switch to the child window
        for (String childWindowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(childWindowHandle);
        }
        //all actions on child window
        String faceBookURL = driver.getCurrentUrl();
        System.out.println("ChildWindow URL:"+faceBookURL);
        Assert.assertEquals(faceBookURL,loadProp.getProperty("faceBookURL"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(_close));
        clickOnElement(_allowCookies);
        clickOnElement(_close);
        if (driver.findElement(_emailFacebook).isDisplayed()) {
            System.out.println("Element Email is Visible");
        } else {
            System.out.println("Element Email is InVisible");
        }

        if (driver.findElement(_passwordFacebook).isDisplayed()) {
            System.out.println("Element Password is Visible");
        } else {
            System.out.println("Element Password is InVisible");
        }
        if (driver.findElement(_loginFacebook).isDisplayed()) {
            System.out.println("Element Log in is Visible");
        } else {
            System.out.println("Element Log in is InVisible");
        }
        driver.close();
        //switch back to main window
        driver.switchTo().window(mainWindowHandle);

    }

}
