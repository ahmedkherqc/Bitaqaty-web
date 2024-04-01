package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void setUsernameAndPassword(String MobileNumber)
    {
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/input[1]")).sendKeys(MobileNumber);
    }


    public HomePage clickLogin()
    {
        driver.findElement(By.xpath("//button[contains(text(),'إرسال رمز التحقق')]")).click();
        return new HomePage(driver);
    }


}
