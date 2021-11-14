package com.sim.selenium;

import com.codeborne.selenide.Condition;
import com.sim.selenium.pages.DownloadPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPageTests {
    DownloadPage downloadPage = new DownloadPage();
    String headerText = "Downloads";

    @Test
    void HeaderPageTest() {
        downloadPage.openPage();
        //Configuration.startMaximized = true;
        $(downloadPage.headerLocator).shouldHave(Condition.text(headerText));


    }
}
