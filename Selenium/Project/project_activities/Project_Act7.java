package project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Project_Act7 {

    public static void main(String[] args) throws InterruptedException {

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

        Thread.sleep(5000);

        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Leads")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]td[10]/span[1]span[1]")));

        driver.findElement(By.xpath("//tbody/tr[1]td[10]/span[1]span[1]\"")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='phone'])[1]]")));

        WebElement phone = driver.findElement(By.xpath("(//span[@class='phone'])[1]"));

        String phoneNumber = phone.getText();

        System.out.println("The number is :"+ phoneNumber);

        driver.close();

    }
}
