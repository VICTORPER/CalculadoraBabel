package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    public static WebDriver driver;


    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\QV-4555\\Downloads\\CalculadoraBabel\\chromedriver.exe");
        driver = new ChromeDriver();
    }

}

