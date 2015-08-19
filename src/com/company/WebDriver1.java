package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriver1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        ChromeDriver drv = new ChromeDriver();

        drv.get("http://google.com");

        System.out.println(drv.getTitle());

        WebElement j = drv.findElementByName("q");
        j.sendKeys("котята");
        j.sendKeys(Keys.ENTER);

        drv.findElementByName("btnG").click();

        System.out.println(j.getAttribute("value"));

        slp(3);

        List<WebElement> res = drv.findElementsByTagName("a");
        for (WebElement w : res) {
            System.out.println(w.getText());
        }

        slp(2);

        drv.quit();
    }

    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}