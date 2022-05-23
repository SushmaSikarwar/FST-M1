package project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_Act2 {

    public static void main(String[] args) {

        String s = System.setProperty("webdriver.gecko.driver", "/Users/sushma/Documents/geckodriver");
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/crm");

        WebElement header_image = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[1]/div[1]/img"));

        System.out.println("Url of the header image is: "+header_image.getAttribute("src"));

        driver.close();

    }

}