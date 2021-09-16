package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CatsSearch {
    private WebDriver driver;

    CatsSearch(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterText(String text)
    {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(text, Keys.ENTER);
    }

    public void open()
    {
        driver.get("https://www.google.com");
    }

    public void setTimeoutInSeconds(int seconds)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public boolean atPage()
    {
        if(driver.getTitle().equals("Google"))
            return true;
        else
            return false;
    }
}
