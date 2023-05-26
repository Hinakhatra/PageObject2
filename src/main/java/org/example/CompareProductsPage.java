package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductsPage extends Utils{
    String expectedCompareProductMessage = "There are still 2-Product in ClearList";
    private By _mobileName = By.xpath("//tr[@class=\"product-name\"]/td[2]/a");
    private By _giftCardName = By.xpath("//tr[@class='product-name']/td[3]/a");
    private By _clearList = By.className("clear-list");
    private By _cleatListMessage = By.className("no-data");
    LoadProp loadProp = new LoadProp();
    public void productsComparisonPage(){
        //print mobile name
        String actualMessage = getTextFromElement(_mobileName);
        System.out.println("Product Name: "+actualMessage);
        //print gift card name
        String actualMessage1 = getTextFromElement(_giftCardName);
        System.out.println("Product Name: "+actualMessage1);
        //click on clear list
        clickOnElement(_clearList);
        //print message after click on clear list
        String message = getTextFromElement(_cleatListMessage);
        System.out.println("My message: "+message);
        Assert.assertEquals(message,loadProp.getProperty("expectedCompareProductMessage"));

    }

}
