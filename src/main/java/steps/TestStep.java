package steps;

import io.qameta.allure.Step;

public class TestStep extends BaseStep {

    @Step
    public static void stepForTestAllureAnnotation() {
        logger.info("Test allure step annotation");
    }
}
