package lt.jolita.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class DemoQa {
        public static class TextBox {
            public static By inputUserName = By.xpath("//input[@id='userName']");
            public static By buttonSubmit = By.xpath("//button[@id='submit']");
            public static By paragraphName = By.xpath("//p[@id='name']");
            public static By inputEmail = By.xpath("//input[@id='userEmail']");
            public static By paragraphEmail = By.xpath("//p[@id='email']");
        }
    }

    public static class SeleniumEasy {
        public static class BasicForm {
            public static By inputUserMessage = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//button[@onclick='showInput();']");
            public static By spanDisplay = By.xpath("//span[@id='display']");
            public static By inputEnterA = By.xpath("//input[@id='value1']");
            public static By inputEnterB = By.xpath("//input[@id='value2']");
            public static By buttonGetTotal = By.xpath("//button[@onclick='return total()']");
            public static By spanDisplayValue = By.xpath("//span[@id='displayvalue']");

            // taip galima ieskoti elemento: //button[text()='Show Message'],
            // kita ideja kaip ieskoti //form[@id='get-input']/button

        }
    }
}
