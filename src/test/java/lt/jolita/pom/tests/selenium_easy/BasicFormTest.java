package lt.jolita.pom.tests.selenium_easy;

import lt.jolita.pom.pages.selenium_easy.BasicFormPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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

    @DataProvider(name = "TwoInputFields")
    public Object[][] provideDataForTwoInputFields(){
        //cia duomenis galima nuskaityti is bet kur, cia reikia
        // juos issitraukti is PC disko arba nuotolines repozitorijos
        //per API. Sukuriam masyva, nuskaitytus duomenis sudedam.
        return new Object[][]{
                {"2", "4", "6"},
                {"ABC", "4", "Nan"},
                {" ", "85", " "},
                {"-15", " ", "Nan"},
                {"", "", "Nan"},
        };
    }

    @Test(dataProvider = "TwoInputFields")
    public void testDoubleInputField_negativeABC(String value1, String value2, String expectedResult) {
        String actualResult;

        BasicFormPage.writeEnterA(value1);
        BasicFormPage.writeEnterB(value2);
        BasicFormPage.clickOnButtonGetTotal();
        actualResult = BasicFormPage.readValue();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
