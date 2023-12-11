package lt.jolita.pom.pages.selenium_easy;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class BasicRadiobuttonPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnRadiobutton(String value) {
        Common.clickOnElement(Locator.SeleniumEasy.BasicRadiobutton.setRadiobuttonGender(value));
    }

    public static void clickOnButtonCheck() {
        Common.clickOnElement(Locator.SeleniumEasy.BasicRadiobutton.buttonCheck);
    }

    public static String readMessageRadiobutton() {
        return Common.getText(Locator.SeleniumEasy.BasicRadiobutton.paragraphRadiobutton);
    }
}
