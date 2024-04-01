package com.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public WebDriver driver;

    public SearchPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void AddToFavourite(String userName,String password)
    {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/div[1]/span[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/div[2]/span[1]")).click();
    }

}
