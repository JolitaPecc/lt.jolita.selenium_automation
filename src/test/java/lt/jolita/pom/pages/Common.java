package lt.jolita.pom.pages;

import lt.jolita.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public static boolean checkIfElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static List<Boolean> checkIfElementsAreSelected(By locator) {
        List<Boolean> statuses = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            statuses.add(element.isSelected());
        }

        return statuses;
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void waitForElementOnAttributeValueChange(By locator, String attributeName, String valueContains) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(locator, attributeName, valueContains));
    }

//    public static void waitFotElementsToBeVisible(By locator) {
//        WebDriverWait wait =
//    }


    public static boolean checkIfElementVisible(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean waitForElementToBeVisibleCustomised(By locator, int seconds) {
        boolean isVisible;
        int duration = 0;
        do {
            try {
                Thread.sleep(500);
                getElement(locator).isDisplayed();
                isVisible = false;
            } catch (NoSuchElementException e) {
                isVisible = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
            duration ++;
        } while (!isVisible || duration/2 >= seconds);

        return isVisible;
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
