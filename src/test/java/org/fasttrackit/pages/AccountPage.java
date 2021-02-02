package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject {

    @FindBy(css = "p[class*='hello']")
    private WebElementFacade hellomsg;

    public void verifyHelloMessage(String userName){
        hellomsg.shouldContainText("Hello, "+userName+"!");
    }
}
