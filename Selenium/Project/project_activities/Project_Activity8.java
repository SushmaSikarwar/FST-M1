package project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Project_Activity8 {

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
        driver.findElement(By.id("moduleTab_9_Accounts")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("actionmenulink")));

        List <WebElement> row_elements = driver.findElements(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr"));
        System.out.println(row_elements.size());
        int rowSize = row_elements.size();

        int printTopNumofRows = 5;
        int countPrintedRows = 0;
        for (int i = 0; i<rowSize; i++) {
            if (countPrintedRows == printTopNumofRows) {
                System.out.println("Loop break and printed top - "+ printTopNumofRows );
                break;
            }
            List<WebElement> cells = row_elements.get(i).findElements(By.tagName("td"));
            System.out.println("Row ------ "+ (i+1) );
            for (WebElement cell : cells){
                System.out.println(cell.getText());
            }
            countPrintedRows = countPrintedRows + 1;
            i = i+1;
        }

        List <WebElement> col_elements = driver.findElements(By.xpath("//table[contains(@class,'table-responsive')]/thead/tr/th"));
        System.out.println(col_elements.size());
        int colSize = col_elements.size();

        driver.quit();
    }
}