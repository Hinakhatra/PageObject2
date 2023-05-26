package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils{
    String expectedCommunityPollMessage = "Every user can vote";
    String expectedPollingResult ="You can not Vote";
    String expectedWelComeMessage ="No Message";

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
    private By _searchButton = By.xpath("//button[text()='Search']");
    private By _currencySelector = By.cssSelector("select#customerCurrency");
    private By _usDollar = By.xpath("//option[text()='US Dollar']");
    private By _euro = By.xpath("//option[text()='Euro']");
    private By _searchPlaceHolderText = By.cssSelector("input.search-box-text");
    private By _faceBookPage =By.cssSelector("li.facebook");
    private By _welComeMessage = By.xpath("//h2[text()='Welcome to our store']");
    private By _clickOnAddToCartBuildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]");
    private By _clickOnNewRelease = By.xpath("//a[@href=\"/nopcommerce-new-release\"][text()='details']");
    LoadProp loadProp = new LoadProp();

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
        Assert.assertEquals(actualMessage,loadProp.getProperty("nonRegisteredVoteMessage"));
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

    public void printOutTheProductTitle(){
        //create list for elements
        List<WebElement>productlist =driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e:productlist){
            //print products name
            System.out.println(e.getText());
        }
    }
    public void verifySearchAlertMessage(){
        //click on search button
        clickOnElement(_searchButton);
        //get alert message
        Alert alert = driver.switchTo().alert();
        //get text for expected and actual message
        Assert.assertEquals(alert.getText(),loadProp.getProperty("searchAlertMessage"));
        alert.accept();

    }
    public void printCurrencyInUSDollar() {
        String actualCurrency = getTextFromElement(_usDollar);
        System.out.println("Selected Currency: "+actualCurrency);
        //select us dollar in currency selector
        selectElementByText(_currencySelector,loadProp.getProperty("currencySelector"));
        //create list for elements
        List<WebElement> actualCurrency1 = driver.findElements(By.cssSelector("span.price"));
        for (WebElement e : actualCurrency1) {
            //print product price with dollar symbol
            System.out.println(e.getText());
        }
        Assert.assertEquals(actualCurrency,"US Dollar");
    }
    public void printCurrencyInEuro(){
        String actualCurrency = getTextFromElement(_euro);
        System.out.println("Selected Currency: "+actualCurrency);
        //select euro in currency selector
        selectElementByText(_currencySelector,loadProp.getProperty("currencySelector1"));
        //create list for elements
        List<WebElement>actualCurrency1 = driver.findElements(By.cssSelector("span.price"));
        for (WebElement e:actualCurrency1) {
            //print product price with euro sign
            System.out.println(e.getText());
        }
        Assert.assertEquals(actualCurrency,"Euro");
    }
    public void verifyVoteAlertMessage(){
        //click on vote
        clickOnElement(_voteButton);
        Alert alert = driver.switchTo().alert();
        //get text for expected and actual message
        Assert.assertEquals(alert.getText(),loadProp.getProperty("voteAlertMessage"));
        //click on ok button
        alert.accept();

    }
    public void searchFunctionality(String searchText,String expectedResult){
        //type text in search box
        typeText(_searchPlaceHolderText,searchText);
        //click on search button
        clickOnElement(_searchButton);
        //Using List print product names
        List<WebElement>productLists = driver.findElements(By.cssSelector("div.item-grid h2"));
        for (WebElement e:productLists){
            System.out.println(e.getText());
        }
        String actualmessage = searchText;
        Assert.assertEquals(actualmessage,expectedResult);
    }
    public void handleMultipleWindow() {
        //click on facebook
        clickOnElement(_faceBookPage);
    }
    public void verifyWelcomeMessage(){
        String currentURL = driver.getCurrentUrl();
        System.out.println("HomePage URL:"+currentURL);
        String actualMessage = getTextFromElement(_welComeMessage);
        System.out.println("WelCome message is: "+actualMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("expectedWelComeMessage"));

    }
    public void clickOnBuildUrOwnAddToCart(){
        //click on build your own computer
        clickOnElement(_clickOnAddToCartBuildYourOwnComputer);

    }
    public void clickOnNewReleaseDetails(){
        //click on New Release!
        clickOnElement(_clickOnNewRelease);

    }
}
