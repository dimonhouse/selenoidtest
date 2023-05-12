import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.browserCapabilities;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class MainTest {


    @Test
    public void test1(){
        browserCapabilities.setCapability("enableVNC", true);
        browserSize = "1920x1080";


        open("https://www.google.com/");
        $(By.name("q")).shouldBe(Condition.visible);
        System.out.println("Google page is opened!!!");
        sleep(3000);
    }

}
