package project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.Color;

import java.awt.*;
import java.time.Duration;

public class Project_Act5 {

    public static void main(String[] args) {

        String s = System.setProperty("webdriver.gecko.driver", "/Users/sushma/Documents/geckodriver");
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/crm");

        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));

        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"bigbutton\"]"));

        login.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String navColor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toolbar\"]"))).getCssValue("color");

        System.out.println("Navigation Bar color in rgba is:"+navColor);

        String navBarHexColor = Color.fromString(navColor).asHex();

        System.out.println("Navigation Bar color is:"+navBarHexColor);

        driver.close();

    }
}
