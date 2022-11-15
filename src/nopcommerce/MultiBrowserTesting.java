package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowserTesting {
   //declare global variable//
    static String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;
    //declare main method //
    public static void main(String[] args) {

        //declare scanner for input //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter browser name :");
        String browser = scanner.next();

        scanner.close();
       //try and catch block//
        try {
            //declare if else statment //
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");  //open in chrome//
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");//open in firefox//
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.msedge.driver", "drivers/msedgedriver.exe");//open in edge//
                driver = new EdgeDriver();

            } else {
                System.out.println("Wrong browser ");
            }
            driver.get(baseurl); // get baseurl//
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


            System.out.println("Title of the page : " + driver.getTitle());
            //print the current URL//
            System.out.println(" Current URL : " + driver.getCurrentUrl());
            //print the page source//
            System.out.println("Page source  : " + driver.getPageSource());
            //enter email into the  emailfield //
            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("siddhi.munim@gmail.com");
            //enter password to password field//
            WebElement passwordField = driver.findElement(By.id("Password"));
            passwordField.sendKeys("123test");

        } catch(Exception e) {
            String massage = e.getMessage();


        }
        driver.quit();

    }

}
