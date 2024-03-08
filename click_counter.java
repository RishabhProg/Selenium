package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class click_counter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.get("https://www.rapidtables.com/tools/click-counter.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(By.id("addbtn")));
        //  for(int i=0;i<100;i++){
        //      btn.click();}
        driver.get("https://www.youtube.com/watch?v=kGDRoPlSbwA");
        WebElement side=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='start']//button[@id='button']//div")));
        side.click();
        // WebElement side2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/tp-yt-app-drawer[1]/div[2]/div[1]/div[2]/div[2]/ytd-guide-renderer[1]/div[1]/ytd-guide-section-renderer[1]/div[1]/ytd-guide-entry-renderer[1]/a[1]/tp-yt-paper-item[1]")));
        //   side2.click();
        WebElement sd=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/ytd-app/div[@id='content']/tp-yt-app-drawer[@id='guide']/div[@id='contentContainer']/div[@id='guide-wrapper']/div[@id='guide-content']/div[@id='guide-inner-content']/ytd-guide-renderer[@id='guide-renderer']/div[@id='sections']/ytd-guide-section-renderer[1]/div[1]/ytd-guide-entry-renderer[1]/a[1]/tp-yt-paper-item[1]")));
        sd.click();


    }
}
