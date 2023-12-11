package lt.jolita.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setUpChromeDriver(){
        WebDriverManager.chromedriver().setup();

//         solution for MacOs
//        driver.get("chrome://settings/");
//        ((JavascriptExecutor) driver).executeScript("chrome.settingsPrivate.setDefaultZoom(0.7)");

        ChromeOptions option = new ChromeOptions();
//        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--headless=new"); // vykdoma kompiuterio atmintyje
//        option.addArguments("--window-position=4000,0"); --> skirta atidaryti langa nuo 4000 pixelio
//        options.addArguments("window-size=5000,3000");
        option.addArguments("start-maximized"); // cia isdidina full screen
        option.addArguments("--force-device-scale-factor=0.70");
        option.addArguments();

        driver.set(new ChromeDriver(option));
    }

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void closeDriver(){

        driver.get().close(); // uzdarys atidaryta taba
    }

    public static void quitDriver(){
//        driver.quit(); // uzdarys viska, ka atidare, visus langus
        driver.get().quit();
        driver.remove();
    }

}
