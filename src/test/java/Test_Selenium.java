
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Test_Selenium {
    ChromeDriver driver;

@BeforeMethod
    void setUp() {

        WebDriverManager.chromedriver().setup();

    }
    @Test

    public void test_1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://otus.ru");
       WebElement element= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/section[1]/div/div[1]/a/div/div/picture/img")); //поиск элемента

       Actions actions = new Actions(driver); //сознание объекта Actions
        actions.moveToElement(element).click().perform(); //Клик после наведения на элемент мышки

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.urlToBe("https://otus.ru/lessons/sa-ba-specialization-course/"));

       System.out.println("Страница успешно загружена, URL изменился!");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/section/div[2]/div[2]/div[1]")));

        System.out.println("Страница успешно загружена, элемент найден!");



        }

    }


