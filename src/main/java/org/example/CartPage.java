package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends Utils{
    String expectedConfirmProductMessage = "Product Name is not Match";
    private By _productName1 = By.className("product-name");
    public void compareProductNameInCart() {
        //Get same product name in shopping cart
        String productName1 = getTextFromElement(By.className("product-name"));
        //print same product name
        System.out.println("Print product name: " + productName1);
        Assert.assertEquals(productName1, expectedConfirmProductMessage, "Product Name is not Match");


    }


}
