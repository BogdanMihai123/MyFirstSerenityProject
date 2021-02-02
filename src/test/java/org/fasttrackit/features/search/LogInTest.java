package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LogInTest {

    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validCredentialsLoginTest(){

        loginSteps.navigatetologin();
        loginSteps.setEmail("cosmin@fasttrackit.org");
        loginSteps.setPass("123456");
        loginSteps.clickloginbutton();
        loginSteps.hellomessage("Cosmin Fas");
    }
}
