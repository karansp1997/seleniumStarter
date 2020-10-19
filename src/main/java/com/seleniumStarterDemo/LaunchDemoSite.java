package com.seleniumStarterDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDemoSite {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karan\\IdeaProjects\\seleniumStarter\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/");

        Thread.sleep(2000);
        WebElement lnk_signUp = driver.findElement(By.xpath("//a[text()='Sign up']"));
        lnk_signUp.click();

        Thread.sleep(2000);
        WebElement input_userName = driver.findElement(By.xpath("//input[@id='sign-username']"));
        input_userName.click();
        input_userName.clear();
        input_userName.sendKeys("admin0891");

        Thread.sleep(2000);
        WebElement input_password = driver.findElement(By.xpath("//input[@id='sign-password']"));
        input_password.click();
        input_password.clear();
        input_password.sendKeys("admin0891");

        Thread.sleep(3000);
        WebElement btn_signUp = driver.findElement(By.xpath("//button[text()='Sign up']"));
        btn_signUp.click();

        Thread.sleep(2000);
        driver.quit();


    }

}
