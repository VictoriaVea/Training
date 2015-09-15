package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**

 */
public class L13 {

    public static WebDriver cdrv;
    public static String siteLink = "http://angel.net/~nic/passwd.current.html";
/**
    public static void main(String[] args) {
        //WebDriver initialization is here.
        initDrv(siteLink);
        getMaster("abcdef");
        getSite("testlogin", cdrv);
        generate(cdrv);
        System.out.println(getPassword(cdrv));
        cdrv.quit();
    }**/

    public static void initDrv (String siteLink){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        cdrv=new ChromeDriver();
        cdrv.get(siteLink);
    }

    public static void getMaster(String valuePwd){
        WebElement masterPwd = cdrv.findElement(By.cssSelector("[name='master']"));
        masterPwd.sendKeys(valuePwd);
    }

    public static void getSite(String valueSite, WebDriver drv){
        WebElement masterPwd = drv.findElement(By.cssSelector("[name='site']"));
        masterPwd.sendKeys(valueSite);
    }

    public static void generate (WebDriver drv){
        WebElement button = drv.findElement(By.cssSelector("[type='submit']"));
        button.click();
    }

    public static String getPassword(WebDriver drv){
        WebElement resultPwd = drv.findElement(By.cssSelector("[name='password']"));
        return resultPwd.getText();
    }

    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
