package com.example.portal.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class base {
WebDriver driver;

    @BeforeTest
    public void setUp() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://clouddev.it-cores.com:8800/");

    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
