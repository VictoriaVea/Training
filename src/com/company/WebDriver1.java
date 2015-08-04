package com.company;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        ChromeDriver wd1 = new ChromeDriver();
        wd1.get("http:\\google.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wd1.quit();
    }
}
