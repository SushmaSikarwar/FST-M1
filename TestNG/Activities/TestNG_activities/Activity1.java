package TestNG_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

    String s = System.setProperty("webdriver.gecko.driver", "/Users/sushma/Documents/geckodriver");
    WebDriver driver;

    @Test
    public void exampleTestCase() {

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        Assert.assertEquals("Training Support", title);

        driver.findElement(By.id("about-link")).click();

        System.out.println("New page title is: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
