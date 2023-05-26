package org.example;

import org.openqa.selenium.By;

public class CheckOutBillingPage extends Utils {
    private By _firstName = By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastName = By.cssSelector("input#BillingNewAddress_LastName");
    private By _email = By.cssSelector("input#BillingNewAddress_Email");
    private By _country = By.cssSelector("select#BillingNewAddress_CountryId");
    private By _city = By.cssSelector("input#BillingNewAddress_City");
    private By _address1 = By.cssSelector("input#BillingNewAddress_Address1");
    private By _zipcoad = By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _phoneNo = By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _continueButton = By.xpath("//button[text()='Continue']");
    LoadProp loadProp = new LoadProp();
    public void fillInBillingDetails(){
        //type first name
        typeText(_firstName,loadProp.getProperty("firstName"));
        //type last name
        typeText(_lastName,loadProp.getProperty("lastName"));
        //type email id
        typeText(_email,loadProp.getProperty("email")+loadProp.getProperty("emailDomain"));
        //select country from drop down
        selectElementByText(_country,loadProp.getProperty("country"));
        //type city
        typeText(_city,loadProp.getProperty("city"));
        //type address1 line
        typeText(_address1,loadProp.getProperty("address1"));
        //type post code
        typeText(_zipcoad,loadProp.getProperty("zipcoad"));
        //type phone no
        typeText(_phoneNo,loadProp.getProperty("phoneNo"));
        //click on continue
        clickOnElement(_continueButton);


    }
}
