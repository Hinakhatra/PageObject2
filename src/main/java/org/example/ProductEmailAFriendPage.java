package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriendPage extends Utils {
    LoadProp loadProp = new LoadProp();
    String expectedSentEmailMsg ="Your Message has not been sent";
    String expectedErrorMessage ="Non register user can email a friend";
    private By _enterFriendEmail = By.xpath("//input[contains(@class,'friend-email')]");
    private By _typePersonalMessage = By.xpath("//textarea[starts-with(@name,'Personal')]");
    private By _sendEmailButton = By.xpath("//button[text()='Send email']");
    private By _sendEmailMessage = By.xpath("//div[@class='result']");
    private By _enterYourEmail = By.id("YourEmailAddress");
    private By _sendEmailErrorMessage = By.xpath("//li[text()='Only registered customers can use email a friend feature']");
    public void fillInEmailAFriendDetailsForRegisterUser() {
        //type friend's email
        typeText(_enterFriendEmail,loadProp.getProperty("friendEmail")+ timestamp()+ loadProp.getProperty("emailDomain"));
        //type personal message
        typeText(_typePersonalMessage,loadProp.getProperty("personalMessage"));
        //click on send email button
        clickOnElement(_sendEmailButton);

        String actualMessage = getTextFromElement(_sendEmailMessage);
        System.out.println("My message: "+actualMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("sendEmailMessage"));
    }
    public void fillInEmaildetailsForNonRegisterUser(){
        //type friend's email
        typeText(_enterFriendEmail,loadProp.getProperty("friendEmail")+timestamp()+loadProp.getProperty("emailDomain"));
        //type your email ID
        typeText(_enterYourEmail,loadProp.getProperty("email")+loadProp.getProperty("emailDomain"));
        //type personal message
        typeText(_typePersonalMessage,loadProp.getProperty("personalMessage"));
        //click on send email button
        clickOnElement(_sendEmailButton);
        //print error message
        String actualMessage = getTextFromElement(_sendEmailErrorMessage);
        System.out.println("My message: "+actualMessage);
        Assert.assertEquals(actualMessage,loadProp.getProperty("expectedErrorMessage"));
    }

    }

