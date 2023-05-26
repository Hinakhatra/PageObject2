package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _email = By.xpath("//input[contains(@class,\"email\")]");
    private By _password = By.xpath("//input[contains(@class,\"password\")]");
    private By _loginButton = By.xpath("//button[text()='Log in']");
    public void fillInLoginDetail(){
        //type email
        typeText(_email,loadProp.getProperty("email")+loadProp.getProperty("emailDomain"));
        //type password
        typeText(_password,loadProp.getProperty("password"));
        //click on login button
        clickOnElement(_loginButton);

    }


}
