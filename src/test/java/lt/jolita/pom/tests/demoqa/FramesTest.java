package lt.jolita.pom.tests.demoqa;

import lt.jolita.pom.pages.demoqa.FramePage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        FramePage.openUrl("https://demoqa.com/frames");
    }

    @Test
    public void testFrame() {
        String expectedResultFrame = "This is a sample page";
        String expectedResultDescription = "Sample Iframe page";
        String actualResultFrame;
        String actualResultDescription;

        actualResultFrame = FramePage.readMessageSample();
        actualResultDescription = FramePage.readDescription();

        Assert.assertEquals(actualResultFrame, expectedResultFrame);
        Assert.assertTrue(
                actualResultDescription.contains(expectedResultDescription),
                "\nExpected: %s, \nActual: %s".formatted(actualResultDescription, expectedResultDescription)
        );
    }

}
