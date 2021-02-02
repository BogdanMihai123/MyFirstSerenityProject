package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/login/")
public class LogInpage extends PageObject {

    @FindBy(css="#email")
    private WebElementFacade emailField;
    @FindBy(css="#pass")
    private WebElementFacade passField;
    @FindBy(css="button[id*='send2']")
    private WebElementFacade loginbutton;

    public void setEmailField(String username){
        typeInto(emailField,username);
    }

    public void setPassField(String password){
        typeInto(passField,password);
    }

    public void clickLoginButton(){
        clickOn(loginbutton);
    }

}
