package TestNG_Examples;

import org.testng.annotations.Test;

public class Example2 {

    @Test(priority = 0)
    public void One() {
        System.out.println("This is the Test Case number One");
    }

    @Test(priority = 1)
    public void Two() {
        System.out.println("This is the Test Case number Two");
    }

    @Test(priority = 2)
    public void Three() {
        System.out.println("This is the Test Case number Three");
    }
}
