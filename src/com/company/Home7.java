package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

        //8. ?????????? ? ??????? ?????? ??????? ????????? ????? ??????? ????.

public class Home7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        WebDriver drv = new ChromeDriver();
        drv.get("https://stage.tether.to");
        System.out.println(drv.getTitle());

        drv.findElement(By.xpath("//div[@class='signup-link']/a")).click();
        slp(3);

        System.out.println(drv.findElement(By.xpath("//form[@name='inviteForm']//label")).getText());

        drv.findElement(By.xpath("//form[@name='inviteForm']/div[@class='text-center']/a")).click();
        slp(3);

        List<WebElement> formResults = drv.findElements(By.xpath("//md-input-container[input[@type]]/label"));
        for (WebElement res:formResults){
            System.out.println(res.getText());
        }

        List<WebElement> inputFields = drv.findElements(By.xpath("//md-input-container/input[@type]"));
        for (int i=0;i<3;i++){
            WebElement field=inputFields.get(i);
            field.sendKeys("NewField");
            field.sendKeys(Keys.TAB);
        }

        slp(3);

        WebElement error1=drv.findElement(By.xpath("//md-input-container[input[@name='inviteCode']]/div[@ng-messages='signupForm.inviteCode.$error']/div"));

        System.out.println(error1.getText());

        drv.quit();

        }

        public static void slp(long sec){
            try {
                Thread.sleep(sec*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }


