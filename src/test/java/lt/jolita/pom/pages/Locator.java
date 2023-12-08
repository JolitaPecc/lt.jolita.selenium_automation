package lt.jolita.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class DemoQa{
        public static class TextBox{
            public static By inputUserName = By.xpath("//input[@id='userName']");
            public static By buttonSubmit = By.xpath("//button[@id='submit']");
            public static By patagraphName = By.xpath("//p[@id='name']");
            public static By inputEmail = By.xpath("//input[@id='userEmail']");
            public static By paragraphEmail = By.xpath("//p[@id='email']");
        }
    }
}
