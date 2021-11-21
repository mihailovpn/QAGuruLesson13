package com.sim.selenium.pages;

import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownloadPage {
    String url = "https://www.selenium.dev/downloads/";
    public String headerLocator = ".display-1";
    public String supportedBrowserLocator = ".btn-dark";
    public String supportBrowserButtonName = "\n" +
            "Browsers";
    public String SeleniumLogoLocator = "#selenium_logo";

    public DownloadPage openPage() {
        open(url);
        return this;
    }

    public  DownloadPage clickBrowserSupportButton () {
        $(supportedBrowserLocator).click();
        return this;
    }

    public  DownloadPage clickMainPageButton () {
        $(SeleniumLogoLocator).click();
        return this;
    }

}
