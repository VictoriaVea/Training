package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        getSite("testlogin");
        generate();
        System.out.println(getPassword());
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

    public static void getSite(String valueSite){
        WebElement masterPwd = cdrv.findElement(By.cssSelector("[name='site']"));
        masterPwd.sendKeys(valueSite);
    }

    public static void genByButton (){
        WebElement button = cdrv.findElement(By.cssSelector("[type='submit']"));
        button.click();
    }

    public static void genByEnter (){
        WebElement masterPwd = cdrv.findElement(By.cssSelector("[name='site']"));
        masterPwd.sendKeys(Keys.ENTER);
    }

    public static String getPassword(){
        WebElement resultPwd = cdrv.findElement(By.cssSelector("[name='password']"));
        return resultPwd.getAttribute("value");
    }

    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
