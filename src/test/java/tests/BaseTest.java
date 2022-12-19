package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utils.Logger;

public class BaseTest {

    protected static final Logger logger = Logger.getInstance();

    @BeforeSuite
    private static void beforeSuite() {
        logger.info("Before suite method running");
    }

    @BeforeTest
    private static void beforeTest() {
        logger.info("Before test method running");
    }

    @BeforeClass
    private static void beforeClass() {
        logger.info("Before class method running");
    }

    @BeforeMethod
    private static void beforeMethod() {
        logger.info("Before method running");
    }

}
