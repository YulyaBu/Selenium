package SeleniumTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuapp5 {

    @Test
    public void openHerokuTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("http://ya.ru");
        driver.quit();

    }
}

