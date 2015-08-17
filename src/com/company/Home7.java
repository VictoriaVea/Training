package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vea on 18.08.2015.
 */
public class Home7 {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
            ChromeDriver drv = new ChromeDriver();
            drv.get("https://stage.tether.to");
            System.out.println(drv.getTitle());

        }

        public static void slp(long sec){
            try {
                Thread.sleep(sec*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


