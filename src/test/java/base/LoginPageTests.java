package base;
import com.example.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTests {

   String MobileNumber="1110365465";

    /*@Test(priority = 1)
    public void openLoginPage() throws InterruptedException {
        LoginPage loginPage=HomePage.ClickLoginarea();
        Thread.sleep(2000);
        loginPage.setUsernameAndPassword(MobileNumber);
        loginPage.clickLogin();
        Thread.sleep(2000);
    }*/


  @Test(priority = 2)
    public void openSearchPage() throws InterruptedException {
        SearchPage searchPage=HomePage.ClickSearchArea();

        Thread.sleep(5000);
    }
    @Test(priority = 3)
    public void openProductDetailsPage() throws InterruptedException {
        ProductDetailsPage productDetailsPage = HomePage.ClickOnProduct();
        Thread.sleep(2000);
    }

    /*

      @Test(priority = 4)
    public void openFavouritePage() throws InterruptedException {
        FavoritePage favoritePage=HomePage.ClickFavoritearea();
        Thread.sleep(2000);
    }*/


}

