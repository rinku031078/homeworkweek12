package electronics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ElectronicsTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";
    //WebDriver driver;


    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        mouseHoverToClickElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
        String expectedResult = "Cell phones";
        WebElement Actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        String realMsg = Actualresult.getText();
        Assert.assertEquals("Verify the text is not match", expectedResult, realMsg);
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        mouseHoverToClickElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
        Thread.sleep(2000);
        String expectedResult = "Cell phones";
        WebElement Actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        String realMsg = Actualresult.getText();
        Assert.assertEquals("Verify the text is not match", expectedResult, realMsg);
        clickOnElement(By.xpath("//a[contains(text(),'List')]"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//a[text()='Nokia Lumia 1020']"));
        String expectedText = "Nokia Lumia 1020";
        WebElement ActualText = driver.findElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
        String RealText = ActualText.getText();
        Assert.assertEquals("Verify the text is not match", expectedText, RealText);
        String expectedPrice = "$349.00";
        WebElement ActualPrice = driver.findElement(By.xpath("//span[@id='price-value-20']"));
        String RealPrice = ActualPrice.getText();
        Assert.assertEquals("Verify the text is not match", expectedPrice, RealPrice);
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).sendKeys("2");
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));
        //The product has been added to your shopping cart
        String expectedProductAdd = "The product has been added to your shopping cart";
        WebElement ActualProductAdd = driver.findElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"));
        String RealProductAdd = ActualProductAdd.getText();
        Assert.assertEquals("Verify the text is not match", expectedProductAdd, RealProductAdd);
        clickOnElement(By.xpath("//span[@class='close']"));
        Thread.sleep(2000);
        mouseHoverToElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        String expectedShoppingCart = "Shopping cart";
        WebElement ActualshoppingCart = driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        String RealshoppingCart = ActualshoppingCart.getText();
        Assert.assertEquals("Verify the text is not match", expectedShoppingCart, RealshoppingCart);
        String expecteditemQuantity = "(2)";
        WebElement ActualitemQuantity = driver.findElement(By.xpath("//span[@class='cart-qty']"));
        String RealitemQuantity = ActualitemQuantity.getText();
        Assert.assertEquals("Verify the value is not match", expecteditemQuantity, RealitemQuantity);
        String expectedtotal = "$698.00";
        WebElement ActualTotal = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[1]"));
        String RealTotal = ActualTotal.getText();
        Assert.assertEquals("Verify the value is not match", expectedtotal, RealTotal);
        Thread.sleep(2000);
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        clickOnElement(By.xpath("//button[@id='checkout']"));
        String expectedText1 = "Welcome, Please Sign In!";
        WebElement ActualText1 = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String RealText1 = ActualText1.getText();
        Assert.assertEquals("Verify the text is not match", expectedText1, RealText1);
        clickOnElement(By.xpath("//button[contains(text(),'Register')]"));
        String expectedText2 = "Register";
        WebElement ActualText2 = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String RealText2 = ActualText2.getText();
        Assert.assertEquals("Verify the value is not match", expectedText2, RealText2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Het");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Tripathi");

        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("het12345@yahoo.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("het1203788");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("het1203788");
        clickOnElement(By.xpath("//button[@id='register-button']"));
        String expectedRegister = "Your registration completed";
        WebElement ActualRegister = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String RealRegister = ActualRegister.getText();
        Assert.assertEquals("Registration is not Completed", expectedRegister, RealRegister);
        clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
        String expectedShopCart = "Shopping cart";
        WebElement ActualShopCart = driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        String RealshopCart = ActualShopCart.getText();
        Assert.assertEquals("Registration is not Completed", expectedShopCart, RealshopCart);
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        clickOnElement(By.xpath("//button[@id='checkout']"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("JIRA");
        selectValueFromdropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "230");
        selectValueFromdropDown(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"), "0");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Harrow");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("110");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys("Kenton Road");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("Ha3 8bl");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("07969476490");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_FaxNumber']")).sendKeys("02085704852");
        clickOnElement(By.xpath("//button[@onclick='Billing.save()']"));
        clickOnElement(By.xpath("//input[@id='shippingoption_2']"));
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
        clickOnElement(By.cssSelector("#paymentmethod_1"));
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
        Thread.sleep(1000);

        selectValueFromdropDown(By.id("CreditCardType"), "visa");
        sendTextToElement(By.id("CardholderName"), "Mr H Tripathi");  //name on card
        sendTextToElement(By.id("CardNumber"), "4012888888881881");
        selectValueFromdropDown(By.id("ExpireMonth"), "8"); //month
        selectValueFromdropDown(By.id("ExpireYear"), "2025");
        sendTextToElement(By.id("CardCode"), "570");
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
        Thread.sleep(2000);
        String expectedCreditCard = "Credit Card";
        WebElement ActualCreditCard = driver.findElement(By.xpath("//span[normalize-space()='Credit Card']"));
        String RealCreditCard = ActualCreditCard.getText();
        Assert.assertEquals("Text is not display", expectedCreditCard, RealCreditCard);
        String expectDayAir = "(2nd Day Air)";
        WebElement ActualdayAir = driver.findElement(By.xpath("//span[@class='selected-shipping-method']"));
        String RealDayAir = ActualdayAir.getText();
        Assert.assertEquals("Text is not display", expectDayAir, RealDayAir);
        String expectvalue = "$698.00";
        Thread.sleep(2000);
        WebElement Actualvalue = driver.findElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]"));
        String Realvalue = Actualvalue.getText();
        Assert.assertEquals("Text is not display", expectvalue, Realvalue);
        clickOnElement(By.xpath("//button[normalize-space()='Confirm']"));
        String expectThank = "Thank you";
        WebElement ActualThank = driver.findElement(By.xpath("//h1[normalize-space()='Thank you']"));
        String RealThank = ActualThank.getText();
        Assert.assertEquals("Text is not display", expectThank, RealThank);
        String expectSuccess = "Your order has been successfully processed!";
        WebElement ActualSuccess = driver.findElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']"));
        String RealSuccess = ActualSuccess.getText();
        Assert.assertEquals("Order has not been sucessfully", expectSuccess, RealSuccess);
        Thread.sleep(1000);
        clickOnElement(By.xpath("//button[@onclick='setLocation(\"/\")']"));  //last continue click
        String expectedWelcomeMessageShown = "Welcome to our store";
        String actualWelcomeMessageShown = getTextFromElement(By.xpath("//h2[text()='Welcome to our store']"));
        Assert.assertEquals("User Is Not On Main Page", expectedWelcomeMessageShown, actualWelcomeMessageShown);
        clickOnElement(By.xpath("//a[@href='/']"));
        String url = "https://demo.nopcommerce.com/";
        String realUrl = driver.getCurrentUrl();
        Assert.assertEquals("Wrong Url", url, realUrl);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }

}
