package com.company.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import java.awt.*;
import java.util.concurrent.TimeUnit;

@Description("This is an example test suite")
public class MyTest extends BaseTest {
    @Title("Successful test")
    @Test
    public void testMailLogin() throws AWTException {
        WebDriver driver = app.common.getDriver();
        app.login.loginValidUser();
        String userName = app.home.getUserName();
        Assert.assertEquals(userName, "jj", "user is not login");

    }
}
