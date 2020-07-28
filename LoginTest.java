package com.testinium.aysu;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest extends MainTest{


    @Test
    public void loginTest(){

        driver.get("https://www.gittigidiyor.com/uye-girisi");
        driver.findElement(By.id("L-UserNameField")).sendKeys("aysu");
        driver.findElement(By.id("L-PasswordField")).sendKeys("123456");
        driver.findElement(By.id("gg-login-enter")).click();


    }

    @Test
    public void login2Test(){

        getURL("https://www.gittigidiyor.com/uye-girisi");
        setById("L-UserNameField", "aysu");
        setById("L-PasswordField", "123456");
        clickById("gg-login-enter");

    }

@Test
public void searchTest(){

    System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\Downloads\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();


    driver.get("https://www.gittigidiyor.com");

    driver.findElement(By.id("search_word")).sendKeys("iphone 11 pro max");
    driver.findElement(By.id("textSearch_ara")).click();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("search_word")));
    element.sendKeys("");
    driver.quit();
    }

    }


