package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MicroEdgeTesting {
    //declare main method//
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.msedge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //launch the Url//
        driver.get(baseUrl);
        //maximise URL//
        driver.manage().window().maximize();
        //we give implicit time to driver//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //print title of the page//
        System.out.println("Title of the page : " + driver.getTitle());
        //print the current URL//
        System.out.println( " Current URL : "  + driver.getCurrentUrl());
        //print the page source//
        System.out.println("Page source  : "  + driver.getPageSource());
        //enter email into the  emailfield //
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("siddhi@gmail.com");
        //enter password to password field//
        WebElement passwordField =driver.findElement(By.id("Password"));
        passwordField.sendKeys("1234test");
        //close the browser//
        driver.quit();

    }
}
