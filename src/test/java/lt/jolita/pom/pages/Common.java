package lt.jolita.pom.pages;

import lt.jolita.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public static void setUpChrome() { // cia pagauna kai nera kintamojo
        Driver.setUpChromeDriver();
    }

    public static void setUpChrome(int durationOfSeconds) { // cia pasigauna, kai turim kintamaji
        Driver.setUpChromeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeWindow() { // uzdaro atskira arba konkretu tapa
        Driver.closeDriver();
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator); //gaudom po viena elementa
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator); // gaudome po kelis elementus
    }

    public static void addText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getText(By locator) {
        return getElement(locator).getText();
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click(); // padarom, kad programa paspaustu mygtuka
    }

    public static boolean checkIfElementSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public static boolean checkIfElementDisabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static List<Boolean> checkIfElementsAreSelected(By locator) {
        List<Boolean> statuses = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            statuses.add(element.isSelected());
        }

        return statuses;
    }
}
