package com.sim.selenium.pages;

import static com.codeborne.selenide.Selenide.open;

public class DownloadPage {
    String url = "https://www.selenium.dev/downloads/";
    public String headerLocator = ".display-1";
    public DownloadPage openPage() {
        open(url);
        return this;
    }


}
