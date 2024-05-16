package test;

import com.codeborne.selenide.Selenide;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class FirstTest {
    @Test(groups = {"release"})
    public void firstTest(){
        Selenide.open("https://the-internet.herokuapp.com/");
    }
}
