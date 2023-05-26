package org.example;

import org.openqa.selenium.By;

public class ProductPage extends Utils {
    private By _processor = By.cssSelector("select#product_attribute_1");
    private By _ram = By.cssSelector("select#product_attribute_2");
    private By _hdd = By.cssSelector("input#product_attribute_3_6");
    private By _os = By.cssSelector("input#product_attribute_4_9");
    private By _checkbox1 = By.cssSelector("input#product_attribute_5_10");
    private By _checkbox2 = By.cssSelector("input#product_attribute_5_11");
    private By _checkbox3 = By.cssSelector("input#product_attribute_5_12");
    private By _addToCart = By.cssSelector("button#add-to-cart-button-1");
    private By _shoppingCart = By.cssSelector("span.cart-label");
    LoadProp loadProp = new LoadProp();
    public void buildYourOwnComputer(){
        //select 2.5 GHz intel pentium processor
        selectElementByValue(_processor,loadProp.getProperty("processor"));
        //select 8GB in RAM
        selectElementByValue(_ram,loadProp.getProperty("ram"));
       // click on 320GB in HDD
        clickOnElement(_hdd);
        //click on vista premium in OS
        clickOnElement(_os);
        //for uncheck checkbox1
        clickOnElement(_checkbox1);
        //click on all 3 check box
        clickOnElement(_checkbox1);
        clickOnElement(_checkbox2);
        clickOnElement(_checkbox3);
        //click on add to cart
        clickOnElement(_addToCart);
        //click on shopping cart top right corner
        clickOnElement(_shoppingCart);



    }

}
