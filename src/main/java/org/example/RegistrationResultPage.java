package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils{
     String expectedRegistrationCompleteMsg ="Registration is not working";
    private By _actualMessage = By.xpath("//div[@class='result']");
    public void VerifyUserShouldBeAbleToRegisterSuccessfully(){
        //gettext from Web element
        String actualMessage = getTextFromElement(_actualMessage);
        System.out.println("My message: "+actualMessage);
        Assert.assertEquals(actualMessage, expectedRegistrationCompleteMsg,"Registration is not working");

    }


}
