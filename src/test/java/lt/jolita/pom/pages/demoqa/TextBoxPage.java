package lt.jolita.pom.pages.demoqa;

import lt.jolita.pom.pages.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
    public static void openUrl(String url) {
        Common.setUpChrome(10); // cia su palaukimu 10 sekundziu
        Common.openUrl(url);
    }

    public static void quit() {
        Common.quitDriver();
    }

    public static void writeFullName(String fullName) {
        Common.addText(By.xpath("//input[@id='userName']"), fullName);
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(By.xpath("//button[@id='submit']"));
    }

    public static String readMessageFullName() {
        return Common.getText(By.xpath("//p[@id='name']"));
    }

    public static void writeEmail(String email) {
        Common.addText(By.xpath("//input[@id='userEmail']"), email);
    }

    public static String readMessageEmail() {
        return Common.getText(By.xpath("//p[@id='email']"));
    }
}
