package com.example.portal.Tests;

import com.example.portal.PageObjects.UsersPage;
import org.testng.annotations.Test;

public class UsersTest extends LoginPageTest {
    UsersPage usersPage;

    @Test
    public void AddUser() {
         usersPage = new UsersPage(driver);
        usersPage.clickUserManagement();
        usersPage.clickCreateUser();
        usersPage.addUsername();
        usersPage.addUserType();
        usersPage.addNameEn();
        usersPage.addNameAR();
        usersPage.addEmail();
        usersPage.addPhone();
        usersPage.addPassword();
        usersPage.addConfirmPassword();
        usersPage.addDepartment();
        usersPage.chooseDepartment();
        usersPage.clickSave();

    }
}
