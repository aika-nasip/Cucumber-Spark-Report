package com.autopractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutoPracticeMainPage {
    public AutoPracticeMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(tagName="select")
    private WebElement  subjectHeadingSelect;

//    @FindBy(id="id_contact")
//    private WebElement subjectHeadingSelect;

    @FindBy(id="email")
    private WebElement emailInput;

    @FindBy(id="id_order")
    private WebElement orderInput;

    @FindBy(id="message")
    private WebElement messageTextArea;

    @FindBy(id="submitMessage")
    private WebElement sendButton;

    public void contactUsForm(String subjectHeading, String email, String order,String message){
         Select select = new Select(subjectHeadingSelect);
         select.selectByVisibleText(subjectHeading);
     }

}
