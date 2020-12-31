package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Matthias Veelaert r0704252 & Younes Mounnadi r0786792;
 * */

public abstract class Page {

    WebDriver driver;
    String path = "http://localhost:8081/Web3_YounesMounnadi_war_exploded/Controller";

    public Page (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getPath() {
        return path;
    }

    public String getTitle () {
        return driver.getTitle();
    }

    public boolean containsStatusMessageWithText(String text) {
        WebElement statusMessage = this.driver.findElement(By.id("statusMessage")).findElement(By.tagName("p"));
        return statusMessage.getText().equals(text);
    }
}