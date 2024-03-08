package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\web\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        String act_url=driver.getTitle();
        String desired_title="YouTube";
        if(act_url.equals(desired_title)){
            System.out.println("success");
        }else {
            System.out.println("failed!");
        }
    }
}
