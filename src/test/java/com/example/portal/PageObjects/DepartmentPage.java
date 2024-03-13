package com.example.portal.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepartmentPage {
    WebDriver driver;
    By clickMasterData = By.xpath("//span[normalize-space()='Master Data']");
    By clickDepartment = By.xpath("//span[normalize-space()='Departments']");
    By clickCreateNew = By.xpath("//span[normalize-space()='Create New']");
    By addEngTitle = By.cssSelector("input[formcontrolname='titleEn']");
    By addArabicTitle = By.cssSelector("input[formcontrolname='titleAr']");
    By addEngDesc = By.cssSelector("[formcontrolname='descriptionEn']");
    By addArabicDesc = By.cssSelector("[formcontrolname='descriptionAr']");

    By clickSave = By.xpath("//span[normalize-space()='Save']");

    public DepartmentPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement clickMasterData() {
        return driver.findElement(clickMasterData);

    }
    public WebElement clickDepartment() {
        return driver.findElement(clickDepartment);

    }
    public WebElement clickCreateNew() {
        return driver.findElement(clickCreateNew);

    }
    public WebElement addEngTitle() {
        return driver.findElement(addEngTitle);

    }
    public WebElement addArabicTitle() {
        return driver.findElement(addArabicTitle);

    }
    public WebElement addEngDesc() {
        return driver.findElement(addEngDesc);

    }
    public WebElement addArabicDesc() {
        return driver.findElement(addArabicDesc);

    }
    public WebElement clickSave() {
        return driver.findElement(clickSave);

    }
    

}
