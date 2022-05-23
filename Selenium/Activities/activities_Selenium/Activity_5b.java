package activities_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5b {

    public static void main(String[] args) {

        String s = System.setProperty("webdriver.gecko.driver","/Users/sushma/Documents/geckodriver");

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        //Find the checkbox
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        //Select the checkbox
        checkboxInput.click();

        //Print status
        System.out.println("The checkbox is selected: " + checkboxInput.isSelected());

        //Close the browser
       driver.close();

    }

}
