package lt.jolita.pom.tests.selenium_easy;

import lt.jolita.pom.pages.selenium_easy.BasicFormPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicFormTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        BasicFormPage.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    @Test
    public void testSingleInputField_Hello() {
        String text = "Hello";
        String expectedResult = "Hello";
        String actualResult;

        BasicFormPage.writeUserMessage(text);
        BasicFormPage.clickOnButtonShowMessage();
        actualResult = BasicFormPage.readUserMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDoubleInputField_2Plus4() {
        String value1 = "2";
        String value2 = "4";
        String expectedResult = "6";
        String actualResult;

        BasicFormPage.writeEnterA(value1);
        BasicFormPage.writeEnterB(value2);
        BasicFormPage.clickOnButtonGetTotal();
        actualResult = BasicFormPage.readValue();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDoubleInputField_negativeABC() {
        String value1 = "ABC";
        String value2 = "4";
        String expectedResult = "NaN";
        String actualResult;

        BasicFormPage.writeEnterA(value1);
        BasicFormPage.writeEnterB(value2);
        BasicFormPage.clickOnButtonGetTotal();
        actualResult = BasicFormPage.readValue();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
