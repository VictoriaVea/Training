package com.company;

import static com.company.L13.*;

import org.junit.Assert;
import org.junit.Test;

public class L13_Tests {
    String siteLink = "http://angel.net/~nic/passwd.current.html";
    @Test
    public void Test0 (){
        L13.initDrv(siteLink);
        L13.getMaster("abcdef");
        L13.getSite("testlogin");
        L13.genByButton();
        System.out.println(L13.getPassword());
        L13.cdrv.quit();
    }
    @Test
    public void Test1 (){
        L13.initDrv(siteLink);
        L13.getMaster("master");
        L13.getSite("google.com");
        L13.genByButton();
        System.out.println(L13.getPassword());
        L13.cdrv.quit();
    }
    @Test
    public void Test2 (){
        initDrv(siteLink);
        getMaster("hello");
        getSite("google.com");
        genByButton();
        System.out.println(getPassword());
        cdrv.quit();
    }

    @Test
    public void Test3 (){
        L13.initDrv(siteLink);
        L13.getMaster("qwe123");
        L13.getSite("gmail.com");
        L13.genByEnter();
        L13.slp(2);
        Assert.assertEquals("mKJAakDvwbhi6@1a", L13.getPassword());
        L13.cdrv.quit();
    }

    @Test
    public void Test4 (){
        L13.initDrv(siteLink);
        L13.getMaster("qwe123");
        L13.getSite("gmail.com");
        L13.genByButton();
        L13.slp(2);
        Assert.assertEquals("mKJAakDvwbhi6@1a",L13.getPassword());
        L13.cdrv.quit();
    }
}
