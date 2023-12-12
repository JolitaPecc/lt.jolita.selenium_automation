package lt.jolita.pom.pages.demoqa;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class ButtonsPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void doubleClickOnButton() {
        Common.doubleCLickOnElementByActions(Locator.DemoQa.Buttons.buttonDoubleCLick);
    }

    public static String readDoubleClickMessage() {
       return Common.getText(Locator.DemoQa.Buttons.readDoubleClickMessage);
    }

    public static void rightClickOnButton() {
        Common.rightClickOnElementByActions(Locator.DemoQa.Buttons.buttonRightClick);
    }

    public static String readrightClickMessage() {
        return Common.getText(Locator.DemoQa.Buttons.rightClickMessage);
    }
}
