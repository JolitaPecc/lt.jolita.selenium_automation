package lt.jolita.pom.tests.selenium_easy;

import lt.jolita.pom.pages.Locator;
import lt.jolita.pom.pages.selenium_easy.BasicFormPage;
import lt.jolita.pom.pages.selenium_easy.BasicRadiobuttonPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicRadiobuttonTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        BasicRadiobuttonPage.openUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    @DataProvider(name = "Radiobutton")
    public Object[][] provideDataForRadiobutton() {
        //cia duomenis galima nuskaityti is bet kur, cia reikia
        // juos issitraukti is PC disko arba nuotolines repozitorijos
        //per API. Sukuriam masyva, nuskaitytus duomenis sudedam.
        return new Object[][]{
                {"Male", "Male"},
                {"Female", "Female"}
        };
    }

    @Test(dataProvider = "Radiobutton")
    public void testRadioButtonGender(String value, String expectedResult) {
        String actualResult;

        //1. Clickon radiobutton "Male"
        BasicRadiobuttonPage.clickOnRadiobutton(value);

        //2. Click on button "Get check value"
        BasicRadiobuttonPage.clickOnButtonCheck();

        //3. Check message if contains "Male"
        actualResult = BasicRadiobuttonPage.readMessageRadiobutton();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s".formatted(actualResult, expectedResult)
        );
    }

    @DataProvider(name = "radioButtonGroup")
    public Object[][] radioButtonGroupFunction() {
        return new Object[][]{
                {"Male", "0 - 5", "Male", "0 - 5"},
                {"Male", "5 - 15", "Male", "5 - 15"},
                {"Male", "15 - 50", "Male", "15 - 50"},
                {"Female", "0 - 5", "Female", "0 - 5"},
                {"Female", "5 - 15", "Female", "5 - 15"},
                {"Female", "15 - 50", "Female", "15 - 50"},
        };
    }

    @Test(dataProvider = "radioButtonGroup")
    public void testRadioButtonGenderAdnAgeSelections(String value01, String value02, String expectedGender, String expectedAge) {
        String actualResult;

        BasicRadiobuttonPage.clickOnSecondGenderRadiobutton(value01);
        BasicRadiobuttonPage.clickOnAgeGroup(value02);
        BasicRadiobuttonPage.clickGetValuesButton();


        actualResult = BasicRadiobuttonPage.readMessageGender();


        Assert.assertTrue(
                actualResult.contains(expectedGender) && actualResult.contains(expectedAge),
                "\nActual: %s, \nExpected gender: %s, \nExpected age: %s".formatted(
                        actualResult, expectedGender, expectedAge)
        );

    }

}
