package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        List<WebElement> list= driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        for(WebElement l:list){
            System.out.println(l.getText());
        }




    }
}
