import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Test_Selenide {
    @Before
    public  void setUp() {
Configuration.browser="chrome";
      Configuration.pageLoadStrategy= "none";
      Configuration.holdBrowserOpen=(true);
    }
@Test
    public void test_1(){



      open("https://otus.ru/");

        $(byText("Специализация QA Automation Engineer")).click();

       $(byText("Идеальная точка входа в тестирование на Java")).shouldBe(Condition.visible);


        System.out.println("Курс успешно открыт, описание отображается.");
    }



}
