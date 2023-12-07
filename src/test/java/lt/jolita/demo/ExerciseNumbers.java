package lt.jolita.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class ExerciseNumbers {
    //    Testas “žalias” jeigu 995 dalijasi iš 3 (be liekanos)
//    Testas “žalias” jeigu šiandien trečiadienis
//    Bonus: Testas “žalias” jei nuo 1 iki 10 yra 5 lyginiai
//    skaičiai (cia riekia ciklo)

    @Test
    public void testSleepFor5Seconds() {
        long startTime;
        long finishTime;
        int expectedResult = 5;
        int actualResult;

        startTime = System.currentTimeMillis();

        try {
            Thread.sleep(5000);
            finishTime = System.currentTimeMillis();
            actualResult = (int) (finishTime - startTime) / 1000;
        } catch (InterruptedException e) {
            e.printStackTrace();
            actualResult = -1;
        }

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIfNumber995CanBeDividedFrom3() {
        int expectedResult = 995;
        int actualResult = 0;

        actualResult = expectedResult % 3;

        Assert.assertEquals(actualResult, expectedResult);
    }

//    @Test
//    public void testIsTodayWednesday() {
//        DayOfWeek expectedResult = DayOfWeek.WEDNESDAY;
////        String expectedResult = "THURSDAY";
//        DayOfWeek actualResult;
//
//        actualResult = LocalDateTime.now().getDayOfWeek();
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }

    @Test
    public void test5Number() {
        int expectedResult = 5;
        int actualResult;
        int count = 0;

        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 == 0)
                count ++;
        }
        actualResult = count;
        Assert.assertEquals(actualResult, expectedResult);
    }
}
