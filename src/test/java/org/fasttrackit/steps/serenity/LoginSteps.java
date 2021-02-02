package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LogInpage;

public class LoginSteps {

    private HomePage homePage;
    private LogInpage loginpage;
    private AccountPage accountPage;

    @Step
    public void navigatetologin(){

        homePage.open();
        homePage.clickaccountlink();
        homePage.clickloginlink();
    }

    @Step
    public void setEmail(String email){
        loginpage.setEmailField(email);
    }

    @Step
    public void setPass(String pass){
        loginpage.setPassField(pass);
    }

    @Step
    public void clickloginbutton(){
        loginpage.clickLoginButton();
    }

    @Step
    public void login(String username, String password){
        navigatetologin();
        setEmail(username);
        setPass(password);
        clickloginbutton();
    }

    @Step
    public void hellomessage(String username){
        accountPage.verifyHelloMessage(username);
    }
}
