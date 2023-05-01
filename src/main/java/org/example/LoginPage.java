package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    private By _email = By.xpath("//input[contains(@class,\"email\")]");
    private By _password = By.xpath("//input[contains(@class,\"password\")]");
    private By _loginButton = By.xpath("//button[text()='Log in']");
    public void fillInLoginDetail(){
        //type email
        typeText(_email,"xyz@gmail.com");
        //type password
        typeText(_password,"test246");
        //click on login button
        clickOnElement(_loginButton);

    }


}
