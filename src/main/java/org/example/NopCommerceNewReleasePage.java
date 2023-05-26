package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

public class NopCommerceNewReleasePage extends Utils{
    String comment;
    private By _title = By.cssSelector("input.enter-comment-title");
    private By _comment = By.cssSelector("textarea.enter-comment-text");
    private By _newCommentButton = By.xpath("//button[text()='New comment']");
    private By _pageTitle = By.cssSelector("div.page-title");
    private By _newCommentMessage =By.cssSelector("div.result");
    private By _commentList = By.cssSelector("div.comment-list");
    LoadProp loadProp = new LoadProp();
    public void fillInNewReleaseDetails(){
        //Type on title
        typeText(_title,loadProp.getProperty("newReleaseTitle"));
        //Type comment
        typeText(_comment,loadProp.getProperty("newReleaseComment"));
        //click on new comment button
        clickOnElement(_newCommentButton);
        //page Title
        String actualTitle = getTextFromElement(_pageTitle);
        System.out.println("Title of the page is:"+actualTitle);
        //print Title
        Assert.assertEquals(actualTitle,"nopCommerce new release!");

        String actualComment = getTextFromElement(_newCommentMessage);
        //print comment
        System.out.println("Comment Message: "+actualComment);
        Assert.assertEquals(actualComment,"News comment is successfully added.");
        //scroll down to see latest comment in list
        scrollViewElement(_commentList);
        ArrayList<String>commentList = new ArrayList<>();
        for (WebElement comment:driver.findElements(_commentList)) {
            commentList.add(comment.getText());

        }
        String lastComment = commentList.get(commentList.size()-1);
        if(lastComment.equalsIgnoreCase(comment)){
            String newCommentAdded = lastComment;
            Assert.assertEquals(newCommentAdded,lastComment,"New comment not added at the end of the list");
            System.out.println("New comment added at the end of the list");

        }


    }

}
