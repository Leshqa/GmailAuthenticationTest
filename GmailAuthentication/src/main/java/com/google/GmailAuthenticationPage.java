package com.google;

import static com.codeborne.selenide.Selenide.*;

public class GmailAuthenticationPage {

    public GmailAuthenticationPage inputUserName() {
        $("#Email").clear();
        $("#Email").setValue(Config.user.getUserName()).pressEnter();
        return this;
    }

    public GmailAuthenticationPage inputUserPassword() {
        $("#Passwd").clear();
        $("#Passwd").setValue(Config.user.getUserPassword()).pressEnter();
        return this;
    }

}
