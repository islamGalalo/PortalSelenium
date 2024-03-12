package com.example.portal.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {


    WebDriver driver;
    By createNewAccount = By.xpath("//a[normalize-space()='Create new account']");
    By chooseModule = By.xpath("//span[@aria-label='Select System Module']");
    By clickModule = By.xpath("//span[@class='ng-star-inserted']");
    By username = By.xpath("//input[@placeholder='Enter your Username...']");
    By firstname = By.xpath("//input[@placeholder='First Name']");
    By lastname = By.xpath("//input[@placeholder='Last Name']");
    By nationalID = By.xpath("//input[@placeholder='National ID']");
    By phoneNO = By.xpath("//input[@placeholder='Phone Number']");

    By email = By.xpath("//input[@placeholder='Email']");
//   By dateOfBirth = By.xpath("//input[@role='combobox']");
    By password = By.xpath(" //input[@placeholder='Password']");
    By confirmPassword = By.xpath("//input[@placeholder='Confirm Password']");
    By signUpButton = By.xpath("//button[@type='submit']");


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement createAccountClick() {
        return driver.findElement(createNewAccount);

    }

    public WebElement chooseModule() {
        return driver.findElement(chooseModule);

    }
    public WebElement clickModule(){
        return driver.findElement(clickModule);
    }

    public WebElement username() {
        return driver.findElement(username);

    }

    public WebElement firstname() {
        return driver.findElement(firstname);

    }

    public WebElement lastname() {
        return driver.findElement(lastname);

    }

    public WebElement nationalID() {
        return driver.findElement(nationalID);

    }

    public WebElement phoneNO() {
        return driver.findElement(phoneNO);

    }
    public WebElement email() {
        return driver.findElement(email);
    }


    public WebElement password() {
        return driver.findElement(password);

    }

    public WebElement confirmPassword() {
        return driver.findElement(confirmPassword);


    }

    public WebElement signUpButton() {
        return driver.findElement(signUpButton);


    }

}