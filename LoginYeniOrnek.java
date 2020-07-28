package com.testinium.aysu;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class LoginYeniOrnek extends MainTest {



    @Test
    public void login2Test(){

        getURL("https://www.gittigidiyor.com/uye-girisi");
        setById("L-UserNameField", "aysu");
        setById("L-PasswordField", "123456");
        clickById("gg-login-enter");

    }
}