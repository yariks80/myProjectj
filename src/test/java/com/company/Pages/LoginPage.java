package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class LoginPage extends BasePage {

    @FindBy(name = "login")
    private WebElement inputLogin;

    @FindBy(name = "pass")
    private WebElement inputPassword;

    @FindBy(name = "domn")
    private WebElement domen;

    @FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
    private WebElement btnSubmit;


    public void login(String name, String password) {
        log.info(String.format("Login user name -%s , password -%s",name,password));
        inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnSubmit.click();

    }
}
