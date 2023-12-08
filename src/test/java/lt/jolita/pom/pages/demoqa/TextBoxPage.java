package lt.jolita.pom.pages.demoqa;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
    public static void openUrl(String url) {
        Common.setUpChrome(10); // cia su palaukimu 10 sekundziu
        Common.openUrl(url);
    }

    public static void writeFullName(String fullName) {
        Common.addText(Locator.DemoQa.TextBox.inputUserName, fullName);
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(Locator.DemoQa.TextBox.buttonSubmit);
    }

    public static String readMessageFullName() {
        return Common.getText(Locator.DemoQa.TextBox.patagraphName);
    }

    public static void writeEmail(String email) {
        Common.addText(Locator.DemoQa.TextBox.inputEmail, email);
    }

    public static String readMessageEmail() {
        return Common.getText(Locator.DemoQa.TextBox.paragraphEmail);
    }
}
