package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    static WebDriver driver;
    public HomePage(WebDriver driver )
    {this.driver=driver;}

    /* public static LoginPage ClickLoginarea(){
        driver.findElement(By.className("login")).click();
        return new LoginPage(driver);
    }*/
    public static SearchPage ClickSearchArea() throws InterruptedException {
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Mobily Card SAR 20");
        //driver.findElement(By.xpath("//body/div[@id='__next']/nav[1]/div[2]/div[1]/div[1]/form[1]/input[1]")).sendKeys("موبايلي - 20 ريال OS");
        driver.findElement(By.className("search")).click();
        Thread.sleep(9000);
        return new SearchPage(driver);

    }

    public static FavoritePage ClickFavoritearea(){
        driver.findElement(By.cssSelector("nav:nth-child(1) div.navBottom div.rightSection div.iconContainer:nth-child(5) > a:nth-child(2)")).click();
        return new FavoritePage(driver);
    }

    public static ProductDetailsPage ClickOnProduct(){
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/section[1]/div[1]/a[1]")).click();
        return new ProductDetailsPage(driver);
    }

}
