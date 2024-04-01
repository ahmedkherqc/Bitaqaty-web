package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {


    public static WebDriver driver;
    //WebDriver driver;

    public ProductDetailsPage (WebDriver driver) {
        this.driver = driver;
    }

    public boolean getProductImage(){
        WebElement productImage= driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/section[1]/div[1]/img[1]"));
        return productImage.isDisplayed();
    }

    public String getProductName() {
        String productName = driver.findElement(By.xpath("//h2[contains(text(),'بطاقة شحن موبايلي - 20 ريال')]")).getText();
        return productName;
    }

    public String getMerchantName() {
        String merchantName = driver.findElement(By.xpath("//p[contains(text(),'بطاقات شحن موبايلى - السعودية')]")).getText();
        return merchantName;
    }

    public String getProductPrice() {
        String productPrice=driver.findElement(By.xpath("//span[contains(text(),'20')]")).getText();
        return productPrice;
    }

    public String getProductCurrency() {
        String productCurrency=driver.findElement(By.xpath("//body[1]/div[1]/section[1]/section[1]/div[1]/div[2]/p[1]")).getText();
        return productCurrency;
    }

    public boolean clickOnAddToCart()
    {
        driver.findElement(By.xpath("//body[1]/div[1]/section[1]/section[1]/div[1]/div[2]/button[1]")).click();
        WebElement cartSection=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]"));
        return cartSection.isDisplayed();
    }

    


}
