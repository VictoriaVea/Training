package com.company;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class L12 {
        @Test
        public void t1() {
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
            ChromeDriver drv = new ChromeDriver();

            drv.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");

            /** System.out.println(drv.getTitle());

            WebElement j = drv.findElementByName("q");
            j.sendKeys("котята");
            j.sendKeys(Keys.ENTER);

            drv.findElementByName("btnG").click();

            System.out.println(j.getAttribute("value"));

            slp(3);

            List<WebElement> res = drv.findElementsByTagName("a");
            for (WebElement w : res) {
                System.out.println(w.getText());
            }**/
            String xList="//*[@id='ts_type']";
            WebElement firstList = drv.findElement(By.xpath(xList));

            Select sel = new Select(firstList);
            System.out.println(sel.getFirstSelectedOption().getText());
            /**List <WebElement> fullOpts = sel.getOptions();
             for(WebElement a:fullOpts){
                 System.out.println(a.getText());
             }**/
            sel.selectByVisibleText("прицеп");

            new Select(drv.findElement(By.xpath("//*[@id='ts_details_type']"))).selectByIndex(1);
            new Select(drv.findElement(By.xpath("//*[@id='ts_zone']"))).selectByIndex(2);
            new Select(drv.findElement(By.xpath("//*[@id='no_crash_years_qty']"))).selectByIndex(3);
            new Select(drv.findElement(By.xpath("//*[@id='period']"))).selectByIndex(3);
            new Select(drv.findElement(By.xpath("//*[@id='dgo']"))).selectByIndex(4);

            System.out.println(new Random().ints(0, sel.getOptions().size()).findAny().getAsInt());

            slp(5);

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
