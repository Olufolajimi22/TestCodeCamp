import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TheKongaTest {
    private By ModalCardbutton = By.xpath("//*[@id=\"channel-template\"]/div[2]/div/div[2]/button/div/span[2]");
    private By ModalCardNumber = By.id("card-number");
    private By ModalDate = By.id("expiry");
    private By ModalCVV = By.id("cvv");
    private By ModalPayNowButton = By.id("validateCardForm");
    private By CloseIframe = By.xpath("/html/body/section/section/section/div[2]/div[1]/aside");

    //import selenium WebDriver
    private WebDriver driver;
    @Test

    public void start() throws InterruptedException {
        //1. Open Chrome browser
        //driver = new ChromeDriver();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
        //locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //2. input your Konga URL (https://www.konga.com/")
        //Test 1.Verify that konga Url displayed
        driver.get("https://www.konga.com/");
        if (driver.getCurrentUrl().contains("https://www.konga.com/"))
            //Pass
            System.out.println("Correct Webpage");
        else
            //Fail
        System.out.println("Wrong Webpage");
        Thread.sleep(5000);
        //3.Maximize page
        driver.manage().window().maximize();
        //1.Visit Konga Url Page
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);
        //2.maximize the browser
        driver.manage().window().maximize();
    }

        @Test(priority = 1)
                public void positiveLogin() throws InterruptedException {
            //3.click on the Login Page
            //Test 2.Verify that user can log in with valid email and password
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
            //4.Input Email in Email Address Field
            driver.findElement(By.id("username")).sendKeys("lawalfolashoyoye@gmail.com");
            //5.Input Password in password field
            driver.findElement(By.id("password")).sendKeys("Olufolajimi14");
            //6.Click on login button
            //Test 3.Verify that user is successfully logged in
            driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
            Thread.sleep(5000);

        }

        @Test(priority = 2)
                public void ClickcomputersandAccessories() throws InterruptedException {
            //7.Click in the Computers and accessories
            //Test 4.Verify that computer and accessories page displayed
            //Test 5.Verify that user successfully clicked on computer and accessories
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
            String expectedUrl = "https://www.konga.com/category/accessories-computing-5227";
            String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl))
                //pass
                System.out.println("Correct Webpage");
            else
                //Fail
                System.out.println("Wrong Webpage");
            Thread.sleep(5000);

        }
        @Test(priority = 3)
                public void clicklaptopsubcategories() throws InterruptedException {
            //8.Click on laptop sub categories
            //Test 6.Verify laptop subcategory page displayed
            //Test 7.Verify that user successfully clicked on Laptop category
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a")).click();
            String expectedUrl = "https://www.konga.com/category/accessories-computing-5227";
            String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl))
                //pass
                System.out.println("Correct Webpage");
            else
                //Fail
                System.out.println("Wrong Webpage");
            Thread.sleep(5000);

        }
        @Test(priority = 4)
                public void Clickapplemacbook() throws InterruptedException {
            //9.Click on Apple macbooks
            //Test 8.Verify that Apple macbooks displayed
            //Test 9.Verify that user successfully clicked on apple macbook
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li/a/ul/li[1]/a/label/span")).click();
            String expectedUrl = "https://www.konga.com/category/accessories-computing-5227";
            String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl))
                //pass
                System.out.println("Correct Webpage");
            else
                //Fail
                System.out.println("Wrong Webpage");
            Thread.sleep(5000);

        }
        @Test(priority = 5)
                public void Addanitemtocart() throws InterruptedException {
            //10.Add an item to the cart
            //Test 10.Verify that add item page displayed
            //Test 11.Verify that user can add item to cart
            //Test 12.Verify that user added item successfully
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/section/section/section/ul/li[1]/div/div/div[2]/form/div[3]/button")).click();
            String expectedUrl = "https://www.konga.com/category/accessories-computing-5227";
            String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl))
                //pass
                System.out.println("Correct Webpage");
            else
                //Fail
                System.out.println("Wrong Webpage");
            Thread.sleep(5000);
        }

             @Test(priority =6 )
             public void clickmycart() throws InterruptedException {
             //11.Click My cart
             //13.Verify that  my cart is displayed
             //14.Verify that user can view my cart to check order
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]")).click();
            String expectedUrl = "https://www.konga.com/category/accessories-computing-5227";
            String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl))
                //pass
                System.out.println("Correct Webpage");
            else
                //Fail
                System.out.println("Wrong Webpage");
            Thread.sleep(5000);
        }

        @Test(priority = 7)
                public void ClickCheckout() throws InterruptedException {
            //11.Click Checkout
            //15.Verify that checkout option is on the list
            //16.Verify that user can check out
            //17.Verify that user checked out successfully
            driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
            String expectedUrl = "https://www.konga.com/checkout/complete-order";
            String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl))
                //pass
                System.out.println("Correct Webpage");
            else
                //Fail
                System.out.println("Wrong Webpage");
            Thread.sleep(5000);
            }

            @Test(priority = 8)
            public void Deliveryoption() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
            String expectedUrl = "https://www.konga.com/checkout/complete-order";
            String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl ))
                //pass
                System.out.println("Correct Webpage");
            else
                //Fail
                System.out.println("Wrong Webpage");
            Thread.sleep(5000);
            }
            @Test(priority = 9)
                    public void paymentoption() throws InterruptedException {
                //13.Click on payment option
                //Test 21.Verify that user can select payment option
                //Test 22.Verify that user selected payment option successfully
                driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
                String expectedUrl = "https://www.konga.com/checkout/complete-order";
                String actualUrl = driver.getCurrentUrl();
                if (actualUrl.contains(expectedUrl))
                    //pass
                    System.out.println("Correct Webpage");
                else
                    //Fail
                    System.out.println("Wrong Webpage");
                Thread.sleep(5000);

            }

            @Test(priority = 10)
            public void continuetomakepayment() throws InterruptedException {
                //14 Click continue to make payment
                //Test 23.verify that continue to make payment is on the list
                //Test 24.Verify that user can continue to make payment
                driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
                String expectedUrl = "https://www.konga.com/checkout/complete-order";
                String actualUrl = driver.getCurrentUrl();
                if (actualUrl.contains(expectedUrl))
                    //pass
                    System.out.println("Correct Webpage");
                else
                    //Fail
                    System.out.println("Wrong Webpage");
                Thread.sleep(5000);
            }

            @Test(priority = 11)
            public void ClickCard() throws InterruptedException {
            //Click card
                click(ModalCardbutton);
                Thread.sleep(500);

            }

    private void click(By modalCardbutton) {
    }
@Test(priority = 12)
public void CardDetails() throws InterruptedException {
        //input invalid card number
    setText(ModalCardNumber, 34567);
    setText(ModalDate, 02/23);
    setText(ModalCVV, 242);
    click(ModalPayNowButton);
    String expectedUrl = "https";
    String actualUrl = driver.getCurrentUrl();
    if (actualUrl.contains(expectedUrl))
    //pass
    System.out.println("invalid card number");
    else
        System.out.println("valid card number");
    Thread.sleep(5000);
}



    private void setText(By modalCardNumber, int i) {
    }

    @AfterTest
    public void closeBrowser() {
                //Quit the browser
                driver.quit();


    }
}
