package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    String expectedConfirmProductMessage = "Product Name is not Match";
   // String expectedComputerDetails = "No Details Match";
    private By _productName1 = By.className("product-name");
    private By _computerDetails = By.cssSelector("td.product");
    private By _termsCheckBox = By.cssSelector("input#termsofservice");
    private By _ckeckout = By.cssSelector("button#checkout");
    public void compareProductNameInCart() {
        //Get same product name in shopping cart
        String productName1 = getTextFromElement(By.className("product-name"));
        //print same product name
        System.out.println("Print product name: " + productName1);
        Assert.assertEquals(productName1, expectedConfirmProductMessage, "Product Name is not Match");

    }
    public void verifyDetailsOfBuildYourOwnComputer(){

        String actualComputerDetails  = getTextFromElement(_computerDetails);
        System.out.println(actualComputerDetails);
        //Assert.assertEquals(actualComputerDetails,expectedComputerDetails,"No Details Match");
        //click on terms of service checkbox
        clickOnElement(_termsCheckBox);
        //click on checkout button
        clickOnElement(_ckeckout);

    }


}
