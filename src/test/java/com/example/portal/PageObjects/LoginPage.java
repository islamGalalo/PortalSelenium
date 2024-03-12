package com.example.portal.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    By username = By.xpath("//input[@placeholder='Enter your Username...']");
    By password = By.xpath("//input[@type='password']");
    By submit = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement Username() {
        return driver.findElement(username);

    }

    public WebElement Password() {
        return driver.findElement(password);
    }

    public WebElement Submit() {
        return driver.findElement(submit);
    }

}
