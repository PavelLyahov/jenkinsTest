import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJenkins {

    @Test(description = "Testing jenkins pipeline")
    public void testJenkinsPipeline() {
        String jenkins = "Jenkins";
        Assert.assertEquals(jenkins, "Jenkins");
    }
}
