package base;

import com.example.pages.FavoritePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FavouriteTests extends LoginPageTests {

    String product_name1="بطاقة شحن برافو 50 ريال";

    String merchant_name1="League of Legends - Riot";
    String price_amount1="99";
    String price_currency1= "ر.س";


    public FavoritePage favoritePage=new FavoritePage(driver);



    //assert product image
    @Test(priority =3)

    public void verify_product_image() throws InterruptedException {
        //FavoritePage favoritePage=new FavoritePage(driver);
        Thread.sleep(1000);

        Assert.assertTrue(favoritePage.getProductImage(),"product dosn't exsit");
    }

    //assert product name
    @Test(priority=4)

    public void verify_Product_Name() throws InterruptedException {


        //FavoritePage favoritePage=new FavoritePage(driver);
        Thread.sleep(1000);
        String actualResult= favoritePage.getProductName();
        String expectedResult=product_name1;


        System.out.println("Product 1 info: ");
        System.out.println("Produt Name is : "+actualResult);
        System.out.println("expected is : "+product_name1);

        Thread.sleep(1000);
        Assert.assertEquals(actualResult,expectedResult);

        Thread.sleep(1000);

    }

    //assert merchant name

    @Test(priority=5)
    public void verify_Merchant_Name() throws InterruptedException {
        //FavoritePage favoritePage=new FavoritePage(driver);
        String expectedResult=merchant_name1;
        String actualResult= favoritePage.getMerchantName();
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("Merchant Name is : "+actualResult);

        Thread.sleep(1000);
    }

    @Test(priority=6)
    public void verify_product_price() throws InterruptedException {
        String expectedResult= price_amount1;
        String actualResult= favoritePage.getProductPrice();
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("product price is : "+actualResult);
        Thread.sleep(1000);
    }

    @Test(priority=7)
    public void verify_product_currency() throws InterruptedException {
        String expectedResult= price_currency1;
        String actualResult= favoritePage.getProductPrice();

        System.out.println("product expected price currency  is : "+expectedResult);
        System.out.println("product expected price currency  is : "+actualResult);
        //Assert.assertEquals(actualResult.contains(expectedResult),expectedResult);
        System.out.println("product price is : "+actualResult);
        Thread.sleep(1000);
    }
}



