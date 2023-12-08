package lt.jolita.pom.pages.selenium_easy;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

public class BasicFormPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void writeUserMessage(String text) {
        Common.addText(Locator.SeleniumEasy.BasicForm.inputUserMessage, text);
    }

    public static void clickOnButtonShowMessage() {
        Common.clickOnElement(Locator.SeleniumEasy.BasicForm.buttonShowMessage);
    }

    public static String readUserMessage() {
        return Common.getText(Locator.SeleniumEasy.BasicForm.spanDisplay);
    }

    public static void writeEnterA(String text) {
        Common.addText(Locator.SeleniumEasy.BasicForm.inputEnterA, text);
    }

    public static void writeEnterB(String text) {
        Common.addText(Locator.SeleniumEasy.BasicForm.inputEnterB, text);
    }

    public static void clickOnButtonGetTotal() {
        Common.clickOnElement(Locator.SeleniumEasy.BasicForm.buttonGetTotal);
    }

    public static String readValue() {
        return Common.getText(Locator.SeleniumEasy.BasicForm.spanDisplayValue);
    }
}
