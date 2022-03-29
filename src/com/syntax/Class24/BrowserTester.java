package com.syntax.Class24;

public class BrowserTester {
    public static void main(String[] args) {
        /*
        GoogleChrome chrome=new GoogleChrome();
        chrome.openBrowser();
        chrome.loadPage("www.google.com");
        chrome.testThePage();
        chrome.closeBrowser();

        FireFox firefox=new FireFox();
        firefox.openBrowser();
        firefox.loadPage("www.google.com");
        firefox.testThePage();
        firefox.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.loadPage("www.google.com");
        safari.testThePage();
        safari.closeBrowser();

        IE ie=new IE();
        ie.openBrowser();
        ie.loadPage("www.google.com");
        ie.testThePage();
        ie.closeBrowser();
         */

        Browser[] browsers={new GoogleChrome(),new FireFox(),new Safari(),new IE()};

        for(Browser b: browsers){
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }

    }
}
