package com.example.portal.Tests;

import com.example.portal.PageObjects.DepartmentPage;
import org.testng.annotations.Test;

public class DepartmentTest extends LoginPageTest  {


    DepartmentPage departmentPage;


    @Test
    public void Department() {
        search();
        departmentPage = new DepartmentPage(driver);
        departmentPage.clickMasterData().click();
        departmentPage.clickDepartment().click();
        departmentPage.clickCreateNew().click();
        departmentPage.addEngTitle().sendKeys("titleDesc1");
        departmentPage.addArabicTitle().sendKeys("تفاصيل العنوان");
        departmentPage.addEngDesc().sendKeys("Desc1");
        departmentPage.addArabicDesc().sendKeys("تفاصيل 1");
        departmentPage.clickSave().click();

    }

}


