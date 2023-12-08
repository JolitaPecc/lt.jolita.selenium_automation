package lt.jolita.pom.tests.demoqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import lt.jolita.pom.pages.demoqa.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTest {

    @BeforeMethod
    public void setUp() {
        TextBoxPage.openUrl("https://demoqa.com/text-box");
    }

    @Test // atidarome puslapi per chrome
    public void openDemoQaWithChrome() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void testFullNameProvidingNameHarryPotterAndSubmitButton() {
        String fullName = "Harry Potter";
        String expectedResult = "Harry Potter";
        String actualResult;

        TextBoxPage.writeFullName(fullName);
        TextBoxPage.clickOnButtonSubmit();
        actualResult = TextBoxPage.readMessageFullName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s,\nExpected: %s".formatted(actualResult, expectedResult)
        );
    }

    @Test
    public void testProvidingFullEmail() {
        String email = "harry.potter@mail.com";
        String expectedResult = "harry.potter@mail.com";
        String actualResult;

        TextBoxPage.writeEmail(email);
        TextBoxPage.clickOnButtonSubmit();
        actualResult = TextBoxPage.readMessageEmail();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s".formatted(actualResult, expectedResult)
        );
    }

    @AfterMethod
    public void tearDown() {
        TextBoxPage.quit();
    }
}
