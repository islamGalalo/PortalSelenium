package com.example.portal.Tests;

import com.example.portal.PageObjects.LoginPage;
import com.example.portal.PageObjects.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpPageTest extends base{
      SignUpPage signUpPage;


    @Test
    public void search() {
     signUpPage = new SignUpPage(driver);
        signUpPage.createAccountClick().click();
        signUpPage.chooseModule().click();
        signUpPage.clickModule().click();
        signUpPage.username().sendKeys("auto");
        signUpPage.firstname().sendKeys("airto");
        signUpPage.lastname().sendKeys("asiro");
        signUpPage.nationalID().sendKeys("489498484");
        signUpPage.phoneNO().sendKeys("583456879");
        signUpPage.email().sendKeys("auto@gmai.com");
        signUpPage.password().sendKeys("111111");
        signUpPage.confirmPassword().sendKeys("111111");
        signUpPage.signUpButton().submit();

    }

}
