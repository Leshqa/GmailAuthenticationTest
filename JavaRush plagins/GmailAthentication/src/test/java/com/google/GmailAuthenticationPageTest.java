package com.google;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GmailAuthenticationPageTest extends TestBase {

    @Test(testName = "verify Gmail autehntication test")
    public void login() {
        onGooglePage()
                .inputUserName()
                .inputUserPassword();
        $(".aKw").shouldBe(visible);
    }

}
