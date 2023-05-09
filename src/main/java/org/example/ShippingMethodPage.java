package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShippingMethodPage extends Utils{
    String expectedOrderConfirmationMessage = "Order is not confirmed";
    private By _nextdayAir = By.cssSelector("input#shippingoption_1");
    private By _continue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private By _creditCard = By.cssSelector("input#paymentmethod_1");
    private By _continue1 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    private By _visaCard = By.cssSelector("select.dropdownlists");
    private By _cardholderName = By.cssSelector("input#CardholderName");
    private By _cardNo = By.cssSelector("input#CardNumber");
    private By _expiryMonth = By.cssSelector("select#ExpireMonth");
    private By _expiryYear = By.cssSelector("select#ExpireYear");
    private By _sortCode = By.cssSelector("input#CardCode");
    private By _continue2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private By _confirmButton = By.xpath("//button[text()='Confirm']");
    private By _orderSuccessfullyMessage = By.xpath("//div[@class='section order-completed']//div[@class='title']");
    private By _orderNumber = By.xpath("//div[@class='order-number']");

    public void clickOnShippingMethod(){
        clickOnElement(_nextdayAir);
        clickOnElement(_continue);
        clickOnElement(_creditCard);
        clickOnElement(_continue1);
    }
    public void paymentInfo(){
        //select payment card
        selectElementByText(_visaCard,"Visa");
        //type cardholder name
        typeText(_cardholderName,"JohnLeon");
        //type long card no
        typeText(_cardNo,"4916685446321138");
        //select expiry month
        selectElementByValue(_expiryMonth,"6");
        //select year
        selectElementByValue(_expiryYear,"2030");
        //type sort code
        typeText(_sortCode,"226");
        //click on continue
        clickOnElement(_continue2);
    }
    public void confirmOrder(){
        //click on confirm button
        clickOnElement(_confirmButton);
        //verify and assert order is successful message
        String orderSuccessfullyMessage = getTextFromElement(_orderSuccessfullyMessage);
        System.out.println("Order Details: " +orderSuccessfullyMessage);
        String orderNumber = getTextFromElement(_orderNumber);
        System.out.println(orderNumber);
        Assert.assertEquals(orderSuccessfullyMessage,expectedOrderConfirmationMessage,"Order is not processed");



    }
}
