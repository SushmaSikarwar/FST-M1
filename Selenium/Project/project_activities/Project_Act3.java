package project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_Act3 {

    public static void main(String[] args) {

        String s = System.setProperty("webdriver.gecko.driver", "/Users/sushma/Documents/geckodriver");
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/crm");

        WebElement footerText = driver.findElement(By.xpath("//*[@id=\"admin_options\"]"));

        System.out.println("Footer text :" + footerText.getAttribute("text"));

        driver.close();

    }
}

