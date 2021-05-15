package com.akbank.tests;

import com.akbank.pages.*;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class akbankCase extends TestBase{


    @Test
    public void test1 () throws InterruptedException {

        //Scroll down to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");

        BasePage basePage= new BasePage();

        basePage.tutar.clear();
        basePage.tutar.sendKeys("50000");

        basePage.sigortasız.click();

        basePage.setVade(20);

        basePage.hesaplamaDetay.click();

        js.executeScript("window.scrollBy(0,500)");

        Assert.assertTrue(basePage.masrafMaliyet.isDisplayed());

        basePage.odemePlani.click();

        Assert.assertTrue(basePage.odemePlaniTablo.isDisplayed());

        //Scroll down on the “Ödeme Planı” page until 20th is seen
        WebElement scroll = basePage.odemePlaniTablo;
        scroll.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        scroll.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);

    }
}
