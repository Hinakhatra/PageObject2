package org.example;


import org.openqa.selenium.By;

public class AppleMacBookPro13Page extends Utils {
    private By _emailAFriendButton = By.xpath("//button[text()='Email a friend']");
    public void emailAFriend(){
        //click on Email a friend
        clickOnElement(_emailAFriendButton);

    }



}
