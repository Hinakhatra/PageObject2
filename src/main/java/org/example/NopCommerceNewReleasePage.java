package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NopCommerceNewReleasePage extends Utils{
    private By _title = By.cssSelector("input.enter-comment-title");
    private By _comment = By.cssSelector("textarea.enter-comment-text");
    private By _newCommentButton = By.xpath("//button[text()='New comment']");
    private By _newCommentMessage =By.cssSelector("div.result");
    private By _commentList = By.cssSelector("div.comment-list");
    public void fillInNewReleaseDetails(){
        //Type on title
        typeText(_title,"Hi");
        //Type comment
        typeText(_comment,"Good Products");
        //click on new comment button
        clickOnElement(_newCommentButton);
        String actualComment = getTextFromElement(_newCommentMessage);
        //print comment
        System.out.println("Comment Message: "+actualComment);
        Assert.assertEquals(actualComment,"News comment is successfully added.");
        //scroll down to see latest comment in list
        scrollViewElement(_commentList);


    }
}
