package lt.jolita.pom.tests.demoqa;

import lt.jolita.pom.pages.demoqa.AlertsPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AlertsPage.openUrl("https://demoqa.com/alerts");
    }

    @Test
    public void testAlertAppearAfterSeconds() {
        AlertsPage.clickOnButtonAlertDelay();
        AlertsPage.clickOnOkOfAlertBox();
    }

    @Test
    public void testPromptBoxClickOnOK() {
        String message = "sveiki";
        String expectedResult = "sveiki";
        String actualResult;

        AlertsPage.clickOnButtonPromptBox();
        AlertsPage.writeMessageIntoAlertBox(message);
        AlertsPage.clickOnOkOfAlertBox();
        actualResult = AlertsPage.readMessageOfPromptBox();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s".formatted(actualResult, expectedResult)
        );
    }

}
