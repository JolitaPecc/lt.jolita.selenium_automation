package lt.jolita.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumDemo {

    WebDriver driver;

    @Test // atidarome puslapi per chrome
    public void openDemoQaWithChrome() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        try {
            Thread.sleep(5000);
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

        WebDriverManager.chromedriver().setup();

//         solution for MacOs
//        driver.get("chrome://settings/");
//        ((JavascriptExecutor) driver).executeScript("chrome.settingsPrivate.setDefaultZoom(0.7)");

        ChromeOptions option = new ChromeOptions();
//        option.addArguments("--remote-allow-origins=*");
//        option.addArguments("--headless=new");
//        option.addArguments("--window-position=4000,0"); --> skirta atidaryti langa nuo 4000 pixelio
//        options.addArguments("window-size=5000,3000");
        option.addArguments("start-maximized"); // cia isdidina full screen
        option.addArguments("--force-device-scale-factor=0.70");
        option.addArguments();

        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/text-box"); // cia atidarom narsykle

//        WebElement inputUserName = driver.findElement(By.id("userName"));
        WebElement inputUserName = driver.findElement(By.xpath("//input[@id='userName']"));
        //xpath paemem is narsykles per RMB -> Inspect, crtl+F ir surasem ranka //input[@id='userName']
        inputUserName.sendKeys(fullName);

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        actualResult = driver.findElement(By.xpath("//p[@id='name']")).getText();


        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s,\nExpected: %s".formatted(actualResult, expectedResult)
        );
        driver.quit();
    }

    @Test
    public void testProvidingFullEmail() {
        String fullEmail = "harry.potter@mail.com";
        String expectedResult = "harry.potter@mail.com";
        String actualResult;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized"); // cia isdidina full screen
        option.addArguments("--force-device-scale-factor=0.70");
        option.addArguments();

        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/text-box"); // cia atidarom narsykle

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        //xpath paemem is narsykles per RMB -> Inspect, crtl+F ir surasem ranka //input[@id='userName']
        inputEmail.sendKeys(fullEmail);

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        actualResult = driver.findElement(By.xpath("//p[@id='email']")).getText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected: %s, \nActual: %s".formatted(actualResult, expectedResult)
        );
        driver.quit();
    }




}