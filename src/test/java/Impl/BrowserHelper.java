package Impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Impl.Implementatie;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BrowserHelper {
    private WebDriver webDriver;
    private WebDriverWait wait;
    private WebDriverWait waitlong;


    BrowserHelper(){

        String os = System.getProperty("os.name");
        if("Mac OS X".equals(os)) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//"c:/cucumberproject/chromedriver.exe");

        }
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver,10);
        waitlong = new WebDriverWait(webDriver,20);
    }

    public void gaNaarUrl(String s) {
        webDriver.navigate().to(s);

    }

    public void klikelement(String s) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
        webDriver.findElement(By.xpath(s)).click();
    }

    public void klikelementcss(String s) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(s)));
        webDriver.findElement(By.cssSelector(s)).click();
    }
    public void assertion(String s){
        Assert.assertTrue("cars input field not loaded",webDriver.findElement(By.cssSelector(s))!=null);
    }
    public void typetekst(String s, String input){
        webDriver.findElement(By.xpath(s)).sendKeys(input);
    }

    public void typetekstcss(String s, String input){
        webDriver.findElement(By.cssSelector(s)).sendKeys(input);
    }
    public void klikindropdown(String s){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(s)));
        webDriver.findElement(By.cssSelector(s)).click();
    }

    public void klikindropdownxpath(String s) {
            WebElement divClick = webDriver.findElement(By.xpath(s));
            divClick.click();

    }
//    public action extends AbstractAction;
////    Actions actions = new Actions(webDriver);
////    actions.moveToElement(element);
////    actions.click();
////    actions.sendKeys("SOME DATA");
////    actions.build().perform();

    public void selecteeroptie (String s, String input) {
        WebElement grab = webDriver.findElement(By.xpath(s));
        grab.sendKeys(input);
        webDriver.findElement(By.cssSelector("#select2-drop > ul > li > div > span")).click();

    }
    public void afsluiten() {
        webDriver.close();
    }

    }
