package com.akbank.pages;

import com.akbank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(id = "t-credit-price")
    public WebElement tutar;

    @FindBy(xpath = "(//label[@for='insuredType2'])[1]")
    public WebElement sigortasız;

    @FindBy(xpath = "//*[@class='step-btn decrease']")
    public WebElement vade;

    @FindBy(xpath = "//*[@data-function='calculate']")
    public WebElement hesaplamaDetay;

    @FindBy(xpath = "//*[@aria-labelledby='accordion1']")
    public WebElement masrafMaliyet;

    @FindBy(id = "accordion2")
    public WebElement odemePlani;

    @FindBy(id = "content-2")
    public WebElement odemePlaniTablo;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void setVade(int month){
        for (int i = 0; i < (36-month)/2; i++) {
            vade.click();
        }
    }

}
