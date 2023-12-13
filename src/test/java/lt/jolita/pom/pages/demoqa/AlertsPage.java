package lt.jolita.pom.pages.demoqa;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class AlertsPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickOnButtonAlertDelay() {
        Common.clickOnElement(Locator.DemoQa.Alerts.buttonAlertDelay);
    }

    public static void clickOnButtonPromptBox() {
        Common.clickOnElement(Locator.DemoQa.Alerts.buttonPromptBox);
    }

    public static void writeMessageIntoAlertBox(String message) {
        Common.addTextIntoAlertBox(message);
    }

    public static String readMessageOfPromptBox() {
        return Common.getText(Locator.DemoQa.Alerts.spanPromptBox);
    }

    public static void clickOnOkOfAlertBox() {
        Common.waitForAlertIsPresent(8);
        Common.clickOnAcceptOfAlertBox();
    }
}
