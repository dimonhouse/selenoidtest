import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
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
        browser = "firefox";
        Configuration.remote = "http://ec2-54-191-83-209.us-west-21.compute.amazonaws.com:4444/wd/hub";


        open("https://www.google.com/");
        $(By.name("q")).shouldBe(Condition.visible);
        System.out.println("Google page is opened!!!");
        sleep(3000);
    }

}
