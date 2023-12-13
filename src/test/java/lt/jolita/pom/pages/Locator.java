package lt.jolita.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class DemoQa {
        public static By buttonDoubleCLick = By.xpath("//button[@id='doubleClickBtn']");

        public static class TextBox {
            public static By inputUserName = By.xpath("//input[@id='userName']");
            public static By buttonSubmit = By.xpath("//button[@id='submit']");
            public static By paragraphName = By.xpath("//p[@id='name']");
            public static By inputEmail = By.xpath("//input[@id='userEmail']");
            public static By paragraphEmail = By.xpath("//p[@id='email']");
        }

        public class DynamicProperties {
            public static By buttonEnableAfter = By.xpath("//button[@id='enableAfter']");
            public static By buttonColorChange = By.xpath("//button[@id='colorChange']");
            public static By buttonVisibleAfter = By.xpath("//button[@id='visibleAfter']");
        }

        public static class Buttons {
            public static By readDoubleClickMessage = By.xpath("//p[@id='doubleClickMessage']");
            public static By buttonDoubleCLick = By.xpath("//button[@id='doubleClickBtn']");
            public static By buttonRightClick = By.xpath("//button[@id='rightClickBtn']");
            public static By rightClickMessage = By.xpath("//p[@id='rightClickMessage']");
        }

        public class Alerts {
            public static By buttonAlertDelay = By.xpath("//button[@id='timerAlertButton']");
            public static By buttonPromptBox = By.xpath("//button[@id='promtButton']");
            public static By spanPromptBox = By.xpath("//span[@id='promptResult']");
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

        public static class BaseCheckbox {
            public static By checkboxAge = By.xpath("//input[@id='isAgeSelected']");
            public static By divTxtAge = By.xpath("//div[@id='txtAge']");
            public static By checkboxDefaultSelected =
                    By.xpath("//input[@type='checkbox' and @checked and not(@disabled)]");
            public static By checkboxThird =
                    By.xpath("//input[@type='checkbox' and @checked and (@disabled)]");
            public static By buttonCheck = By.xpath("//input[@id='check1']");
            public static By checkboxGroup = By.xpath("//input[@type='checkbox' and @class='cb1-element']");

            // galima ieskand sujungti parametrus su "AND" ir "OR" zodeliais //input[@type='checkbox' and @checked]
        }

        public static class BasicRadiobutton {

            public static By buttonCheck = By.xpath("//button[@id='buttoncheck']");
            public static By paragraphRadiobutton =
                    By.xpath("//button[@id='buttoncheck']/../..//p[@class='radiobutton']");
            public static By buttonGetValues =
                    By.xpath("//button[@class='btn btn-default' and@onclick='getValues();']");
            public static By paragraphMessage = By.xpath("//p[@class='groupradiobutton']");

            public static By setRadiobuttonGender(String value) {
                //male paieska: //input[@value='Male' and @name='optradio']
                //female paieska: //input[@value='Female' and @name='optradio']
                return By.xpath("//input[@value='" + value +"' and @name='optradio']");
                // return By.xpath("//input[@value='".concat(value).concat("' and @name='optradio']"));
                // cia prideti pliusai, kad per value reiksme paimtume male/female arba su concat

            }

            public static By setSecondRadiobuttonGender(String value01) {
                return By.xpath("//input[@value='" + value01 + "' and@name='gender']");
            }

            public static By setAgeGroup(String value02) {
                return By.xpath("//input[@value='" + value02 + "' and@name='ageGroup']");
            }
        }
    }
}
