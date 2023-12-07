package lt.jolita.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class TestDemo {

    @Test(priority = 2)
    public void test01() {
        //1. variables
        //2. actions
        //3. check test results
    }

    @Test
    public void testIfNumber4isEven() {
        int inputNumber = 4;
        int expectedResult = 0;
        int actualResult;

        actualResult = inputNumber % 2;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIfCurrentTimeIs19() {
        int expectedResult = 19;
        int actualResult;

        actualResult = LocalTime.now().getHour();

        Assert.assertEquals(actualResult, expectedResult);
    }


}
