package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJenkins extends BaseTest {

    @Test(description = "Test should be passed")
    public static void testShouldBePassed() {
        logger.info("Test should be passed");
        Assert.assertTrue(true);
    }

}
