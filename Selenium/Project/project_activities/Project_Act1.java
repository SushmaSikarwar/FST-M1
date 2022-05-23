package project_activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class Project_Act1 {

    public static void main(String[] args) {

        String s = System.setProperty("webdriver.gecko.driver", "/Users/sushma/Documents/geckodriver");
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/crm");

        //Check the title of the page
        String actualTitle = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + actualTitle);

        //Expected the title of the page
        String expectedTitle = "SuiteCRM";

        //Verify expected title matches actual title exactly
        assertEquals(expectedTitle,actualTitle);

        //Close browser
         driver.close();

    }

}
