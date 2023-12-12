package lt.jolita.pom.pages.selenium_easy;

import lt.jolita.pom.pages.Common;
import lt.jolita.pom.pages.Locator;

import java.util.List;

public class BaseCheckboxPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void clickOnCheckBoxAge() {
        Common.clickOnElement(Locator.SeleniumEasy.BaseCheckbox.checkboxAge);
    }

    public static String readMessageAge() {
        return Common.getText(Locator.SeleniumEasy.BaseCheckbox.divTxtAge);
    }

    public static boolean checkIfDefauCheckboxlsIsSelected() {
        return Common.checkIfElementSelected(Locator.SeleniumEasy.BaseCheckbox.checkboxDefaultSelected);
    }

    public static boolean checkCheckboxAgeIsSelected() {
        return Common.checkIfElementSelected(Locator.SeleniumEasy.BaseCheckbox.checkboxAge);
    }

    public static boolean checkThirdCheckboxlsIsEnabled() {
        return Common.checkIfElementEnabled(Locator.SeleniumEasy.BaseCheckbox.checkboxThird);
    }

    public static void clickOnButtonCheck() {
        Common.clickOnElement(Locator.SeleniumEasy.BaseCheckbox.buttonCheck);
    }

    public static boolean checkCheckboxGroupSelection(boolean expectedStatus) {
        List<Boolean> selectionStatuses =
                Common.checkIfElementsAreSelected(Locator.SeleniumEasy.BaseCheckbox.checkboxGroup);

        for (Boolean status : selectionStatuses) {
            if (status != expectedStatus) return false; // tikrinam neligybe
        }

        return true;
    }
}
