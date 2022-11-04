package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
    WebDriver driver = new ChromeDriver();
    // Locators
    private By lkCreateAnAccount = By.xpath("//div[@id='content']//a[@href='/Account/Register.cshtml']");

    // Elements
    private WebElement getLkCreateAnAccount(){
        return driver.findElement(lkCreateAnAccount);
    }

    // Methods
    public void accessRegisterPage(){
//        clickOnLink();
    }
}
