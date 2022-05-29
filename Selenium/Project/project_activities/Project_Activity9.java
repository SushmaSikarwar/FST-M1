package project_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class Project_Activity9 {

    public static void main(String[] args) throws InterruptedException {

        String s = System.setProperty("webdriver.gecko.driver", "/Users/sushma/Documents/geckodriver");
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("listViewBody")));

        List <WebElement> allHeaders = driver.findElements(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/thead/tr[1]"));
        System.out.println("All Headers are:");
        for (WebElement header:allHeaders){
            System.out.println("header.getText() - "+ header.getText());
        }

        List <WebElement> row_elements = driver.findElements(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr"));
        System.out.println("row_elements.size() - "+ row_elements.size());
        int rowSize = row_elements.size();
        int printUpto = 10;
        int countPrintedRows = 0;
        for (int i = 0; i<rowSize; i++) {
             if (countPrintedRows == printUpto) {
                 break;
             }
            List<WebElement> nameCol = row_elements.get(i).findElements(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr["+ i +"]/td[3]/b/a"));

            for (WebElement nameCol_element : nameCol) {
                System.out.print("nameCol_element.getText() - "+ nameCol_element.getText());
            }

            List<WebElement> userCol = row_elements.get(i).findElements(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr["+ i + "]/td[8]/a"));

            for (WebElement userCol_element : userCol) {
                System.out.print(" | userCol_element.getText() - "+ userCol_element.getText());
            }
            System.out.println("");
            countPrintedRows = countPrintedRows + 1;
        }
       driver.quit();
    }
}