package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils{
    private By _firstName = By.id("FirstName");
    private   By _lastname = By.id("LastName");
    private   By _email = By.name("Email");
    private   By _password = By.id("Password");
    private   By _confirmPassword = By.id("ConfirmPassword");
    private   By _registerButton = By.id("register-button");
    private By _dayOfBirthday = By.name("DateOfBirthDay");
    private By _monthOfBirthday = By.name("DateOfBirthMonth");
    private By _yearOfBirthday = By.name("DateOfBirthYear");
    public void fillInRegistrationDetail(){
        //type firstname
        typeText(_firstName,"TestFirstName");
        //type lastname
        typeText(_lastname,"TestLastName");
        //select dropdown Day
        selectElementByValue(_dayOfBirthday,"26");
        //select dropdown Month
        selectElementByIndex(_monthOfBirthday,2);
        //select dropdown year
        selectElementByText(_yearOfBirthday,"1985");
        //type email address
        typeText(_email,"xyz@gmail.com");
        //type password
        typeText(_password,"test246");
        //type confirm password
        typeText(_confirmPassword,"test246");
        //click on register submit button
        clickOnElement(_registerButton);

    }

}
