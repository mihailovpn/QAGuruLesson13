package com.sim.selenium;

import com.codeborne.selenide.Condition;
import com.sim.selenium.pages.DownloadPage;
import com.sim.selenium.pages.MainPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPageTests extends TestBase {
    DownloadPage downloadPage = new DownloadPage();
    MainPage mainPage = new MainPage();
    String headerText = "Downloads";


    @Test
    void HeaderPageTest() {
        downloadPage.openPage();
        $(downloadPage.headerLocator).shouldHave(Condition.text(headerText));
    }

    @Test
    void MainPageButtonTest() {
        downloadPage.openPage();
        downloadPage.clickBrowserSupportButton();
    }

    @Test
    void SupportedBrowsersButtonTest() {
        downloadPage.openPage();
        downloadPage.clickMainPageButton();
        $(mainPage.mainPageLogoLocator).should(Condition.text(mainPage.mainPageLogoText));
    }


}
