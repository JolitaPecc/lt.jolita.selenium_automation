package lt.jolita.pom.tests.selenium_easy;

import lt.jolita.pom.pages.selenium_easy.BaseCheckboxPage;
import lt.jolita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseCheckboxTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        BaseCheckboxPage.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    @Test
    public void testClickOnCheckbox() {
        String expectedResult = "Success - Check box is checked";
        String actualResult;

        BaseCheckboxPage.clickOnCheckBoxAge();
        actualResult = BaseCheckboxPage.readMessageAge();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDefaultCheckboxIsSelected() {
        Boolean actualResult;

        actualResult = BaseCheckboxPage.checkIfDefauCheckboxlsIsSelected();

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testCheckboxAgeIsSelected() {
        Boolean actualResult;

        actualResult = BaseCheckboxPage.checkCheckboxAgeIsSelected();

        Assert.assertFalse(actualResult);
    }

    @Test
    public void testThirdCheckboxIsDisabled() {
        Boolean actualResult;

        actualResult = BaseCheckboxPage.checkThirdCheckboxlsIsEnabled();

        Assert.assertFalse(actualResult);
    }

    @DataProvider(name = "checkboxGroup")
    public Object[][] provideDataForCheckboxGroup(){
        //cia duomenis galima nuskaityti is bet kur, cia reikia
        // juos issitraukti is PC disko arba nuotolines repozitorijos
        //per API. Sukuriam masyva, nuskaitytus duomenis sudedam.
        return new Object[][]{
                {true},
                {false}
        };
    }

    @Test(dataProvider = "checkboxGroup")
    public void testCheckboxGroupIsSelected(boolean expectedResult) {
        boolean actualResult;

        BaseCheckboxPage.clickOnButtonCheck();
        if(!expectedResult) BaseCheckboxPage.clickOnButtonCheck();
        actualResult = BaseCheckboxPage.checkCheckboxGroupSelection(expectedResult);

        Assert.assertTrue(actualResult);
    }

}
