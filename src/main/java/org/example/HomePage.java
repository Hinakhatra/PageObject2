package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils{
    String expectedCommunityPollMessage = "Every user can vote";
    String expectedPollingResult ="You can not Vote";

    private By _registerButton = By.className("ico-register");
    private By _goodRadioButton = By.id("pollanswers-2");
    private By _voteButton = By.xpath("//button[text() ='Vote']");
    private By _voteErrorMessage = By.xpath("//div[@class='poll-vote-error']");
    private By _login = By.xpath("//a[text()='Log in']");
    private By _applePro13 = By.xpath("//a[text()='Apple MacBook Pro 13-inch']");
    private By _voteMessage = By.xpath("//span[@class=\"poll-total-votes\"]");
    private By _addToCartAppleMac = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _electronics = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a");
    private By _htcCompareButton = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _greenLineClose = By.xpath("//span[@class= \"close\"]");
    private By _giftCardCompareButton = By.xpath("//div[@class=\"item-grid\"]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _ProductCompareText = By.xpath("//a[text()='product comparison']");
    public void clickOnRegisterButton() {
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnGoodRadioButton(){
        //click on Good radio button
        clickOnElement(_goodRadioButton);
    }
    public void clickOnVote(){
        //click on VOTE
        clickOnElement(_voteButton);
    }
    public void VerifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='poll-vote-error']")));
        String actualMessage = getTextFromElement(_voteErrorMessage);
        System.out.println("My message: "+actualMessage);
        Assert.assertEquals(actualMessage,expectedCommunityPollMessage,"Every user can vote");
    }
    public void clickOnLogin(){
        //click on Login
        clickOnElement(_login);
    }
    public void clickOnAppleMacBookPro_13(){
        //click On AppleMacBookPro_13
        clickOnElement(_applePro13);
    }
    public void VerifyRegisteredUserShouldBeAbleToVoteSuccessfully(){
        //print message
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"poll-total-votes\"]")));
        String actualMessage = getTextFromElement(_voteMessage);
        System.out.println(" polling Result: "+actualMessage);
        Assert.assertEquals(actualMessage, expectedPollingResult,"You can not Vote");
    }
    public void clickOnAddToCartAppleMac(){
        //click on ADD TO CART BUTTON
        clickOnElement(_addToCartAppleMac);
    }
    public void clickOnElectronics(){
        //click on electronics
        clickOnElement(_electronics);
    }
    public void clickOnHTCAndroidCompareButton(){
        //click on HTC One M8 Android Lollipop compare button
        clickOnElement(_htcCompareButton);
    }
    public void clickOnGreenLineClose(){
        //click on green line close button
        clickOnElement(_greenLineClose);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void clickOnGiftCardCompareButton(){
        //click on $25 virtual gift card compare button
        clickOnElement(_giftCardCompareButton);
    }
    public void clickOnGreenlineProductComparisonText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_ProductCompareText));
        //click on Green line product comparison text
        clickOnElement(_ProductCompareText);
    }




}
