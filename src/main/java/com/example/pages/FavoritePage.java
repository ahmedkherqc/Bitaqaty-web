package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class FavoritePage {

    public static WebDriver driver;

    public FavoritePage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean getProductImage(){
        WebElement productImage= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/div[1]/a[1]"));
        return productImage.isDisplayed();
    }
    public String getProductName() {
        String productName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/div[1]/h3[1]")).getText();
        return productName;
    }

    public String getMerchantName() {
        String merchantName = driver.findElement(By.cssSelector("div:nth-child(1) section.favorite-page:nth-child(5) section.custome-card:nth-child(3) div.product-card:nth-child(1) > a.ctgLink:nth-child(5)")).getText();
        return merchantName;
    }

    public String getProductPrice() {
        String productPrice=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/div[1]/p[2]/span[1]")).getText();
        return productPrice;
    }

    public String getProductCurrency() {
        String productCurrency=driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/section[1]/div[2]/p[2]")).getText();
        return productCurrency;
    }

}
