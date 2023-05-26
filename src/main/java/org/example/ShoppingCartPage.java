package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    String expectedConfirmProductMessage = "Product Name is not Match";
   // String expectedComputerDetails = "No Details Match";
    private By _productName1 = By.className("product-name");
    private By _buildYourOwnComputername = By.cssSelector("a.product-name");
    private By _computerDetails = By.xpath("//td[@class='product']/div[1]");
    private By _termsCheckBox = By.cssSelector("input#termsofservice");
    private By _ckeckout = By.cssSelector("button#checkout");
    LoadProp loadProp = new LoadProp();
    public void compareProductNameInCart() {
        //Get same product name in shopping cart
        String productName1 = getTextFromElement(By.className("product-name"));
        //print same product name
        System.out.println("Print product name: " + productName1);
        Assert.assertEquals(productName1,loadProp.getProperty("expectedConfirmProductMessage"));

    }
    public void verifyDetailsOfBuildYourOwnComputer(){
        String productName = getTextFromElement(_buildYourOwnComputername);
        System.out.println("Product Name: "+productName);
        String actualComputerDetails  = getTextFromElement(_computerDetails);
        System.out.println(actualComputerDetails);
        Assert.assertNotEquals(actualComputerDetails,"No Details Match");
        //click on terms of service checkbox
        clickOnElement(_termsCheckBox);
        //click on checkout button
        clickOnElement(_ckeckout);

    }


}
