package lt.jolita.pom.tests.demoqa;

import lt.jolita.pom.pages.demoqa.DynamicPropertiesPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DynamicPropertiesPage.openUrl("https://demoqa.com/dynamic-properties");
    }

    @Test
    public void testButtonEnableAfter() {
        boolean isEnabled = DynamicPropertiesPage.checkButtonIsEnabled();
        System.out.println(isEnabled);

        DynamicPropertiesPage.clickOnButtonEnableAfter();

        isEnabled = DynamicPropertiesPage.checkButtonIsEnabled();
        System.out.println(isEnabled);
    }

    @Test
    public void testButtonColorChange() throws InterruptedException {
        String attributeName = "class";
        String valueContains = "text-danger";

        String value = DynamicPropertiesPage.readButtonAttributeValueOnColorChange(attributeName, valueContains);
        System.out.println(value);
    }

    @Test
    public void testButtonVisibleAfter() {
        System.out.println(
                DynamicPropertiesPage.isButtonVisible()
        );

        DynamicPropertiesPage.clickOnButtonVisibleAfter();
        System.out.println(
                DynamicPropertiesPage.isButtonVisible()
        );
    }

    @Test
    public void testCustomiseWait() {
        DynamicPropertiesPage.clickOnButtonVisibleAfterCustomised();
    }

}
