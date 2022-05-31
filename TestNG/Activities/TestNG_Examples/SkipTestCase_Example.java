package TestNG_Examples;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase_Example {

    @Test
    public void aSkipTest() throws SkipException {
        String condition = "Skip Test";

        if (condition.equals("Skip Test")) {
            throw new SkipException("Skipping - This is not ready for testing ");
        } else {
            //Execute test case when conditions are satisfied
        }
    }
}
