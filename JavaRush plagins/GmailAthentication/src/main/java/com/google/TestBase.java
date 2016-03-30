package com.google;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TestBase {

    public GmailAuthenticationPage onGooglePage() {

        GmailAuthenticationPage page = open(Config.BASE_URL, GmailAuthenticationPage.class);

        return page;
    }
}