package lt.jolita.pom.tests.demoqa;

import lt.jolita.pom.pages.demoqa.ButtonsPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ButtonsPage.openUrl("https://demoqa.com/buttons");
    }

    @Test
    public void testButtonDoubleClick() {
        String expectedResult = "You have done a double click";
        String actualResult;

        ButtonsPage.doubleClickOnButton();
        actualResult = ButtonsPage.readDoubleClickMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRightClickMeButton() {
        String expectedResult = "You have done a right click";
        String actualResult;

        ButtonsPage.rightClickOnButton();
        actualResult = ButtonsPage.readrightClickMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }

}
