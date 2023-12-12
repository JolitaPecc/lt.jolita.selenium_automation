package lt.jolita.pom.pages.demoqa;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class DynamicPropertiesPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnButtonEnableAfter() {
        Common.waitForElementToBeClickable(Locator.DemoQa.DynamicProperties.buttonEnableAfter);
        Common.clickOnElement(Locator.DemoQa.DynamicProperties.buttonEnableAfter);
    }

    public static boolean checkButtonIsEnabled() {
        return Common.checkIfElementEnabled(Locator.DemoQa.DynamicProperties.buttonEnableAfter);
    }

    public static String readButtonAttributeValueOnColorChange(String attributeName, String valueContains) {
        Common.waitForElementOnAttributeValueChange(
                Locator.DemoQa.DynamicProperties.buttonColorChange,
                attributeName,
                valueContains
        );
        return Common.getElementAttributeValue(
                Locator.DemoQa.DynamicProperties.buttonColorChange,
                attributeName
        );
    }

    public static boolean isButtonVisible() {
        return Common.checkIfElementVisible(Locator.DemoQa.DynamicProperties.buttonVisibleAfter);
    }

    public static void clickOnButtonVisibleAfterCustomised() {
        boolean isVisible = Common.waitForElementToBeVisibleCustomised(
                Locator.DemoQa.DynamicProperties.buttonVisibleAfter, 8
        );
        if (isVisible) {
            Common.checkIfElementVisible(Locator.DemoQa.DynamicProperties.buttonVisibleAfter);
        }
    }

    public static void clickOnButtonVisibleAfter() {
        Common.waitForElementToBeVisible(Locator.DemoQa.DynamicProperties.buttonVisibleAfter);
        Common.clickOnElement((Locator.DemoQa.DynamicProperties.buttonVisibleAfter));
    }
}
