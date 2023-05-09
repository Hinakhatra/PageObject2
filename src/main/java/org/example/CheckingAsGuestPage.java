package org.example;

import org.openqa.selenium.By;

public class CheckingAsGuestPage extends Utils{
    private By _checkoutGuestButton = By.xpath("//button[text()='Checkout as Guest']");
    public void verifyCheckoutAsGuest(){
        //click on checkout guest button
        clickOnElement(_checkoutGuestButton);

    }

}
