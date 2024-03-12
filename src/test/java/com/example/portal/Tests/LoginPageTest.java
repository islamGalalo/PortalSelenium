package com.example.portal.Tests;

import com.example.portal.PageObjects.LoginPage;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


public class LoginPageTest extends base{

     LoginPage loginPage;


    @Test
    public void search() {
        loginPage = new LoginPage(driver);
        loginPage.Username().sendKeys("admin");
        loginPage.Password().sendKeys("@dm!n@C0r$951%");
        loginPage.Submit().click();

    }

}
