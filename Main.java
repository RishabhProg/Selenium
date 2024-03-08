package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\web\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Amazon website
            driver.get("https://www.youtube.com/");

            // Find the search input field by ID and enter "toys"
            WebElement searchInput = driver.findElement(By.name("search_query"));
            searchInput.sendKeys("weekend");

            // Press Enter to perform the search
            searchInput.sendKeys(Keys.RETURN);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the third video link to be clickable



            WebElement thirdVideoLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#contents ytd-video-renderer:nth-child(2) #video-title")));

            // Find and click on the third video link
            thirdVideoLink.click();

            String videoUrl = thirdVideoLink.getAttribute("href");

            // Open the video URL
            driver.get(videoUrl + "&t=60s");




            // Wait for the search results page to load (you may need to adjust the sleep time)
            Thread.sleep(5000);
            WebElement playButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ytp-play-button")));
            playButton.click();
            driver.findElement(By.id("guide-button")).click();

            Thread.sleep(5000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
            //  driver.quit();
        }
    }
}
