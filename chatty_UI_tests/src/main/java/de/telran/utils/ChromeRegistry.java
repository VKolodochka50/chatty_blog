package de.telran.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class ChromeRegistry {

        private WebDriver driver;

        @BeforeAll
        public static void setupClass() {
                WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        public void setupTest() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--start-maximized");
            options.setExperimentalOption("excludeSwitches",
                    Arrays.asList("disable-popup-blocking"));
            driver = new ChromeDriver(options);

        }

        @AfterEach
        public void teardown() {
                if (driver != null) {
                        driver.quit();
                }
        }

}
