package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.TestStep;

@Epic("Jenkins Tests epic")
@Feature("Jenkins Tests")
public class TestJenkins extends BaseTest {

    @Test(description = "Test should be passed")
    public static void testShouldBePassed() {
        logger.info("Test should be passed");
        TestStep.stepForTestAllureAnnotation();
        Assert.assertTrue(true);
    }

}
