package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTesting {
    //declare main method//
    public static void main (String[]args){

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//object declare//
        //launch the url//
        driver.get(baseUrl);
        //maximum window//
        driver.manage().window().maximize();
          //we give implicit time to driver //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print title of the page//
        System.out.println("Title of the page : " + driver.getTitle());
        //print the current URL//
        System.out.println("Current URL :" + driver.getCurrentUrl());
        //print the page course//
        System.out.println("Page source : " + driver.getPageSource());
        //enter email into the emailfield //
        WebElement emailField = driver.findElement(By.id ("Email"));
        emailField.sendKeys("123abc@gmail.com");
        //password field elements//
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("234xyz");
        //close the browser//
        driver.quit();












    }
}
