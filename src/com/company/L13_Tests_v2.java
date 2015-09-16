package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L13_Tests_v2 {

    @Test
    public void Test0 (){
        getMaster("abcdef",cdrv);
        getSite("testlogin",cdrv);
        genByButton(cdrv);
        System.out.println(getPassword(cdrv));
    }
    @Test
    public void Test1 (){
        getMaster("master", cdrv);
        getSite("google.com", cdrv);
        genByButton(cdrv);
        System.out.println(getPassword(cdrv));
    }
    @Test
    public void Test2 (){
        getMaster("hello", cdrv);
        getSite("google.com", cdrv);
        genByButton(cdrv);
        System.out.println(getPassword(cdrv));
    }

    @Test
    public void Test3 (){
        getMaster("qwe123", cdrv);
        getSite("gmail.com", cdrv);
        genByEnter(cdrv);
        slp(2);
        Assert.assertEquals("mKJAakDvwbhi6@1a", getPassword(cdrv));
    }

    @Test
    public void Test4 (){
        getMaster("qwe123", cdrv);
        getSite("gmail.com", cdrv);
        genByButton(cdrv);
        slp(2);
        Assert.assertEquals("mKJAakDvwbhi6@1a", getPassword(cdrv));
    }

    @Test
    public void Test5 (){
        getMaster("", cdrv);
        getSite("", cdrv);
        genByButton(cdrv);
        slp(2);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", getPassword(cdrv));
    }

    @Test
    public void Test6 (){
        getMaster(multi("a", 200), cdrv);
        getSite(multi("b",200), cdrv);
        genByButton(cdrv);
        slp(2);
        Assert.assertEquals("bBALI0mG3K0AL@1a", getPassword(cdrv));
    }

    @Test
    public void Test7 (){
        getMaster("", cdrv);
        getSite("", cdrv);
        cdrv.findElement(By.cssSelector("[name='password']")).sendKeys(Keys.ENTER);
        slp(2);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", getPassword(cdrv));
    }

    @Test
    public void Test8 (){
        getMaster("333", cdrv);
        getSite("111", cdrv);
        genByButton(cdrv);
        slp(2);
        Assert.assertEquals("CD/iUTsNwzV4v@1a", getPassword(cdrv));
    }

    @Test
    public void Test9 (){
        getMaster("111", cdrv);
        getSite("333", cdrv);
        genByButton(cdrv);
        slp(2);
        Assert.assertEquals("A61tAOVfX4wCm@1a", getPassword(cdrv));
    }

    @Test
    public void Test10 (){
        getMaster("111", cdrv);
        getSite("333", cdrv);
        genByButton(cdrv);
        slp(2);
        Assert.assertEquals("A61tAOVfX4wCm@1a", getPassword(cdrv));
    }

    @Test
    public void Test11 (){
        getMaster("qwe123", cdrv);
        getSite("asd", cdrv);
        genByButton(cdrv);
        slp(2);
        Assert.assertEquals("agdjoTB4cjI5E@1a", getPassword(cdrv));
    }

    @Test
    public void Test12 (){
        getMaster("qwe123", cdrv);
        getSite("ASD", cdrv);
        genByButton(cdrv);
        slp(2);
        Assert.assertEquals("FkfaCm2ddwvDg@1a", getPassword(cdrv));
    }

    public static void getMaster(String valuePwd, WebDriver drv){
        WebElement masterPwd = drv.findElement(By.cssSelector("[name='master']"));
        masterPwd.sendKeys(valuePwd);
    }

    public static void getSite(String valueSite,WebDriver drv){
        WebElement masterPwd = drv.findElement(By.cssSelector("[name='site']"));
        masterPwd.sendKeys(valueSite);
    }

    public static void genByButton (WebDriver drv){
        WebElement button = drv.findElement(By.cssSelector("[type='submit']"));
        button.click();
    }

    public static void genByEnter (WebDriver drv){
        WebElement masterPwd = drv.findElement(By.cssSelector("[name='site']"));
        masterPwd.sendKeys(Keys.ENTER);
    }

    public static String getPassword(WebDriver drv){
        WebElement resultPwd = drv.findElement(By.cssSelector("[name='password']"));
        return resultPwd.getAttribute("value");
    }

    public static String multi(String ss, int timez){
        String ssLong="";
        for (int i=0;i<timez;i++){
            ssLong+="a";
        }
        return ssLong;
    }

    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void initDrv (){
        String siteLink = "http://angel.net/~nic/passwd.current.html";
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        cdrv=new ChromeDriver();
        cdrv.get(siteLink);
    }

    @After
    public void ending(){
        cdrv.quit();
    }

    public WebDriver cdrv;
}
