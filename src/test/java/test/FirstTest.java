package test;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void firstTest(){
        Selenide.open("https://the-internet.herokuapp.com/");
    }
}
