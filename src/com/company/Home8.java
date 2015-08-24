package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vea on 24.08.2015.
 */
public class Home8 {

   /** 1. Открьій сайт https://stage.tether.to
            2. Заполнить в логин пустую строку, и в пароль пустую строку
    3. Напечатать в консоль сообщение об ошибке от логина
    4. Нажать TAB в поле пароля
    5. Напечатать в консоль сообщение об ошибке от пароля
    6. Заполнить пароль строкой "asd"
            7. Напечатать в консоль сообщение об ошибке от пароля (должно бьіть другое)
    8. Дописать в пароль еще "fff"
            9. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 5 и 7. (findElements .... .size())
            10. Заполнить в логин "a"
            11. Напечатать в консоль сообщение об ошибке от логина
    12. Дописать в логин "qwe"
            13. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 3 и 11. (findElements .... .size())
            14. Нажать Log In
    **/

   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
       WebDriver drv = new ChromeDriver();
       drv.get("https://stage.tether.to");
       String pLogin="//md-input-container[label[@for='login']]/input[@type='text']";
       String pPwd="//md-input-container/input[@type='password']";
       String pLoginError="//md-input-container[label[@for='login']]/child::div[@ng-messages]";
       String pPwdError="//md-input-container[label[@for='password']]/child::div[@ng-messages]";
       String button="//form/button[contains (@class,'submit-btn')]";
       WebElement login=findElement(pLogin, drv);
       login.sendKeys("");
       WebElement pwd = findElement(pPwd,drv);
       pwd.sendKeys("");
       WebElement error = findElement(pLoginError,drv);
       System.out.println(error.getText());
       pwd.sendKeys(Keys.TAB);
       error = findElement(pPwdError,drv);
       System.out.println(error.getText());
       pwd.sendKeys("asd");
       slp(1);
       error = findElement(pPwdError,drv);
       System.out.println(error.getText());
       pwd.sendKeys("fff");
       slp(1);
       error = findElement(pPwdError,drv);

       List <WebElement> allPwdErrors=drv.findElements(By.xpath(pPwdError));
       System.out.println(allPwdErrors.size());

       login.sendKeys("a");
       login.sendKeys(Keys.TAB);
       slp(1);
       error = findElement(pLoginError,drv);
       System.out.println(error.getText());
       login.sendKeys("qwe");
       List <WebElement> allLoginErrors=drv.findElements(By.xpath(pLoginError));
       System.out.println(allLoginErrors.size());

       WebElement wButton=drv.findElement(By.xpath(button));
       wButton.click();
       slp(2);

    drv.quit();
   }

    public static WebElement findElement(String targetXPath, WebDriver wdr) {
        for (int i = 0; i < 600; i++)
        {
            if (wdr.findElements(By.xpath(targetXPath)).size() > 0)
            {
                break;
            }
            slp(100);
        }
        return wdr.findElement(By.xpath(targetXPath));
    }

    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
