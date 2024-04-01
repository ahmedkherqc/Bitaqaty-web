package base;
import com.example.pages.FavoritePage;
import com.example.pages.ProductDetailsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductDetailsPageTests extends LoginPageTests{

    String product_name1="بطاقة شحن موبايلي - 20 ريال";

    String merchant_name1="بطاقات شحن موبايلى - السعودية";
    String price_amount1="20";
    String price_currency1= "ر.س";

    //cartPageURl=


    public ProductDetailsPage productDetailsPage=new ProductDetailsPage(driver);

    @Test(priority =4)

    public void verify_product_image() throws InterruptedException {
        Thread.sleep(1000);

        Assert.assertTrue(productDetailsPage.getProductImage(),"product dosn't exsit");
    }

    @Test(priority=5)

    public void verify_Product_Name() throws InterruptedException {


        //FavoritePage favoritePage=new FavoritePage(driver);
        Thread.sleep(1000);
        String actualResult= productDetailsPage.getProductName();
        String expectedResult=product_name1;


        System.out.println("Product 1 info: ");
        System.out.println("Produt expected name is : "+product_name1);
        System.out.println("Produt actual name is : "+actualResult);


        Thread.sleep(1000);
        Assert.assertEquals(actualResult,expectedResult);

        Thread.sleep(1000);

    }

    @Test(priority=6)
    public void verify_Merchant_Name() throws InterruptedException {
        //FavoritePage favoritePage=new FavoritePage(driver);
        String expectedResult=merchant_name1;
        String actualResult= productDetailsPage.getMerchantName();
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("Merchant expected Name is : "+actualResult);
        System.out.println("Merchant actual Name is : "+actualResult);

        Thread.sleep(1000);
    }

    @Test(priority=7)
    public void verify_product_price() throws InterruptedException {
        String expectedResult= price_amount1;
        String actualResult= productDetailsPage.getProductPrice();
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("product expected price is : "+expectedResult);
        System.out.println("product price is : "+actualResult);
        Thread.sleep(1000);
    }

    @Test(priority=8)
    public void verify_product_currency() throws InterruptedException {
        String expectedResult= price_currency1;
        String actualResult= productDetailsPage.getProductCurrency();

        System.out.println("product expected price currency  is : "+expectedResult);
        System.out.println("product actual price currency  is : "+actualResult);
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("product price is : "+actualResult);
        Thread.sleep(1000);
    }
    @Test(priority=9)
    public void openCartPage()
    {
        //String expectedResult=cartPageURl;
        productDetailsPage.clickOnAddToCart();
        String actualResult = driver.getCurrentUrl();

    }


}
