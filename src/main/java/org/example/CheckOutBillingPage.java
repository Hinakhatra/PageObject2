package org.example;

import org.openqa.selenium.By;

public class CheckOutBillingPage extends Utils {
    private By _firstname = By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastname = By.cssSelector("input#BillingNewAddress_LastName");
    private By _email = By.cssSelector("input#BillingNewAddress_Email");
    private By _country = By.cssSelector("select#BillingNewAddress_CountryId");
    private By _city = By.cssSelector("input#BillingNewAddress_City");
    private By _address1 = By.cssSelector("input#BillingNewAddress_Address1");
    private By _zipcoad = By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _phoneNo = By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _continueButton = By.xpath("//button[text()='Continue']");
    public void fillInBillingDetails(){
        //type first name
        typeText(_firstname,"john");
        //type last name
        typeText(_lastname,"Leon");
        //type email id
        typeText(_email,"abc@gmail.com");
        //select country from drop down
        selectElementByText(_country,"United Kingdom");
        //type city
        typeText(_city,"London");
        //type address1 line
        typeText(_address1,"26,Worchester Avenue");
        //type post code
        typeText(_zipcoad,"ha0 5ub");
        //type phone no
        typeText(_phoneNo,"07546328761");
        //click on continue
        clickOnElement(_continueButton);


    }
}
