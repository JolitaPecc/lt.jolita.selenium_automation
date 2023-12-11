package lt.jolita.pom.pages.selenium_easy;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class BasicRadiobuttonPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
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

    public static void clickOnSecondGenderRadiobutton(String value01) {
        Common.getText(Locator.SeleniumEasy.BasicRadiobutton.setSecondRadiobuttonGender(value01));
    }

    public static void clickOnAgeGroup(String value02) {
        Common.getText(Locator.SeleniumEasy.BasicRadiobutton.setAgeGroup(value02));
    }

    public static void clickGetValuesButton() {
        Common.clickOnElement(Locator.SeleniumEasy.BasicRadiobutton.buttonGetValues);
    }

    public static String readMessageGender() {
        return Common.getText(Locator.SeleniumEasy.BasicRadiobutton.paragraphMessage);
    }
}
