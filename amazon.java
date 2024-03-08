package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        String url= driver.getCurrentUrl();
        String act_url="https://www.amazon.in/";
        System.out.println(url);

        if(url.equals(act_url)) {
            try {
                // Navigate to Amazon


                // Find the search input field by ID and enter "speakers"
                WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
                searchInput.sendKeys("tribit speaker");

                // Press Enter to perform the search
                searchInput.sendKeys(Keys.RETURN);

                // Use WebDriverWait with increased Duration for better synchronization
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

                // Wait for the third item in the search results to be clickable
                //      WebElement thirdItem = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".s-main-slot .s-result-item:nth-child(3)")));
                //      thirdItem.click();
                Thread.sleep(5000);
                driver.findElement(By.linkText("Tribit MaxSound Plus 24W Bluetooth Wireless Speakers,Powerful Louder Sound&Exceptional XBass(Independent XBass Button),Built in Mic,IPX7 Waterproof,20H Playtime,100ft BT Range for Party/Travel,Black")).click();


                // Store all currently open tabs/windows
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

                // Switch to the new tab (which is the second tab in the list)
                driver.switchTo().window(tabs.get(1));

                // Wait for the "Buy Now" button to be clickable
                WebElement buyNowButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#buy-now-button")));
                buyNowButton.click();


                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));

                // Enter email and password to sign in
                WebElement emailInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_email")));
                emailInput.sendKeys("8904534938");//enter real email or number
                emailInput.submit();

                WebElement passwordInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_password")));
                passwordInput.sendKeys("xxxxxxx");//enter real password
                passwordInput.submit();

                // Click on the sign-in button


                WebElement radio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[6]/div/div[3]/div/div/div[2]/div/div[2]/div/div/form/div/div[1]/div/div[2]/div[6]/div/div/div/div/div[1]/div/label/input")));
                radio.click();


                // Optionally, you can add more interactions (e.g., handling login, address, etc.) based on your needs

                // Wait for a few seconds (you may need to adjust the sleep time)
                Thread.sleep(5000);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //  driver.quit();
            }
        }
        else{
            System.out.println("failed !");
        }
    }

}
