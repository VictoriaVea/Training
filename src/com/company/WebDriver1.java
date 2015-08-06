package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        ChromeDriver wd1 = new ChromeDriver();
        wd1.get("http:\\google.com");
        System.out.println(wd1.getTitle());
        WebElement j = wd1.findElementByName("q");
        j.sendKeys("котята");
        /* j.sendKeys(Keys.ENTER);   */
        wd1.findElementByName("btnG").click();

        slp(2);
        wd1.quit();
    }

    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
